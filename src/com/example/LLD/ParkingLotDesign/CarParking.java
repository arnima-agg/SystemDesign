package com.example.LLD.ParkingLotDesign;

public class CarParking extends ParkingSpot{
    public int totalCapacity;
    public int charges;

    public CarParking(int totalCapacity, int charges) {
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
