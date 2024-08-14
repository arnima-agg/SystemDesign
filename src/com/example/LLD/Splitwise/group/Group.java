package com.example.LLD.Splitwise.group;

import java.util.ArrayList;
import java.util.List;

import com.example.LLD.Splitwise.expense.Expense;
import com.example.LLD.Splitwise.expense.ExpenseController;
import com.example.LLD.Splitwise.user.User;

public class Group {
    int groupId;
    String groupName;
    List<User> users;
    List<Expense> expenseList;

    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.users = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }

    ExpenseController expenseController;

}
