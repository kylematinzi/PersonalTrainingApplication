package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainerHomePageController {

    @GetMapping("/trainerHomePage")
    public String trainerHomePage(){ return "trainerHomePage"; }
}
