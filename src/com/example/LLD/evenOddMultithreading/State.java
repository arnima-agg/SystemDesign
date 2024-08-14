package com.example.LLD.evenOddMultithreading;

import com.sun.istack.internal.NotNull;

public class State {

    private PrinterType nextToPrint;

    public State(@NotNull final PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }

    public PrinterType getNextToPrint() {
        return nextToPrint;
    }

    public void setNextToPrint(PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }
}
