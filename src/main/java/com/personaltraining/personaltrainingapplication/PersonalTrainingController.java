package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalTrainingController {

    @GetMapping("/")
    public String homePage(){ return "defaultHomePage"; }

//    @GetMapping("/journal")
//    public String journal(){ return "journal"; }

    @GetMapping("/trainerHomePage")
    public String trainerHomePage(){ return "trainerHomePage"; }

    @GetMapping("/clientHomePage")
    public String clientHomePage(){ return "clientHomePage"; }

    @GetMapping("/managerHomePage")
    public String managerHomePage(){ return "managerHomePage"; }

    @GetMapping("/aiGeneratedWorkoutPage")
    public String aiGeneratedWorkout(){ return "aiGeneratedWorkoutPage"; }

    @GetMapping("/defaultHomepage")
    public String defaultHomepage(){ return "defaultHomepage"; }


}
