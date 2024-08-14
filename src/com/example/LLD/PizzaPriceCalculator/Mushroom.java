package com.example.LLD.PizzaPriceCalculator;

public class Mushroom extends Toppings{

    BasePizza basePizza;

    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }
    public int cost() {
        return basePizza.cost()+10;
    }
}
