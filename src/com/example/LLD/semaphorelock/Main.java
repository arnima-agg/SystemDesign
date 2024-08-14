package com.example.LLD.semaphorelock;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

import com.example.LLD.semaphorelock.SharedResource;

public class Main {
    public static void main(String args[]) {
        SharedResource sharedResource = new SharedResource();
        Semaphore lock = new Semaphore(2);
        Thread t1 = new Thread(() -> {
            sharedResource.producer(lock);
        });
        Thread t2 = new Thread(() -> {
            sharedResource.producer(lock);
        });
        Thread t3 = new Thread(() -> {
            sharedResource.producer(lock);
        });
        Thread t4 = new Thread(() -> {
            sharedResource.producer(lock);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        List<Integer> l = Arrays.asList(1,2,3,45);
        l.stream().filter(x -> x%2 !=0).forEach(k -> {System.out.println(k);});
    }

}
