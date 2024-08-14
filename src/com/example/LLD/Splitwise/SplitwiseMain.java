package com.example.LLD.Splitwise;

import java.util.ArrayList;
import java.util.List;

import com.example.LLD.Splitwise.expense.ExpenseController;
import com.example.LLD.Splitwise.expense.Split;
import com.example.LLD.Splitwise.expense.SplitType;
import com.example.LLD.Splitwise.group.Group;
import com.example.LLD.Splitwise.group.GroupController;
import com.example.LLD.Splitwise.user.User;
import com.example.LLD.Splitwise.user.UserController;

public class SplitwiseMain {

    public static void main(String args[]) {
        User user1 = new User(1, "arnima", "arnima123@gmail.com");
        User user2 = new User(2, "suk", "arnima1234@gmail.com");
        User user3 = new User(3, "rahul", "arnima1235@gmail.com");
        User user4 = new User(4, "dua", "arnima1235@gmail.com");
        User user5 = new User(5, "smriti", "arnima1235@gmail.com");

        UserController userController = UserController.getInstance();
        userController.createUser(user1);
        userController.createUser(user2);
        userController.createUser(user3);

        GroupController groupController = GroupController.getInstance();
        Group group1 = groupController.createGroup(1, "shopping");
        Group group2 = groupController.createGroup(2, "outing");
        groupController.addUser(group1.getGroupId(), user1);
        groupController.addUser(group1.getGroupId(), user2);
        groupController.addUser(group1.getGroupId(), user3);

        groupController.addUser(group2.getGroupId(), user4);
        groupController.addUser(group2.getGroupId(), user5);

        ExpenseController expenseController = ExpenseController.getInstance();
        Split split1 = new Split(user1, 300);
        Split split2 = new Split(user2, 300);
        Split split3 = new Split(user3, 300);
        List<Split> splitList1 = new ArrayList<>();
        splitList1.add(split1);
        splitList1.add(split2);
        splitList1.add(split3);
        expenseController.createExpense(1, "shirt", 900, user1, splitList1, SplitType.EQUAL);

        BalanceSheetController balanceSheetController = BalanceSheetController.getInstance();
        balanceSheetController.showBalance(user1);
        balanceSheetController.showBalance(user2);
        balanceSheetController.showBalance(user3);


    }
}
