package com.example.LLD.FoodOrderingSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    String name;
    String location;
    Map<String, Item> menu;
    int currentCapacity;
    int processingCapacity;
//    RestaurantManager restaurantManager = RestaurantManager.g

    public Restaurant(String name, String location, int processingCapacity) {
        this.name = name;
        this.location = location;
        this.menu = new HashMap<>();
        this.processingCapacity = processingCapacity;
        this.currentCapacity = 0;
    }


    public boolean canAcceptOrders(int totalQuantity) {
        if(currentCapacity + totalQuantity <= processingCapacity) {
            return true;
        }
        return false;
    }

    public void addMenu(String name, Item item) {

        menu.put(name, item);
    }

    public void increaseCapacity(int totalQuantity) {
        currentCapacity += totalQuantity;
    }

    public void decreaseCapacity(int totalQuantity) {
        currentCapacity -= totalQuantity;
    }

    public void getMenu() {
        for(String name : menu.keySet()) {
            System.out.println(name + " " + menu.get(name).price);
        }

    }


}
