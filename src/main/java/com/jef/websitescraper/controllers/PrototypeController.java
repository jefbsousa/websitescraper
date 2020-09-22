package com.jef.websitescraper.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/prototype")
public class PrototypeController {

    @GetMapping("/test")
    protected  @ResponseBody String test(){
        return "test";
    }

    @PostMapping("test-post")
    protected @ResponseBody String testPost(@RequestBody Map<String, String> mapPost){
        return mapPost.get("name");
    }

}
