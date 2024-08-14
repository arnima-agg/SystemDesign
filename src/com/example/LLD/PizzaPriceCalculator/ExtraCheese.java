package com.example.LLD.PizzaPriceCalculator;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }
    Integer
    public int cost() {
        return basePizza.cost()+20;
    }
}
