package com.example.LLD.Logger;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int level, String msg) {
        if(level == DEBUG) {
            System.out.println("DEBUG"+msg);
        }
        else {
            super.log(level, msg);
        }
    }

}
