package com.example.LLD.BookMyShow;

public class Booking {
    int bookingId;
    Show show;
    User user;

    public Booking(int bookingId, Show show, User user) {
        this.bookingId = bookingId;
        this.show = show;
        this.user = user;
    }

}
