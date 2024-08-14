package com.example.LLD.ParkingLotDesign;

public class ParkingSpot {
    String spotId;
    boolean isOccupied;
    VehicleType vehicleType;

    public ParkingSpot() {

    }

    public ParkingSpot(String spotId, VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
    }
    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void occupySlot() {
        isOccupied = true;
    }

    public void freeSlot() {
        isOccupied = false;
    }
}
