package com.example.LLD.ridesharing.service;

import com.example.LLD.ridesharing.entity.User;
import com.example.LLD.ridesharing.enums.Gender;
import com.example.LLD.ridesharing.exception.NoUserFound;
import com.example.LLD.ridesharing.repository.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public void addUser(int id, String name, Gender gender, int age) {
        if(userRepository.userAlreadyRegistered(id)) {
            throw new NoUserFound("already registed");
        }
        User user = new User(id, name, gender, age);
        userRepository.addUser(id, user);
        System.out.println("user added successfully");
    }

}
