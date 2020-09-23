package com.jef.websitescraper.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prototype")
public class PrototypeController {

    @GetMapping("/test")
    protected  @ResponseBody ResponseEntity<String> test(){
        return new ResponseEntity<>("test-rest" , HttpStatus.OK);
    }

}
