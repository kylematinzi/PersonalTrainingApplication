package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AiGeneratedWorkoutController {

    @GetMapping("/aiGeneratedWorkoutPage")
    public String aiGeneratedWorkout(){ return "aiGeneratedWorkoutPage"; }

}
