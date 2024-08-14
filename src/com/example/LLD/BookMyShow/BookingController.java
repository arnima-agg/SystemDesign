package com.example.LLD.BookMyShow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingController {

    private static BookingController bookingController;
    private BookingController() {}

    public static BookingController getInstance() {
        if(bookingController == null) {
            synchronized (BookingController.class) {
                if(bookingController == null) {
                    bookingController = new BookingController();
                }
            }
        }
        return bookingController;
    }

    Map<Integer, Booking> bookingMap = new HashMap<>();

    ShowController showController = ShowController.getInstance();

    public void createBooking(User user, Show show, List<Seat> seats ) {
        int bookingId = generateBookingId();
        Booking booking = new Booking(bookingId, show, user);
        for(Seat seat : seats) {
            showController.bookSeat(seat, show.getShowId());
        }
        bookingMap.put(booking.bookingId, booking);
        System.out.println("booking completed " + booking.bookingId);
    }

    public void getBookingDetails(int userId) {
        for(Booking booking : bookingMap.values()) {
            if(booking.user.userId == userId) {
                System.out.println("Booking id - " + booking.bookingId + " " + booking.show.startTime + " " +
                        booking.show.endTime +  " " + booking.show.movie.getName());
            }
        }
    }

    public int generateBookingId() {
        return 100;
    }

}
