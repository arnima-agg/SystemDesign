package com.example.LLD.Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultithreadingImpl {
    CustomThreadFactory customThreadFactory;

    public static void main(String [] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new RejectThreadExecutor());

        for(int i=0;i<8;i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Thread name : " + Thread.currentThread().getName());
                } catch (Exception e) {
                    //no exception
                }
            });
        }
    }
}

