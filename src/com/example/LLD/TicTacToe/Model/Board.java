package com.example.LLD.TicTacToe.Model;

public class Board {
    public int size;
    public String[][] board;

    public Board(int size) {
        this.size = size;
        board = new String[size][size];
    }


    public boolean addPiece(int row, int col, String symbol) {
        if(board[row][col] == null) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j] != null) {
                    System.out.print(board[i][j] +" ");
                }
                else {
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

}
