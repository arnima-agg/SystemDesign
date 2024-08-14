package com.example.LLD.Multithreading.printsequence;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String args[]) {
//        PrintSequence ps1 = new PrintSequence(1, 3);
//        PrintSequence ps2 = new PrintSequence(2, 3);
//        PrintSequence ps3 = new PrintSequence(0, 3);
//
//        Thread t1 = new Thread(ps1, "T1");
//        Thread t2 = new Thread(ps2, "T2");
//        Thread t3 = new Thread(ps3, "T3");
//        t1.start();
//        t2.start();
//        t3.start();
        AtomicInteger count = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                count.getAndIncrement();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                count.getAndIncrement();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch(Exception e) {

        }

        System.out.println(count.get());
    }
}
