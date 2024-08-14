package com.example.LLD.ProducerConsumer;

public class SharedResource {
    boolean itemAvailable = false;

    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Producer has produces the item");
        notifyAll();
    }

    public synchronized void consumeItem() {
        while(!itemAvailable) {
            try {
                System.out.println("waitng inside consumer thread");
                wait();
            } catch (Exception e) {
                //try to handle exception
            }
        }
        System.out.println("consumer thread executed");
        itemAvailable = false;
    }

}
