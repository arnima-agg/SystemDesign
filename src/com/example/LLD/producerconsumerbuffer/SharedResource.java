package com.example.LLD.producerconsumerbuffer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    Queue<Integer> buffer;
    int buffersize;

    public SharedResource(int buffersize) {
        this.buffersize = buffersize;
        buffer = new LinkedList<>();
    }

    public synchronized void producer(int item) {
        while(buffer.size() == buffersize) {
            System.out.println("Waiting for buffer to free");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        buffer.add(item);
        System.out.println(item + " added to buffer");
        notify();
    }

    public synchronized void consumer() {
        while(buffer.isEmpty()) {
            System.out.println("No item left");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        int item = buffer.poll();
        System.out.println("Consumer item " + item);
        notify();
    }
}
