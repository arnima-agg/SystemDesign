package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HelloWorld {
    public static void main(String [] args)
    {
        System.out.println("Hello World");
        String value = getAmountInHigherDenomination(10067889, "USD");
        System.out.println(value);
    }

    public static String getAmountInHigherDenomination(long amount, String currencyCode) {
        java.util.Currency currency = java.util.Currency.getInstance(currencyCode);
        Double fraction = Math.pow(10, currency.getDefaultFractionDigits());
        BigDecimal convertedAmount = BigDecimal.valueOf(amount).
                divide(BigDecimal.valueOf(fraction), currency.getDefaultFractionDigits(), RoundingMode.UNNECESSARY);
        return convertedAmount.toString();
    }

}
