package com.example.LLD.factorypattern;

import java.util.Objects;

public class VehicleFactory {

    public Vehicle getInstance(String vehicleType) {
        if(Objects.equals(vehicleType, "Bike")) {
            return new Bike();
        } else if(Objects.equals(vehicleType, "Car")) {
            return new Car();
        }
        return null;

    }
}
