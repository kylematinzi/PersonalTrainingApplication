package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerHomePageController {

    @GetMapping("/managerHomePage")
    public String managerHomePage(){ return "managerHomePage"; }
}
