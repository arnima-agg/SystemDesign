package com.example.LLD.SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeBoard(boardSize);
        addSnakes(cells, numberOfSnakes);
        addladers(cells, numberOfLadders);
    }

    private void initializeBoard(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++) {
            for(int j=0;j<boardSize;j++) {
                Cell obj = new Cell();
                cells[i][j] = obj;
            }
        }
    }

    private void addSnakes(Cell[][] cells, int numberOfSnakes) {
        while(numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeHead >= snakeTail)
                continue;;

            Jump jumpobj = new Jump(snakeHead, snakeTail);

            Cell cell = getCell(snakeHead);
            cell.jump = jumpobj;

            numberOfSnakes--;
        }
    }

    private void addladers(Cell[][] cells, int numberOfLaders) {
        while(numberOfLaders> 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(ladderEnd <= ladderStart)
                continue;;

            Jump jumpobj = new Jump(ladderStart, ladderEnd);

            Cell cell = getCell(ladderStart);
            cell.jump = jumpobj;

            numberOfLaders--;
        }
    }

    public Cell getCell(int startPos) {
        int row = startPos/ cells.length;
        int col = startPos% cells.length;

        return cells[row][col];
    }

}
