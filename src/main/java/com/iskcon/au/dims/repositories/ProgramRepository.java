package com.iskcon.au.dims.repositories;

import com.iskcon.au.dims.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProgramRepository extends JpaRepository<Program, Integer>, JpaSpecificationExecutor<Program> {

}