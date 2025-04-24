package com.personaltraining.personaltrainingapplication;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    private final ChatModel chatModel;

    public WorkoutService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String generateWorkoutPlan(String userRequest) {
        try {
            String systemPrompt = """
                You are a professional fitness trainer. Generate a detailed workout routine based on the user's request.
                Include exercises, sets, reps, and rest periods. Format the response clearly with sections for each day.
                Ensure the plan is safe, practical, and tailored to the request.
                """;
            Prompt prompt = new Prompt(systemPrompt + "\nUser request: " + userRequest);
            var response = chatModel.call(prompt);
            if (response == null || response.getResult() == null || response.getResult().getOutput() == null) {
                throw new RuntimeException("Invalid response from chat model");
            }
            return response.getResult().getOutput().getText();
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate workout plan: " + e.getMessage(), e);
        }
    }
}
