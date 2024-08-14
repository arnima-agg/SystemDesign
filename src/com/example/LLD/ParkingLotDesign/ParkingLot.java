package com.example.LLD.ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    private ParkingSpot parkingSpot;

    private Ticket ticket;

    public boolean spotAvailable(VehicleType vehicleType) {
        if(vehicleType.equals(VehicleType.CAR)) {

        }
        return true;
    }

    public double calculateCharges() {
        return 0.0;
    }

    public Ticket generateTicket() {
        ticket = new Ticket(1);
        return ticket;
    }

    public ParkingSpot parkVehicle(Vehicle v1) {
        String slotId = generateId();
        parkingSpot = new ParkingSpot(slotId, v1.vehicleType);
        parkingSpot.occupySlot();
        parkingSpots.add(parkingSpot);
        System.out.println("Vehicle parked successfully " + parkingSpot.spotId + " " + parkingSpot.vehicleType);
        return parkingSpot;
    }

    public void unparkVehicle(Vehicle v1, ParkingSpot parkingSpot, Ticket ticket) {
        parkingSpot.freeSlot();
        double charges = calculateCharges();
        ticket.freeSpot(charges);
        System.out.println("Vehicle unparked successfully" + ticket.ticketId + ticket.fees + ticket.paidAt + ticket.issueAt);
    }

    public String generateId() {
        return "Ticket" + System.currentTimeMillis();
    }


}
