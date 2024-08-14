package com.example.LLD.semaphorelock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    public boolean isAvailable = false;

    public void producer(Semaphore lock) {
        try{
            lock.acquire();
            System.out.println("lock acquired " + Thread.currentThread().getName());
            Thread.sleep(6000);
            isAvailable = true;


        } catch (Exception e) {

        } finally {
            lock.release();
            System.out.println("lock released " + Thread.currentThread().getName());
        }
    }
}
