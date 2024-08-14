package com.example.LLD.evenOddMultithreading;

public class Main {

    public static void main(String [] args) {

        State state = new State(PrinterType.ODD);
        Printer oddPrinter = new Printer(1, state, PrinterType.ODD, PrinterType.EVEN,2, 30);
        Printer evenPrinter = new Printer(2, state, PrinterType.EVEN, PrinterType.ODD,2, 30);

        final Thread odd = new Thread(oddPrinter);
        final Thread even = new Thread(evenPrinter);

        odd.start();
        even.start();
    }
}
