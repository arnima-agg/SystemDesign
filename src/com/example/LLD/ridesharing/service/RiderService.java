package com.example.LLD.ridesharing.service;

import java.util.List;
import java.util.Objects;

import com.example.LLD.ridesharing.RideStrategy;
import com.example.LLD.ridesharing.entity.Ride;
import com.example.LLD.ridesharing.entity.User;
import com.example.LLD.ridesharing.entity.Vehicle;
import com.example.LLD.ridesharing.repository.RideRepository;
import com.example.LLD.ridesharing.repository.UserRepository;
import com.example.LLD.ridesharing.repository.VehicleRepository;

public class RiderService {

    UserRepository userRepository = new UserRepository();
    VehicleRepository vehicleRepository = new VehicleRepository();

    RideRepository rideRepository = new RideRepository();

    RideStrategy rideStrategy;

    public RiderService(RideStrategy rideStrategy) {
        this.rideStrategy = rideStrategy;
    }

    // int id, String source, String destination, Vehicle vehicle, String userRideOfferer
    public void offerRide(int id, String source, String destination, int availableSeat, String vehicleNumber, String rideOfferer) {
        User user = userRepository.getUser(id);
        Vehicle vehicle = vehicleRepository.getVehicle(vehicleNumber);
        Ride ride = rideRepository.getRide(vehicleNumber);
        if(!Objects.isNull(ride)) {
            throw new RuntimeException();
        }
        Ride newRide = new Ride(1, source, destination, vehicle, "Rahul", availableSeat);
        rideRepository.addRide(vehicleNumber, newRide);
        rideRepository.addOfferer(rideOfferer);
        System.out.println("Rider added successfully");
    }

    public void selectRide(String rideBooker, String source, String destination, int seats) {
        List<Ride> ridesList = rideRepository.getAllRides();
        Ride ride = rideStrategy.selectRide(source, destination, seats, ridesList);
        ride.setAvailableSeats(ride.getAvailableSeats() - seats);
        ride.getPillion().add(rideBooker);
        ride.setPillion(ride.getPillion());
        rideRepository.addTaken(rideBooker);
    }

    public void endRide(String vehicleNumber) {
        Vehicle vehicle = vehicleRepository.getVehicle(vehicleNumber);
        Ride ride = rideRepository.getRide(vehicleNumber);
        if(!Objects.isNull(ride)) {
            throw new RuntimeException("ride not found");
        }
        rideRepository.removeRide(vehicleNumber);
    }

}
