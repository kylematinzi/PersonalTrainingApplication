package com.personaltraining.personaltrainingapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AiGeneratedWorkoutController {

//    @GetMapping("/aiGeneratedWorkoutPage")
//    public String aiGeneratedWorkout(){ return "aiGeneratedWorkoutPage"; }

    private final WorkoutService workoutService;

    public AiGeneratedWorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping("/aiGeneratedWorkoutPage")
    public String aiGeneratedWorkout() {
        return "aiGeneratedWorkoutPage";
    }

    @PostMapping("/aiGeneratedWorkoutPage")
    public String generateWorkout(@RequestParam String request, Model model) {
        String workoutPlan = workoutService.generateWorkoutPlan(request);
        model.addAttribute("workoutPlan", workoutPlan);
        return "aiGeneratedWorkoutPage";
    }
}
