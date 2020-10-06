package com.iskcon.au.dims.controller;

import com.iskcon.au.dims.domain.Member;

import com.iskcon.au.dims.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MemberController {

    @Autowired
    private MemberService memberService;

    //@TODO need to include Spring Boot validation from below link in the next iteration.
    //https://www.baeldung.com/spring-boot-bean-validation

    //Pagination?
    @RequestMapping("/members")
    public ResponseEntity getMembers() {
        //Exception handling
        return ResponseEntity.status(HttpStatus.OK).body(memberService.getMembers());
    }

    @RequestMapping("/findMembers")
    public ResponseEntity findMembers(@RequestParam String criteria , @RequestParam String value) {
        //Exception handling
        return ResponseEntity.status(HttpStatus.OK).body(memberService.findMembersByCriteria(criteria,value));
    }

    @PostMapping("/saveMember")
    public ResponseEntity  saveMember(@RequestBody Member member) {
        memberService.saveMember(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }


    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody
    public String getAppStartMessage() {
        return "{message: \"App is running \"}";
    }


}
