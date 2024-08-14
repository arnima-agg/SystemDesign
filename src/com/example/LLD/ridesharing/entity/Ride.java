package com.example.LLD.ridesharing.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ride {
    private int id;
    private String source;
    private String destination;
    private Vehicle vehicle;
    private String userRideOfferer;

    private List<String> pillion;

    private int availableSeats;

    public String getUserRideOfferer() {
        return userRideOfferer;
    }

    public void setUserRideOfferer(String userRideOfferer) {
        this.userRideOfferer = userRideOfferer;
    }

    public List<String> getPillion() {
        return pillion;
    }

    public void setPillion(List<String> pillion) {
        this.pillion = pillion;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Ride(int id, String source, String destination, Vehicle vehicle, String userRideOfferer, int availableSeats) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.vehicle = vehicle;
        this.userRideOfferer = userRideOfferer;
        this.availableSeats = availableSeats;
        this.pillion = new ArrayList<>();
    }

//    public void assignAvailableSeats(int seats) {
//        availableSeats.set(seats);
//    }
//
//    public void incrementSeats() {
//        availableSeats.getAndIncrement();
//    }
//     public void decrementSeats() {
//        availableSeats.decrementAndGet();
//     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
