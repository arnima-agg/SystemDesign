package com.example.LLD.vendingmachine.states;

import com.example.LLD.vendingmachine.Coin;
import com.example.LLD.vendingmachine.Item;
import com.example.LLD.vendingmachine.VendingMachine;

public class AddCash implements State {

    public AddCash() {
        System.out.println("vending machine is in add cash state");
    }
    @Override public void IdleState(VendingMachine vendingMachine) {
        return;
    }

    @Override public void selectItem(VendingMachine vendingMachine, Item item) {
        vendingMachine.setVendingState(new SelectState());
    }

    @Override public void dispenseItem(VendingMachine vendingMachine, Item item) throws Exception {
        throw new Exception("Can't dispense the item without selecting");
    }

    @Override public void dispenseCash(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't dispense the cash without adding");
    }

    @Override public void returnFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Can't dispense the cash without adding");
    }

    @Override public void addMoney(VendingMachine vendingMachine, int amount) {
        if(amount == 50) {
            vendingMachine.getCoins().add(Coin.FIFTY);
        } else if(amount == 20) {
            vendingMachine.getCoins().add(Coin.TWENTY);
        } else {
            vendingMachine.getCoins().add(Coin.TEN);
        }

    }
}
