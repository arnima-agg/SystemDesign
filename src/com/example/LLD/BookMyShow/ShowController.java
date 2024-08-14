package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ShowController {

    private static ShowController showController;
    private ShowController() {}
    public static ShowController getInstance() {
        if(showController == null) {
            synchronized (ShowController.class) {
                if(showController == null) {
                    showController = new ShowController();
                }
            }
        }
        return showController;
    }
    Map<Integer, Show> showMap = new HashMap<>();

    public Show getShowDetails(int showId) {
        return showMap.get(showId);
    }

    public void addShow(Show show) {
        showMap.put(show.getShowId(), show);
    }

    public void addSeatsToShow(int showId, Seat seat) {
        Show show = showMap.get(showId);
        show.getSeatList().add(seat);
    }

    public List<Seat> getAvailableSeats(int showId) {
        List<Seat> availableSeats = new ArrayList<>();
        Show show = showMap.get(showId);
        for(Seat seat : show.getSeatList()) {
            if(seat.getIsAvailable()) {
                System.out.println("available seat " + seat.getId());
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public void bookSeat(Seat seat, int showId) {
        Show show = showMap.get(showId);
        for(Seat seat1 : show.getSeatList()) {
            if(Objects.equals(seat1, seat)) {
                seat1.setAvailable(false);
                showMap.put(showId, show);
                System.out.println("Seat book " + seat.getId() + " for show " + show.getMovie().getName() );
                break;
            }
        }

    }

    public List<Show> getAllShows(Movie movie, int threatreId) {
        List<Show> shows = new ArrayList<>();
        for(Show show : showMap.values()) {
            if(show.getMovie().equals(movie) && show.getThreatre().getTheatreId() == threatreId) {
                System.out.println("show details  " + show.getShowId() + " " + show.getMovie());
                shows.add(show);
            }
        }

        return shows;
    }


}
