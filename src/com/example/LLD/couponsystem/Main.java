package com.example.LLD.couponsystem;

public class Main {
    public static void main(String args[]) {
        Product product1 = new Item1(1, "tv", ProductType.ELECTRONIC, 1000);
        Product product2 = new Item2(2, "chair", ProductType.FURNITURE, 5000);
        Cart cart = new Cart();
        cart.addItemToCart(product1);
        cart.addItemToCart(product2);

        System.out.println("total price from cart " + cart.finalPrice());
    }
}
