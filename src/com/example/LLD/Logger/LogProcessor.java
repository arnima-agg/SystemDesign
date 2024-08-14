package com.example.LLD.Logger;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(int level, String msg) {
        if(nextLogProcessor != null ) {
            nextLogProcessor.log(level, msg);
        }
    }



}
