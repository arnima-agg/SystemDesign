package com.example.LLD.SnakeAndLadder;

import com.example.LLD.SnakeAndLadder.Model.Cell;
import com.example.LLD.SnakeAndLadder.Model.Dice;
import com.example.LLD.SnakeAndLadder.Model.Board;
import com.example.LLD.SnakeAndLadder.Model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class SnakeAndLadder {
    Board board;
    Dice dice;
    Deque<Player> players;
    String winner = null;
    
    public void initializeGame() {
        dice = new Dice(1);

        players = new LinkedList<>();
        Player player1 = new Player("P1", 0);
        Player player2 = new Player("P2", 0);
        players.add(player1);
        players.add(player2);

        board = new Board(10, 2, 3);
    }

    public String startGame() {

        while(winner == null) {
            Player playerTurn = findTurn();
            System.out.println("Player" + playerTurn.getId() +" is on position" + playerTurn.getPositionCount());

            int diceValue = dice.rollDice();
            System.out.println("Dice value for "+playerTurn.getId()+" is "+diceValue);

            int playerNewPosition = playerTurn.getPositionCount()+diceValue;
            int jumpCheck = findJump(playerNewPosition);
            playerTurn.setPositionCount(jumpCheck);

            if(jumpCheck > board.cells.length*board.cells.length -1)
                winner = playerTurn.getId();
        }

        return winner;

    }

    private Player findTurn() {
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int findJump(int playerPos) {
        if(playerPos > board.cells.length*board.cells.length -1)
            return playerPos;

        Cell cell = board.getCell(playerPos);
        int newPos = playerPos;
        if(cell.jump != null && cell.jump.start == playerPos) {
            String jumpBy = (cell.jump.start > cell.jump.end) ? "Snake" : "Ladder";
            System.out.println("Jump is done by"+jumpBy);
            newPos = cell.jump.end;
        }
        return newPos;
    }
}
