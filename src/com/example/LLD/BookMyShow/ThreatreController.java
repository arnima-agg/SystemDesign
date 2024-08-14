package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreatreController {

    private static ThreatreController threatreController;
    private ThreatreController() {}
    public static ThreatreController getInstance() {
        if(threatreController == null) {
            synchronized (ThreatreController.class) {
                if(threatreController == null) {
                    threatreController = new ThreatreController();
                }
            }
        }
        return threatreController;
    }

    Map<Integer, Threatre> threatreMap = new HashMap<>();

    public void addThreatre(Threatre threatre) {
        threatreMap.put(threatre.getTheatreId(), threatre);
    }

    public void getThreatre(int threatreId) {
        threatreMap.get(threatreId);
    }

    public void addMovie(int threatreId, Movie movie) {
        Threatre threatre = threatreMap.get(threatreId);
        threatre.getMovieList().add(movie);
        threatreMap.put(threatre.getTheatreId(), threatre);
    }

    public List<Threatre> getMovie(Movie movie) {
        List<Threatre> movieThreatreList = new ArrayList<>();
        for(Threatre threatre : threatreMap.values()) {
            if(threatre.getMovieList().contains(movie)) {
                movieThreatreList.add(threatre);
            }
        }
        return movieThreatreList;
    }

    public void addScreen(int threatreId, Screen screen) {
        Threatre threatre = threatreMap.get(threatreId);
        threatre.getScreenList().add(screen);
        threatreMap.put(threatre.getTheatreId(), threatre);
    }


}
