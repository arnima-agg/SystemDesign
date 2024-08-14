package com.example.LLD.Splitwise.expense;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.Splitwise.BalanceSheetController;
import com.example.LLD.Splitwise.expense.Expense;
import com.example.LLD.Splitwise.expense.ExpenseSplit;
import com.example.LLD.Splitwise.expense.Split;
import com.example.LLD.Splitwise.expense.SplitType;
import com.example.LLD.Splitwise.group.GroupController;
import com.example.LLD.Splitwise.user.User;
import com.example.LLD.Splitwise.user.UserController;

public class ExpenseController {

    private ExpenseController() {}
    public static ExpenseController expenseController = null;
    public static ExpenseController getInstance() {
        if(expenseController == null) {
            synchronized (ExpenseController.class) {
                if(expenseController == null) {
                    return new ExpenseController();
                }
            }
        }
        return expenseController;
    }
    Map<Integer, Expense> expenseMap = new HashMap<>();
    BalanceSheetController balanceSheetController = BalanceSheetController.getInstance();
    UserController userController = UserController.getInstance();

    public Expense createExpense(int expenseId, String desc, int amount, User paidBy, List<Split> splitList, SplitType splitType) {
        Expense expense = new Expense(expenseId, desc, splitList, amount, paidBy, splitType);
        expenseMap.put(expenseId, expense);
        balanceSheetController.updateUserExpenseBalanceSheet(paidBy, amount,splitList );
        return expense;
    }


}
