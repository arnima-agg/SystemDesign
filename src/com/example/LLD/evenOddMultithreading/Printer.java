package com.example.LLD.evenOddMultithreading;

public class Printer implements Runnable{

    public int currValue;
    private final State state;
    public PrinterType currState;
    public PrinterType nextState;
    public int increment;
    public int maxValue;

    public Printer(int currValue, State state, PrinterType currState, PrinterType nextState, int increment,
            int maxValue) {
        this.currValue = currValue;
        this.state = state;
        this.currState = currState;
        this.nextState = nextState;
        this.increment = increment;
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
        while (currValue <= maxValue) {
            synchronized (state) {
                System.out.println(this.currState + " " + state.getNextToPrint());
                if(this.currState != state.getNextToPrint()) {
                    try {
                        state.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(currState + " " + currValue);
                currValue += increment;
                state.setNextToPrint(this.nextState);
                state.notifyAll();
            }
        }
    }
}
