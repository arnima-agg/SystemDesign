package com.example.LLD.retrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String args[]) {

        ReentrantLock lock = new ReentrantLock();
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.producer(lock);
        });

        SharedResource sharedResource1 = new SharedResource();
        Thread t2 = new Thread(() -> {
            sharedResource.producer(lock);
        });
        t1.start();
        t2.start();
    }
}
