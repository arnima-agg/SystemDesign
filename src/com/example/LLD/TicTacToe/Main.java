package com.example.LLD.TicTacToe;

public class Main {

    public static void main(String[] args) {
        System.out.println("Game Started");

        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();

        System.out.println("Winner =="+ game.startGame());
    }
}
