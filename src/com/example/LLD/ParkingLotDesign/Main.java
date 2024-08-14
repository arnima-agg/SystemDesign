package com.example.LLD.ParkingLotDesign;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(VehicleType.CAR, '1');
        ParkingSpot carParking = new CarParking(10, 60);
        BikeParking bikeParking = new BikeParking(10, 30);
        ParkingLot parkingLot = new ParkingLot();
        boolean available = parkingLot.spotAvailable(v1.vehicleType);
        if(!available) {
            System.out.println("no spot available");
        }
        Ticket ticket = parkingLot.generateTicket();
        ParkingSpot parkingSpot = parkingLot.parkVehicle(v1);
        parkingLot.unparkVehicle(v1, parkingSpot, ticket);
    }
}
