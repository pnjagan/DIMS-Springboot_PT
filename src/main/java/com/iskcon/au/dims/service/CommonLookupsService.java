package com.iskcon.au.dims.service;

import com.iskcon.au.dims.domain.CommonLookups;

import java.util.List;

public interface CommonLookupsService {
    public List<CommonLookups> getLookups();

    public void saveLookup(CommonLookups lookupValue);

    public List<com.iskcon.au.dims.domain.CommonLookups> findLookupByType(String type);

}
