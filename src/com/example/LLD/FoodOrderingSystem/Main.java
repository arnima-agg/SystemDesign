package com.example.LLD.FoodOrderingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        RestaurantManager restaurantManager = RestaurantManager.getInstance();


        List<Item> items = new ArrayList<>();
        Item item1 = new Item("Pizza", 120);
        Item item2 = new Item("Pasta", 200);
        Item item3 = new Item("Burger", 100);
        Item item4 = new Item("Sandwich", 70);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        Restaurant restaurant1 = new Restaurant("Pizzahut", "Sarjapur", 4);
        restaurant1.addMenu("Pizza", item1);
        restaurant1.addMenu("Pasta", item2);
        OrderManagement orderManagement = new OrderManagement(new LowestPriceRestaurant(restaurant1));
        restaurantManager.onboardRestaurant(restaurant1);
        restaurantManager.getItemsByRestaurant(restaurant1);

        Map<Item, Integer> orderDetails = new HashMap<>();
        orderDetails.put(item1, 2);
        orderDetails.put(item2, 1);
        Restaurant r = orderManagement.placeOrder(orderDetails);
        orderManagement.orderDelivered(r, orderDetails);


    }
}
