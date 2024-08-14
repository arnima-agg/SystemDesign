package com.example.LLD.BookMyShow;

public class Seat {
    int id;
    SeatType seatType;
    int price;

    boolean isAvailable;

    public Seat(int id, SeatType seatType, int price) {
        this.id = id;
        this.seatType = seatType;
        this.price = price;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
