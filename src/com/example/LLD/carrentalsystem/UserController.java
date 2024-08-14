package com.example.LLD.carrentalsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController {

    private static UserController userController;
    private UserController() {}

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

    Map<Integer, User> userMap = new HashMap<>();
    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userMap.put(user.getDrivingLicence(), user);
    }

    public User getUser(int drivingLicense) {
        return userMap.get(drivingLicense);
    }
}
