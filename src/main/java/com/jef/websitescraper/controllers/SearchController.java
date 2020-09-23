package com.jef.websitescraper.controllers;

import com.jef.websitescraper.services.SimpleScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    SimpleScraperService simpleScraperService;

    @PostMapping(value = "/website", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getBasicInfo(@RequestBody Map<String, String> websiteArg) throws IOException {
        String title = simpleScraperService.getWebsiteString(websiteArg.get("url"));

        return new ResponseEntity<>(title, HttpStatus.OK);
    }

}
