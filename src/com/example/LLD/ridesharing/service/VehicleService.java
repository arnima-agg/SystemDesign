package com.example.LLD.ridesharing.service;

import com.example.LLD.ridesharing.entity.Vehicle;
import com.example.LLD.ridesharing.repository.VehicleRepository;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();

    public void addVehicle(String vehicleNumber, String vehicleName, String userName) {
        Vehicle vehicle = new Vehicle(vehicleNumber,vehicleName, userName);
        vehicleRepository.addVehicle(vehicleNumber, vehicle);
    }
}
