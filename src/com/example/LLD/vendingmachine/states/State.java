package com.example.LLD.vendingmachine.states;

import com.example.LLD.vendingmachine.Item;
import com.example.LLD.vendingmachine.VendingMachine;

public interface State {

    public void IdleState(VendingMachine vendingMachine) throws Exception;
    public void selectItem(VendingMachine vendingMachine, Item item) throws Exception;
    public void dispenseItem(VendingMachine vendingMachine, Item item) throws Exception;
    public void dispenseCash(VendingMachine vendingMachine) throws Exception;
    public void returnFullMoney(VendingMachine vendingMachine) throws Exception;
    public void addMoney(VendingMachine vendingMachine, int amount) throws Exception;

}
