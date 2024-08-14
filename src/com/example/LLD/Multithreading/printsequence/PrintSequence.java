package com.example.LLD.Multithreading.printsequence;

public class PrintSequence implements Runnable {

    public static int count = 1;
    public final int threadCount;
    public final int currThread ;
    public static final Object lock = new Object();
    private int totalCount = 100;
    public PrintSequence(int currThread, int threadCount) {
        this.currThread = currThread;
        this.threadCount = threadCount;
    }

    @Override
    public void run() {
        while(count < totalCount) {
            synchronized (lock) {
                while(count % threadCount != currThread) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + count);
                count++;
                lock.notifyAll();
            }
        }
    }

}
