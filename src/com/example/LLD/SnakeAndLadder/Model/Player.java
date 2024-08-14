package com.example.LLD.SnakeAndLadder.Model;

public class Player {

    String id;
    int positionCount;

    public Player(String id, int positionCount) {
        this.id = id;
        this.positionCount = positionCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }
}
