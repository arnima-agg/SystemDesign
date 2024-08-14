package com.example.LLD.carrentalsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryController {

    private static InventoryController inventoryController;
    private InventoryController() {}

    public static InventoryController getInstance() {
        if(inventoryController == null) {
            synchronized (InventoryController.class) {
                if(inventoryController == null) {
                    return new InventoryController();
                }
            }
        }
        return inventoryController;
    }
    Map<Integer, Vehicle> vehicleMap = new HashMap<>();
    List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleMap.put(vehicle.getVehicleNumber(), vehicle);
        vehicleList.add(vehicle);
    }

    public Vehicle getVehicle(int vehicleNumber) {
        return vehicleMap.get(vehicleNumber);
    }

    public List<Vehicle> getAllVehicle(LocalDate startDate, LocalDate endDate) {
        List<Vehicle> vehicles = new ArrayList<>();
        for(Vehicle vehicle : vehicleMap.values()) {
            if(vehicle.getVehicleStatus() == VehicleStatus.AVAILABLE)
                vehicles.add(vehicle);
            else if((startDate.isAfter(vehicle.getStartDate()) && startDate.isBefore(vehicle.getEndDate()) ||
                    endDate.isAfter(vehicle.getStartDate()) && endDate.isBefore(vehicle.getEndDate()))) {
                continue;
            }
        }
        return vehicles;
    }

    public void bookVehicle(int vehicleNumber, LocalDate startDate, LocalDate endDate) {
        Vehicle vehicle = getVehicle(vehicleNumber);
        vehicle.setVehicleStatus(VehicleStatus.BOOKED);
        vehicle.setStartDate(startDate);
        vehicle.setEndDate(endDate);
    }

    public void makeVehicleAvailable(int vehicleNumber) {
        Vehicle vehicle = getVehicle(vehicleNumber);
        vehicle.setVehicleStatus(VehicleStatus.AVAILABLE);
        vehicle.setStartDate(null);
        vehicle.setEndDate(null);
    }

}
