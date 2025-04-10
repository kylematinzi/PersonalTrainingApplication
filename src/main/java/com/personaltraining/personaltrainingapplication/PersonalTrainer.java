package com.personaltraining.personaltrainingapplication;

public class PersonalTrainer extends User{
    // Skill level could be Certified or Master trainer
    private String skillLevel;

    public PersonalTrainer(String firstName, String lastName, int userId, String passWord, String skillLevel) {
        super(firstName, lastName, userId, passWord);
        this.skillLevel = skillLevel;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}
