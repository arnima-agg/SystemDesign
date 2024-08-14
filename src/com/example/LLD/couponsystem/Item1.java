package com.example.LLD.couponsystem;

public class Item1 extends Product {
    public Item1(int productId, String productName, ProductType productType, int price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    @Override public int applyCoupon() {
        return price;
    }
}
