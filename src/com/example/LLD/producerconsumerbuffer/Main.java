package com.example.LLD.producerconsumerbuffer;

public class Main {

    public static void main(String args[]) {
        SharedResource sharedResource = new SharedResource(3);
        Thread t1 = new Thread(() -> {
            for(int i=0;i<3;i++) {
                sharedResource.producer(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<3;i++) {
                sharedResource.consumer();
            }
        });
        t1.start();
        t2.start();
    }
}
