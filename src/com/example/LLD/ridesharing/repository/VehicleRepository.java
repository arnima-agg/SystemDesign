package com.example.LLD.ridesharing.repository;

import java.util.HashMap;
import java.util.Map;

import com.example.LLD.ridesharing.entity.Vehicle;

public class VehicleRepository {
    Map<String, Vehicle> vehicleMap = new HashMap<>();

    public void addVehicle(String id, Vehicle vehicle) {
        vehicleMap.put(id, vehicle);
        System.out.println("vehicle added successfully");
    }

    public Vehicle getVehicle(String vehicleNumber) {
        return vehicleMap.get(vehicleNumber);
    }
}
