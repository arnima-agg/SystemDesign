package com.example.LLD.paymentgateway.user;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    Map<Integer, User> userMap = new HashMap<>();

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    public User getUserDetails(int userId) {
        return userMap.get(userId);
    }

}
