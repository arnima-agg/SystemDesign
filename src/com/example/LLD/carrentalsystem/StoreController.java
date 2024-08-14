package com.example.LLD.carrentalsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;

public class StoreController {

    private static StoreController storeController;
    private StoreController() {}

    public static StoreController getInstance() {
        if(storeController == null) {
            synchronized (StoreController.class) {
                if(storeController == null) {
                    return new StoreController();
                }
            }
        }
        return storeController;
    }
    InventoryController inventoryController = InventoryController.getInstance();

    List<Booking> bookingList = new ArrayList<>();
    Map<String, Booking> bookingMap = new HashMap<>();

    public void bookCar(InventoryController inventoryController, User user, LocalDate startDate, LocalDate endDate) {
        List<Vehicle> vehicles = inventoryController.getAllVehicle(startDate, endDate);
        if(vehicles.size() == 0) {
            System.out.println("No vehicles found");
            return;
        }
        int totalcost = (int)(DAYS.between(startDate,endDate)+1) * vehicles.get(0).getDailyRentalCost();
        String bookingId = "1234";
        Booking booking = new Booking(bookingId, user, vehicles.get(0), BookingStatus.BOOKED, totalcost);
        bookingMap.put(bookingId, booking);
        inventoryController.bookVehicle(vehicles.get(0).getVehicleNumber(), startDate, endDate);
        System.out.println("your car is booked " + bookingId + " vehicle name " + vehicles.get(0).getVehicleName() + " cost " + totalcost);
    }

    public void returnCar(String bookingId, int vehicleNumber) {
        Booking booking = bookingMap.get(bookingId);
        booking.setBookingStatus(BookingStatus.RETURNED);
        inventoryController.makeVehicleAvailable(vehicleNumber);
        System.out.println("you have returned the car " + booking.getBookingStatus() + "vehicle id " + vehicleNumber);
    }


}
