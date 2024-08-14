package com.example.LLD.ridesharing.entity;

public class Vehicle {
    String vehicleNumber;
    String vehicleName;
    String userName;

    public Vehicle(String vehicleNumber, String vehicleName, String userName) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.userName = userName;
    }

    int capacity;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
