package com.example.LLD.Logger;

public class InfoLogProessor extends LogProcessor{

    public InfoLogProessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int level, String msg) {
        if(level == INFO) {
            System.out.println("INFO"+msg);
        }
        else {
            super.log(level, msg);
        }
    }
}
