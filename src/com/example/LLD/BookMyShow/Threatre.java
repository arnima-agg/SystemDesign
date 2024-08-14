package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Threatre {
    int theatreId;
    Location location;
    List<Screen> screenList;
    List<Movie> movieList;

    public Threatre(int theatreId, Location location) {
        this.theatreId = theatreId;
        this.location = location;
        this.screenList = new ArrayList<>();
        this.movieList = new ArrayList<>();
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
