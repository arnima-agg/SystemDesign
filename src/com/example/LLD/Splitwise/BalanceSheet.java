package com.example.LLD.Splitwise;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
    int totalExpense;
    int totalPaid;
    int totalGetBack;
    int needToPay;
    Map<Integer, Balance> userBalanceMap;

    public BalanceSheet() {
        this.totalExpense = 0;
        this.totalPaid = 0;
        this.totalGetBack = 0;
        this.needToPay = 0;
        this.userBalanceMap = new HashMap<>();
    }

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(int totalPaid) {
        this.totalPaid = totalPaid;
    }

    public int getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(int totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public int getNeedToPay() {
        return needToPay;
    }

    public void setNeedToPay(int needToPay) {
        this.needToPay = needToPay;
    }

    public Map<Integer, Balance> getUserBalanceMap() {
        return userBalanceMap;
    }

    public void setUserBalanceMap(Map<Integer, Balance> userBalanceMap) {
        this.userBalanceMap = userBalanceMap;
    }
}
