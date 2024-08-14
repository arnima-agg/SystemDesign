package com.example.LLD.PizzaPriceCalculator;

import java.util.TreeMap;

public class MargeritaPizza implements BasePizza{

    TreeMap<Integer, Integer> mp = new TreeMap<>();
    public int cost() {
        return 200;
    }

}
