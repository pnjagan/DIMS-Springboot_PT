package com.iskcon.au.dims.service;

import com.iskcon.au.dims.domain.Member;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



//@Service
public interface MemberService {

    public List<com.iskcon.au.dims.domain.Member> getMembers();

    public void saveMember(Member member);

    public List<com.iskcon.au.dims.domain.Member> findMembersByCriteria(String criteria, String value);




}