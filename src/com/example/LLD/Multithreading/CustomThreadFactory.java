package com.example.LLD.Multithreading;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Stream;

public class CustomThreadFactory implements ThreadFactory {

    HashMap<Integer, String> mp = new HashMap<>();

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        return th;
    }
}
