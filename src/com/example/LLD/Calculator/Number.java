package com.example.LLD.Calculator;

public class Number implements ArithmeticExpression{
    public int value;

    public Number(int value) {
        this.value = value;
    }

    public int evaluate() {
        System.out.println("num is " + value);
        return value;
    }

}
