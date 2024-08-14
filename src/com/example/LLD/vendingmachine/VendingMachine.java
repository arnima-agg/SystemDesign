package com.example.LLD.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.example.LLD.vendingmachine.states.IdleState;
import com.example.LLD.vendingmachine.states.State;

public class VendingMachine {
    private List<Item> itemList;
    private State vendingState;
    private List<Coin> coins;

    public VendingMachine(List<Item> itemList) {
        this.itemList = itemList;
        this.vendingState = new IdleState();
        this.coins = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public State getVendingState() {
        return vendingState;
    }

    public void setVendingState(State vendingState) {
        this.vendingState = vendingState;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
