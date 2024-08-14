package com.example.LLD.ridesharing;

import java.util.List;

import com.example.LLD.ridesharing.entity.Ride;

public interface RideStrategy {
    public Ride selectRide(String source, String destination, int seats, List<Ride> rides);
}
