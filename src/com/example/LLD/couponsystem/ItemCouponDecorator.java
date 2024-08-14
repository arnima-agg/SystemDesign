package com.example.LLD.couponsystem;

import java.util.ArrayList;
import java.util.List;

public class ItemCouponDecorator extends CouponDecorator {

    Product product;
    int discount;
    ProductType productType;

    public ItemCouponDecorator(Product product, int discount, ProductType productType) {
        this.product = product;
        this.discount = discount;
        this.productType = productType;
    }

    static List<ProductType> eligibleTypes = new ArrayList<>();
    static {
        eligibleTypes.add(ProductType.ELECTRONIC);
        eligibleTypes.add(ProductType.FURNITURE);
    }


    public int applyCoupon() {
        int returnValue = 0;
        if(eligibleTypes.contains(productType)) {
            int price = product.applyCoupon();
            returnValue = price - (price*discount)/100;
        }
        return returnValue;
    }

}
