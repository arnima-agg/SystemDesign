package com.example.LLD.ParkingLotDesign;

public class Vehicle {
    VehicleType vehicleType;
    int vehicleId;

    public Vehicle() {

    }
    public Vehicle(VehicleType vehicleType, int vehicleId) {
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
    }
}
