package com.example.LLD.vendingmachine.states;

import com.example.LLD.vendingmachine.Item;
import com.example.LLD.vendingmachine.VendingMachine;

public class IdleState implements State {

    public IdleState() {
        System.out.println("vending machine is in idl state");
    }
    @Override public void IdleState(VendingMachine vendingMachine) {
        System.out.println("vending machine is in idl state");
    }

    @Override public void selectItem(VendingMachine vendingMachine, Item item) throws Exception{
        throw new Exception("you can't select the item");
    }

    @Override public void dispenseItem(VendingMachine vendingMachine, Item item) throws Exception{
        throw new Exception("you can't dispense the item");
    }

    @Override public void dispenseCash(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can't dispense the cash");
    }

    @Override public void returnFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("no money");
    }

    @Override public void addMoney(VendingMachine vendingMachine, int amount) {
        vendingMachine.setVendingState(new AddCash());
    }
}
