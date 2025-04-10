package com.personaltraining.personaltrainingapplication;

public class Manager extends User{
    // Single location, District, Regional
    private String managementPosition;

    public Manager(String firstName, String lastName,int userId, String passWord, String managementPosition) {
        super(firstName, lastName, userId, passWord);
        this.managementPosition = managementPosition;
    }

    public String getManagementPosition() {
        return managementPosition;
    }

    public void setManagementPosition(String managementPosition) {
        this.managementPosition = managementPosition;
    }
}
