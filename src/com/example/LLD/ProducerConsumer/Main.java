package com.example.LLD.ProducerConsumer;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String []args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(() ->  {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                //exception handle
            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(() -> sharedResource.consumeItem());
        producerThread.start();
        consumerThread.start();
    }
}
