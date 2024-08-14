package com.example.LLD.vendingmachine.states;

import com.example.LLD.vendingmachine.Item;
import com.example.LLD.vendingmachine.VendingMachine;

public class DispenseItem implements State {

    public DispenseItem() {
        System.out.println("vending machine is in dispense item state");
    }

    @Override public void IdleState(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't be idle state");
    }

    @Override public void selectItem(VendingMachine vendingMachine, Item item) throws Exception {
        throw new Exception("can't select the item");
    }

    @Override public void dispenseItem(VendingMachine vendingMachine, Item item) throws Exception {
        Item item1 = vendingMachine.getItemList().get(item.getItemId());

    }

    @Override public void dispenseCash(VendingMachine vendingMachine) throws Exception {

    }

    @Override public void returnFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("can't return money state");
    }

    @Override public void addMoney(VendingMachine vendingMachine, int amount) throws Exception {

    }
}
