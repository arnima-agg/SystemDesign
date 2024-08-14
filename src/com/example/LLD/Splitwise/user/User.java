package com.example.LLD.Splitwise.user;

import com.example.LLD.Splitwise.BalanceSheet;

public class User {

    private int id;
    private String name;
    private String email;
    private BalanceSheet balanceSheet;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balanceSheet = new BalanceSheet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
}
