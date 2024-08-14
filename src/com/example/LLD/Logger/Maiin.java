package com.example.LLD.Logger;

public class Maiin {

    public static void main(String[] args ) {

        LogProcessor loggerObject = new InfoLogProessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
            loggerObject.log(LogProcessor.INFO, "info");
            loggerObject.log(LogProcessor.ERROR, "error");
            loggerObject.log(6, "debug");
    }
}
