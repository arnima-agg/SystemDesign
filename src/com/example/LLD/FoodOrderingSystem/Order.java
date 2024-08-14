package com.example.LLD.FoodOrderingSystem;

import java.util.HashMap;
import java.util.Map;

public class Order {

    Map<Restaurant, Map<Item, Integer>> orders ;

    public Order() {
        orders = new HashMap<>();;
    }

    public void addOrders(Restaurant restaurant, Map<Item, Integer> orderDetails) {
        orders.put(restaurant, orderDetails);
    }

    public Map<Item, Integer> getRestaurant(Restaurant restaurant) {
        return orders.get(restaurant);
    }
}
