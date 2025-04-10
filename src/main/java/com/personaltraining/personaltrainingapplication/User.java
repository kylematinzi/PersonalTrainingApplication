package com.personaltraining.personaltrainingapplication;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private int userID;

    public User(){

    }

    public User(String firstName, String lastName, int userId, String password ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userId;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "User name: " + firstName + " " + lastName;
    }
}
