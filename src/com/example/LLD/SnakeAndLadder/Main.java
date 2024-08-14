package com.example.LLD.SnakeAndLadder;

public class Main {

    public static void main(String[] args) {
        SnakeAndLadder game = new SnakeAndLadder();
        game.initializeGame();

        System.out.println("winner is" + game.startGame());

    }
}
