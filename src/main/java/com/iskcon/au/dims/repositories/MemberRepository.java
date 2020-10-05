package com.iskcon.au.dims.repositories;

import com.iskcon.au.dims.entities.Member;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer>, JpaSpecificationExecutor<Member> {

    @Query("select m from Member m where first_name like %?1%")
    List<com.iskcon.au.dims.entities.Member> findMembersByFirstName(String value, Sort sortCriteria);

    @Query("select m from Member m where last_name like %?1%")
    List<com.iskcon.au.dims.entities.Member> findMembersByLastName(String value);

}