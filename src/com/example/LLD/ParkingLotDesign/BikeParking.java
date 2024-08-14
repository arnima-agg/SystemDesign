package com.example.LLD.ParkingLotDesign;

public class BikeParking extends ParkingSpot{
    public int totalCapacity;
    public int charges;

    public BikeParking(int totalCapacity, int charges) {
        this.totalCapacity = totalCapacity;
        this.charges = charges;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }
}
