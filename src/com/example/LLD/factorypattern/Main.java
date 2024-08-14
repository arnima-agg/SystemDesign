package com.example.LLD.factorypattern;

public class Main {

    public static void main(String args[]) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getInstance("Car");
        vehicle.printType();
    }
}
