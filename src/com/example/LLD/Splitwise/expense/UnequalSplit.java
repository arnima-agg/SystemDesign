package com.example.LLD.Splitwise.expense;

import com.example.LLD.Splitwise.expense.ExpenseSplit;

public class UnequalSplit implements ExpenseSplit {

    @Override public boolean validateRequest() {
        return false;
    }
}
