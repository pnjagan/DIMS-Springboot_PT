package com.iskcon.au.dims.service;



import com.iskcon.au.dims.domain.Member;
import com.iskcon.au.dims.repositories.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private MemberRepository memberRepository;

    @Override
	public List<com.iskcon.au.dims.domain.Member> getMembers(){
        List<com.iskcon.au.dims.domain.Member> domMembers = new ArrayList<>();
        List<com.iskcon.au.dims.entities.Member> entMembers =  memberRepository.findAll(Sort.by("memberId").ascending());

        entMembers.forEach(member -> {
                domMembers.add(mapper.map(member, com.iskcon.au.dims.domain.Member.class ));
        });
        return domMembers;
    }

    @Override
    public void saveMember(Member member) {
        memberRepository.save(mapper.map(member,com.iskcon.au.dims.entities.Member.class));
    }


    public List<com.iskcon.au.dims.domain.Member> findMembersByCriteria(String criteria, String value) {

        List<com.iskcon.au.dims.domain.Member> domMembers = new ArrayList<>();
        List<com.iskcon.au.dims.entities.Member> entMembers = new ArrayList<>();


        if("FIRST_NAME".equals(criteria)) {
            entMembers = memberRepository.findMembersByFirstName(value, Sort.by("memberId").descending());
            entMembers.forEach(member -> {
                domMembers.add(mapper.map(member, com.iskcon.au.dims.domain.Member.class ));
            });

            return domMembers;
        } else {
            throw new RuntimeException("Not a valid find criteria");
        }
    }


}
