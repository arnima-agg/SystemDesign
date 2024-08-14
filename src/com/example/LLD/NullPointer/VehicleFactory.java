package com.example.LLD.NullPointer;

public class VehicleFactory {


    public static Vehicle getVehicleInstance(String vehicleType) {
        if("car".equals(vehicleType)) {
            return new Car();
        }
        return new NullPointer();
    }
}
