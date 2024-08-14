package com.example.LLD.couponsystem;

public class PercentageCouponDecorator extends CouponDecorator {

    Product product;
    int discount;

    public PercentageCouponDecorator(Product product, int discount) {
        this.product = product;
        this.discount = discount;
    }

    public int applyCoupon() {
        int price = product.getPrice();
        int returnValue = price - (price*discount)/100;
        return returnValue;
    }
}
