package com.example.LLD.BookMyShow;

public class Movie {
    int movieId;
    String name;
    int duration;
    String genre;

    public Movie(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
