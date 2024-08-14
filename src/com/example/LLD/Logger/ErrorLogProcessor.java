package com.example.LLD.Logger;

public class ErrorLogProcessor extends LogProcessor{


    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int level, String msg) {
        if(level == ERROR) {
            System.out.println("ERROR"+msg);
        }
        else {
            super.log(level, msg);
        }
    }
}
