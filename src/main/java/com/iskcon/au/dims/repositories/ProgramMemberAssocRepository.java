package com.iskcon.au.dims.repositories;

import com.iskcon.au.dims.entities.ProgramMemberAssoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProgramMemberAssocRepository extends JpaRepository<ProgramMemberAssoc, Integer>, JpaSpecificationExecutor<ProgramMemberAssoc> {

}