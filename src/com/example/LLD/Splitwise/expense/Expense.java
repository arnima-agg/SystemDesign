package com.example.LLD.Splitwise.expense;

import java.util.List;

import com.example.LLD.Splitwise.user.User;

public class Expense {
   private int expenseId;
    private String description;
    private List<Split> userList;
    private int totalAmount;
    private User paidBy;
    private SplitType splitType;

    public Expense(int expenseId, String description, List<Split> userList, int totalAmount, User paidBy,
            SplitType splitType) {
        this.expenseId = expenseId;
        this.description = description;
        this.userList = userList;
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.splitType = splitType;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Split> getUserList() {
        return userList;
    }

    public void setUserList(List<Split> userList) {
        this.userList = userList;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

}
