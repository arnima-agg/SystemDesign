package com.example.LLD.SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int count;
    int min = 1;
    int max = 6;

    public Dice(int count) {
        this.count = count;
    }

    public int rollDice() {
        int totalSum = 0;
        int diceUsed = 0;
        while(diceUsed <= count) {
            totalSum += ThreadLocalRandom.current().nextInt(min, max+1);
            diceUsed++;
        }
        return totalSum;
    }

}
