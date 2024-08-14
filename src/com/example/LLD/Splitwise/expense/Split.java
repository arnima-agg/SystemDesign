package com.example.LLD.Splitwise.expense;

import com.example.LLD.Splitwise.user.User;

public class Split {
    User user;
    int amount;

    public Split(User user, int amount) {
        this.amount = amount;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
