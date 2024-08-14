package com.example.LLD.carrentalsystem;

public class Booking {
    String bookingId;
    User user;
    Vehicle vehicle;
    BookingStatus bookingStatus;
    int totalCost;

    public Booking(String bookingId, User user, Vehicle vehicle, BookingStatus bookingStatus, int totalCost) {
        this.bookingId = bookingId;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingStatus = bookingStatus;
        this.totalCost = totalCost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
