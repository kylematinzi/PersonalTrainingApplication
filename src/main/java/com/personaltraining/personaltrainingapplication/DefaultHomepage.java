package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultHomepage {

    @GetMapping("/")
    public String homePage(){ return "defaultHomePage"; }

    @GetMapping("/defaultHomepage")
    public String defaultHomepage(){ return "defaultHomepage"; }
}
