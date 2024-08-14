package com.example.LLD.Calculator;

public class Main {
    public static void main(String[] args) {

        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExp = new Expression(one, seven, Operations.ADD);
        ArithmeticExpression res1 = new Expression(two, addExp, Operations.MULTIPLY);

        System.out.println("value is" + res1.evaluate());

    }
}
