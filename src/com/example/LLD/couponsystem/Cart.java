package com.example.LLD.couponsystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList;
    int totalPrice;

    public Cart() {
        this.productList = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addItemToCart(Product product) {
        Product productAfterDiscount = new ItemCouponDecorator
                (new PercentageCouponDecorator(product, 10), 20, ProductType.ELECTRONIC);
        productList.add(productAfterDiscount);

    }

    public int finalPrice() {
        for(Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
