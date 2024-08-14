package com.example.LLD.Calculator;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExp;
    ArithmeticExpression rightExp;
    Operations operation;

    public Expression(ArithmeticExpression leftExp, ArithmeticExpression rightExp, Operations operation) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operation = operation;
    }

    public int evaluate() {
        int value = 0;
        switch (operation) {
            case ADD:
                value = leftExp.evaluate() + rightExp.evaluate();
                break;
            case SUBTRACT:
                value = leftExp.evaluate() - rightExp.evaluate();
                break;
            case MULTIPLY:
                value = leftExp.evaluate() * rightExp.evaluate();
                break;
            case DIVIDE:
                value = leftExp.evaluate() / rightExp.evaluate();
                break;
        }
        System.out.println("value of exp is " + value);
        return value;
    }
}
