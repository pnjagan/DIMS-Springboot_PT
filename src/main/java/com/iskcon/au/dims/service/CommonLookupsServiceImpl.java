package com.iskcon.au.dims.service;

import com.iskcon.au.dims.domain.CommonLookups;
import com.iskcon.au.dims.repositories.CommonLookupsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonLookupsServiceImpl implements CommonLookupsService{

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private CommonLookupsRepository lookupRepository;

    @Override
    public List<CommonLookups> getLookups() {

        List<com.iskcon.au.dims.domain.CommonLookups> domLookups = new ArrayList<>();
        List<com.iskcon.au.dims.entities.CommonLookups> entLookups = lookupRepository.findAll();

        entLookups.forEach(lookup -> {
            domLookups.add(mapper.map(lookup, com.iskcon.au.dims.domain.CommonLookups.class ));
        });
        return domLookups;
    }

    @Override
    public void saveLookup(CommonLookups lookupValue) {
        lookupRepository.save(mapper.map(lookupValue,com.iskcon.au.dims.entities.CommonLookups.class));
    }

    @Override
    public List<CommonLookups> findLookupByType(String type) {
       // return null;

        List<com.iskcon.au.dims.domain.CommonLookups> domLookups = new ArrayList<>();
        List<com.iskcon.au.dims.entities.CommonLookups> entLookups = new ArrayList<>();

        com.iskcon.au.dims.entities.CommonLookups lookupEx = new com.iskcon.au.dims.entities.CommonLookups();
        lookupEx.setLookupCode(type);

        Example<com.iskcon.au.dims.entities.CommonLookups> example = Example.of(lookupEx);

        entLookups = lookupRepository.findAll(example);

        //entLookups = lookupRepository.findOne(value, Sort.by("memberId").descending());
        entLookups.forEach(lookup -> {
            domLookups.add(mapper.map(lookup, com.iskcon.au.dims.domain.CommonLookups.class ));
        });

        return domLookups;

    }
}
