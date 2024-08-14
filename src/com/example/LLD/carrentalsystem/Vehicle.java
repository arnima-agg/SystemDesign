package com.example.LLD.carrentalsystem;

import java.time.LocalDate;
import java.util.Date;
import javax.xml.crypto.Data;

public class Vehicle {
    int vehicleNumber;
    String vehicleName;
    int capacity;
    LocalDate startDate;
    LocalDate endDate;
    int hourlyRentalCost;
    int dailyRentalCost;
    VehicleStatus vehicleStatus;

    public Vehicle(int vehicleNumber, String vehicleName, int capacity, int hourlyRentalCost, int dailyRentalCost) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.capacity = capacity;
        this.hourlyRentalCost = hourlyRentalCost;
        this.dailyRentalCost = dailyRentalCost;
        this.startDate = null;
        this.endDate = null;
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }
}
