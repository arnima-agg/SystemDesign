package com.example.LLD.NullPointer;

public class Main {

    public static void main(String args[]) {
        Vehicle vehicle = VehicleFactory.getVehicleInstance("car");
        printPrice(vehicle);
    }

    public static void printPrice(Vehicle vehicle) {
        System.out.println("Fuel capacity" + vehicle.getTankCapacity());
        System.out.println("seat capacity" + vehicle.getSeatingCapacity());
    }
}
