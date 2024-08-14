package com.example.LLD.ridesharing;

import com.example.LLD.ridesharing.enums.Gender;
import com.example.LLD.ridesharing.service.RiderService;
import com.example.LLD.ridesharing.service.UserService;
import com.example.LLD.ridesharing.service.VehicleService;

public class Driver {

    public static void main(String args[]) {
        UserService userService = new UserService();
        VehicleService vehicleService = new VehicleService();
        RiderService riderService = new RiderService(new MostVacantStrategy());
        try {
            userService.addUser(1, "shashank", Gender.M, 29);
            userService.addUser(1, "shashank", Gender.M, 29);
            userService.addUser(2, "rohan", Gender.M, 36);
            userService.addUser(3, "nandini", Gender.F, 36);
            userService.addUser(4, "shipra", Gender.F, 30);
            vehicleService.addVehicle("KA-01-12345", "Swift", "rohan");
            vehicleService.addVehicle("TS-05-62395", "baleno", "shashank");
            riderService.offerRide(1, "blr", "hyd", 2, "KA-01-12345","rohan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //riderService.offerRide(1, "blr", "hyd", 2, "KA-01-12345","rohan");

    }
}
