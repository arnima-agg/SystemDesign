package com.example.LLD.TicTacToe;

import com.example.LLD.TicTacToe.Model.Board;
import com.example.LLD.TicTacToe.Model.Player;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {

    Deque<Player> players = new LinkedList<Player>();
    Board board;
    static int cellCount;
    int boardSize = 3;

    public void initializeGame() {
        Player player1 = new Player("P1", "X");
        Player player2 = new Player("P2", "O");
        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        boolean winner = false;

        while(winner == false) {

            if(cellCount == boardSize*boardSize) {
                winner = true;
                continue;
            }

            board.printBoard();

            Player playerTurn = players.removeFirst();

            System.out.println("Player turn " + playerTurn.getId() +" enter row, column");
            Scanner sc= new Scanner(System.in);
            String s = sc.nextLine();
            String[] value = s.split(",");
            int row = Integer.valueOf(value[0]);
            int col = Integer.valueOf(value[1]);

            boolean addPieceSuccessfully = board.addPiece(row, col, playerTurn.getSymbol());
            if(!addPieceSuccessfully) {
                System.out.println("Enter the empty row and column");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean isWinner = checkWinner(row, col, playerTurn.getSymbol());
            if(isWinner) {
                return playerTurn.getId();
            }
        }
        return "tie";
    }

    private boolean checkWinner(int row, int col, String symbol) {
        boolean rowMatch = true;
        boolean colMatch =true;
        boolean diagonalMatch =true;
        boolean antiDiagonalMatch =true;

        for(int i=0;i<boardSize;i++) {
            if(board.board[row][i] == null || board.board[row][i] != symbol) {
                rowMatch = false;
            }
        }
        for(int i=0;i<boardSize;i++) {
            if(board.board[i][col] == null || board.board[i][col] != symbol) {
                colMatch = false;
            }
        }
        for(int i=0;i<boardSize;i++) {
            if(board.board[i][i] == null || board.board[i][i] != symbol) {
                diagonalMatch = false;
            }
        }
        for(int i=0;i<boardSize;i++) {
            if(board.board[boardSize-i-1][i] == null || board.board[boardSize-i-1][i] != symbol) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
