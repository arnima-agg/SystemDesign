package com.example.LLD.FoodOrderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderManagement {
    RestaurantStrategy restaurantStrategy;
    Order order = new Order();

    public OrderManagement(RestaurantStrategy restaurantStrategy ) {
        this.restaurantStrategy = restaurantStrategy;
    }

    public Restaurant placeOrder(Map<Item, Integer> orderDetails) {
        Restaurant restaurant = null;
        int totalQuantity = totalOrderQuantity(orderDetails);
        if(restaurant != null) {
            boolean canAccept = restaurant.canAcceptOrders(totalQuantity);
            if(canAccept) {
                restaurant.increaseCapacity(totalQuantity);
            } else {
                System.out.println("Not accepting orders");
            }
        }
        System.out.println("order placed at " + restaurant.name);
        return restaurant;
    }

    public int totalOrderQuantity(Map<Item, Integer> items) {
        int totalQuantity = 0;
        for(Item item : items.keySet()) {
            totalQuantity+= items.get(item);
        }
        return totalQuantity;
    }

    public void orderDelivered(Restaurant restaurant, Map<Item, Integer> orderDetails) {
        int totalQuantity = totalOrderQuantity(orderDetails);
        restaurant.decreaseCapacity(totalQuantity);
        System.out.println("capacity decreased" + totalQuantity);
    }

}
