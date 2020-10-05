package com.iskcon.au.dims.repositories;

import com.iskcon.au.dims.entities.CommonLookups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommonLookupsRepository extends JpaRepository<CommonLookups, Integer>, JpaSpecificationExecutor<CommonLookups> {

}