package com.personaltraining.personaltrainingapplication;

public class Client extends User {
    //Client stats
    private int age;
    private int weight;
    private int height;
    private char gender; // M or F
    private int bodyFatPercent;
    private int Bmi;


    public Client(String firstName, String lastName, int userId, String password, int age, int weight, int height,
                  char gender, int bodyFatPercent, int Bmi) {
        super(firstName, lastName, userId, password);
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.bodyFatPercent = bodyFatPercent;
        this.Bmi = Bmi;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBodyFatPercent() {
        return bodyFatPercent;
    }

    public void setBodyFatPercent(int bodyFatPercent) {
        this.bodyFatPercent = bodyFatPercent;
    }

    public int getBmi() {
        return Bmi;
    }

    public void setBmi(int bmi) {
        Bmi = bmi;
    }
}
