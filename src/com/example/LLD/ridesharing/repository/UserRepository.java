package com.example.LLD.ridesharing.repository;

import java.util.HashMap;
import java.util.Map;

import com.example.LLD.ridesharing.entity.User;
import sun.misc.SoftCache;

public class UserRepository {
    Map<Integer, User> userMap = new HashMap<>();

    public void addUser(int id, User user) {
        userMap.put(id, user);
    }
    public User getUser(int id) {
        return userMap.get(id);
    }

    public boolean userAlreadyRegistered(int id) {
        if(userMap.containsKey(id)) {
            return true;
        }
        return false;
    }
}
