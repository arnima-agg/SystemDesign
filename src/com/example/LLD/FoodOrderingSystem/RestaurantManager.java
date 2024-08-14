package com.example.LLD.FoodOrderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestaurantManager {
    private List<Restaurant> restaurantList ;
    private static RestaurantManager instance;
    private RestaurantManager() {
        restaurantList = new ArrayList<>();
    }
    public static RestaurantManager getInstance() {
        if(instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void onboardRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }

    public void getItemsByRestaurant(Restaurant restaurant) {
        restaurant.getMenu();
    }
}
