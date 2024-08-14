package com.example.LLD.NullPointer;

public class Car implements Vehicle {

    @Override
    public int getSeatingCapacity() {
        return 2;
    }

    @Override
    public int getTankCapacity() {
        return 40;
    }
}
