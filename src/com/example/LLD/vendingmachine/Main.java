package com.example.LLD.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.example.LLD.vendingmachine.states.State;

public class Main {
    public static void main(String args[]) {
        Item item1 = new Item(1, "softdrink", 50);
        Item item2 = new Item(2, "muffin", 100);
        Item item3 = new Item(3, "chips", 200);
        List<Item> itemList = new ArrayList<>();
        try {
            VendingMachine machine = new VendingMachine(itemList);
            State vendingState = machine.getVendingState();
            vendingState.addMoney(machine, 20);
        } catch (Exception e) {

        }

    }
}
