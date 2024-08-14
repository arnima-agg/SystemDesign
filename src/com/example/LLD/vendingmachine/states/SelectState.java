package com.example.LLD.vendingmachine.states;

import com.example.LLD.vendingmachine.Item;
import com.example.LLD.vendingmachine.VendingMachine;

public class SelectState implements State {

    public SelectState() {
        System.out.println("vending machine is in select state");
    }

    @Override public void IdleState(VendingMachine vendingMachine) {

    }

    @Override public void selectItem(VendingMachine vendingMachine, Item item) {

    }

    @Override public void dispenseItem(VendingMachine vendingMachine, Item item) {

    }

    @Override public void dispenseCash(VendingMachine vendingMachine) {

    }

    @Override public void returnFullMoney(VendingMachine vendingMachine) {

    }

    @Override public void addMoney(VendingMachine vendingMachine, int amount) {

    }
}
