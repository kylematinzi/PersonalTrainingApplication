package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalTrainingController {

    @GetMapping("/journal")
    public String journal(){ return "journal"; }

    @GetMapping("/trainerHomePage")
    public String trainerHomePage(){ return "trainerHomePage"; }

    @GetMapping("/clientHomePage")
    public String clientHomePage(){ return "clientHomePage"; }

    @GetMapping("/managerHomePage")
    public String managerHomePage(){ return "managerHomePage"; }

    @GetMapping("/aiGeneratedWorkoutPage")
    public String aiGeneratedWorkout(){ return "aiGeneratedWorkoutPage"; }


}
