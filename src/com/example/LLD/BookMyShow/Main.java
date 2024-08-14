package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        BookingController bookingController = BookingController.getInstance();
        ShowController showController = ShowController.getInstance();
        ThreatreController threatreController = ThreatreController.getInstance();

        User u1 = new User(1, "arnima");
        Movie movie1 = new Movie("Avenger", 120, "Action");
        Movie movie2 = new Movie("Iron man", 110, "Action");

        Location location = new Location("ballandur", "bangalore");
        Threatre t1 = new Threatre(1, location);

        Screen screen1 = new Screen(1, "A");
        Screen screen2 = new Screen(2, "B");

        threatreController.addThreatre(t1);
        threatreController.addMovie(1, movie1);
        threatreController.addScreen(1, screen1);
        threatreController.addScreen(1, screen2);

        Show show1 = new Show(1, movie1, "15:00", "18:00", screen1, t1);
        Show show2 = new Show(2, movie2, "10:00", "01:00", screen2, t1);
        showController.addShow(show1);
        showController.addShow(show2);

        Seat seat1 = new Seat(1, SeatType.PLATINUM, 200);
        Seat seat2 = new Seat(2, SeatType.SILVER, 600);
        Seat seat3 = new Seat(3, SeatType.GOLD, 800);

        showController.addSeatsToShow(show1.getShowId(), seat1);
        showController.addSeatsToShow(show1.getShowId(), seat2);
        showController.addSeatsToShow(show1.getShowId(), seat3);

        //showController.bookSeat(seat1, show1.getShowId());


        List<Seat> seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);
        bookingController.createBooking(u1, show1, seats);
        showController.getAvailableSeats(show1.getShowId());
        bookingController.getBookingDetails(u1.getUserId());
    }
}
