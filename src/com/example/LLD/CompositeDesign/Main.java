package com.example.LLD.CompositeDesign;

public class Main {

    public static void main(String[] args) {
        Directory moviesDir = new Directory("movies");
        File fs = new File("RRR");
        moviesDir.add(fs);

        Directory comedyMovie = new Directory("Comedy");
        File hulchul = new File("Hulchul");
        comedyMovie.add(hulchul);
        moviesDir.add(comedyMovie);

        moviesDir.ls();
    }
}
