package com.example.LLD.Splitwise.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.Splitwise.group.GroupController;
import com.example.LLD.Splitwise.user.User;

public class UserController {

    private UserController() {}
    public static UserController userController = null;
    public static UserController getInstance() {
        if(userController == null) {
            synchronized (UserController.class) {
                if(userController == null) {
                    return new UserController();
                }
            }
        }
        return userController;
    }
    List<User> users = new ArrayList<>();
    Map<Integer, User> userMap = new HashMap<>();

    public void createUser(User user) {
        userMap.put(user.getId(), user);
    }

    public User getUser(int userId) {
        return userMap.get(userId);
    }

    //CRUD operations for users




}
