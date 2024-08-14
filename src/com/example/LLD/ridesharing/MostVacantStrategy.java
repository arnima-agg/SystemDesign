package com.example.LLD.ridesharing;

import java.util.List;

import com.example.LLD.ridesharing.entity.Ride;

public class MostVacantStrategy implements RideStrategy{

    @Override
    public Ride selectRide(String source, String destination, int seats, List<Ride> rides) {
        Ride bestRide = null;
        int maxVacantSeats = 0;
        for(Ride ride : rides) {
            if(ride.getSource().equals(source) && ride.getDestination().equals(destination) &&
                    ride.getAvailableSeats() >= seats &&  ride.getAvailableSeats() >= maxVacantSeats) {
                maxVacantSeats = ride.getAvailableSeats();
                bestRide = ride;
            }
        }
        return bestRide;
    }
}
