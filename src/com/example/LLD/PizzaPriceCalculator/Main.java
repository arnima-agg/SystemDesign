package com.example.LLD.PizzaPriceCalculator;

public class Main {
    public static void main(String [] args) {
        System.out.println("Enter the base pizza 1.VeggieDelight 2.Margerita ");

        BasePizza k = new ExtraCheese(new Mushroom(new VeggieDelight()));
        System.out.println(k.cost());
    }
}
