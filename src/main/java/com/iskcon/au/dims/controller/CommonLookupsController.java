package com.iskcon.au.dims.controller;

import com.iskcon.au.dims.domain.CommonLookups;
import com.iskcon.au.dims.domain.Member;
import com.iskcon.au.dims.service.CommonLookupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommonLookupsController {

    @Autowired
    private CommonLookupsService lookupService;

    @RequestMapping("/lookups")
    public ResponseEntity getLookups() {
        //Exception handling
        return ResponseEntity.status(HttpStatus.OK).body(lookupService.getLookups());
    }

    @RequestMapping("/findLookups")
    public ResponseEntity findLookups(@RequestParam String criteria , @RequestParam String type) {
        //Exception handling
        return ResponseEntity.status(HttpStatus.OK).body(lookupService.findLookupByType(type));
    }

    @PostMapping("/saveLookup")
    public ResponseEntity  saveLookup(@RequestBody CommonLookups lookup) {
        lookupService.saveLookup(lookup);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
}
