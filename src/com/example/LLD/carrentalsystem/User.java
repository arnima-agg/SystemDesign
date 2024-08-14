package com.example.LLD.carrentalsystem;

public class User {
    int drivingLicence;
    String name;
    String email;

    public User(int drivingLicence, String name, String email) {
        this.drivingLicence = drivingLicence;
        this.name = name;
        this.email = email;
    }

    public int getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(int drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
