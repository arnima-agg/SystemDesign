package com.example.LLD.vendingmachine;

public enum Coin {
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    public int value;
    Coin(int value) {
        this.value = value;
    }
}
