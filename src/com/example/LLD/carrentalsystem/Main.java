package com.example.LLD.carrentalsystem;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        UserController userController = UserController.getInstance();
        InventoryController inventoryController = InventoryController.getInstance();
        StoreController storeController = StoreController.getInstance();

        User user1 = new User(4789, "arnima", "arnf@gmail.com");
        User user2 = new User(4743, "suk", "suk@gmail.com");

        Vehicle vehicle1 = new Vehicle(1, "Honda", 5, 100, 1000);
      //  Vehicle vehicle2 = new Vehicle(2, "Swift", 4, 200, 2000);

        inventoryController.addVehicle(vehicle1);
//        inventoryController.addVehicle(vehicle2);

        userController.addUser(user1);
        userController.addUser(user2);

        LocalDate date1 = LocalDate.parse("2018-12-24");
        LocalDate date2 = date1.plusDays(5);


        storeController.bookCar(inventoryController, user1, date1, date2);

        LocalDate date3 = LocalDate.parse("2018-05-31");
        LocalDate date4 = date1.plusDays(5);
        storeController.bookCar(inventoryController, user2, date3, date4);

    }
}
