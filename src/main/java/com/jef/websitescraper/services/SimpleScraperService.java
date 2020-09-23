package com.jef.websitescraper.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SimpleScraperService {

    public String getWebsiteString(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String title = doc.title();

        return title;
    }

}
