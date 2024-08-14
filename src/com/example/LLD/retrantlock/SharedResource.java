package com.example.LLD.retrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    public boolean isAvailable = false;

    public void producer(ReentrantLock lock) {

        try {
            lock.lock();
            isAvailable = true;
            System.out.println("lock acquired " + Thread.currentThread().getName());
            Thread.sleep(6000);
        } catch (Exception e) {

        }
        finally {
            lock.unlock();
            System.out.println("lock released " + Thread.currentThread().getName());
        }
    }
}
