package com.example.LLD.FoodOrderingSystem;

import java.util.List;

public class LowestPriceRestaurant implements RestaurantStrategy{
    Restaurant restaurants = null;
    public LowestPriceRestaurant(Restaurant restaurant) {
        this.restaurants = restaurant;
    }
    @Override public Restaurant chooseRestaurant() {
        return restaurants;
    }
}
