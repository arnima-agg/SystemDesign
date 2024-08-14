package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    String startTime;
    String endTime;
    Screen screen;
    Threatre threatre;
    List<Seat> seatList;

    public Show(int showId, Movie movie, String startTime, String endTime, Screen screen, Threatre threatre) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.screen = screen;
        this.threatre = threatre;
        this.seatList = new ArrayList<>();
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Threatre getThreatre() {
        return threatre;
    }

    public void setThreatre(Threatre threatre) {
        this.threatre = threatre;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
