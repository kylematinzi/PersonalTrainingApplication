package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientHomePageController {

    @GetMapping("/clientHomePage")
    public String clientHomePage(){ return "clientHomePage"; }
}
