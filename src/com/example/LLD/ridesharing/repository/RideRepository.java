package com.example.LLD.ridesharing.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.ridesharing.entity.Ride;
import com.example.LLD.ridesharing.entity.RideStats;

public class RideRepository {
    private Map<String, Ride> rideMap = new HashMap<>();
    private List<Ride> rides = new ArrayList<>();

    private Map<String, RideStats> userStats = new HashMap<>();

    public void addRide(String vehicleNumber, Ride ride) {
        rideMap.put(vehicleNumber, ride);
        rides.add(ride);
        addOfferer(ride.getUserRideOfferer());
    }

    public Ride getRide(String vehicleNumber) {
        return rideMap.get(vehicleNumber);
    }

    public void removeRide(String vehicleNumber) {
        Ride ride = rideMap.remove(vehicleNumber);
        rides.remove(ride);
    }

    public List<Ride> getAllRides() {
        return rides;
    }

    public void addOfferer(String offererName) {
        if(userStats.containsKey(offererName)) {
            RideStats rideStats = userStats.get(offererName);
            rideStats.setOffered(rideStats.getOffered()+1);
            userStats.put(offererName, rideStats);

        } else {
            RideStats rideStats = new RideStats();
            rideStats.setOffered(1);
            userStats.put(offererName, rideStats);
        }

    }

    public void addTaken(String Name) {
        RideStats rideStats = userStats.get(Name);
        rideStats.setTaken(rideStats.getTaken()+1);
    }

    public Map<String, RideStats> getRiderStats() {
        return null;
    }

}
