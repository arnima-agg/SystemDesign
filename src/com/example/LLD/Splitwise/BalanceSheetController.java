package com.example.LLD.Splitwise;
import java.util.List;
import java.util.Map;

import com.example.LLD.Splitwise.expense.Split;
import com.example.LLD.Splitwise.group.GroupController;
import com.example.LLD.Splitwise.user.User;

public class BalanceSheetController {

    private BalanceSheetController() {}
    public static BalanceSheetController balanceSheetController = null;
    public static BalanceSheetController getInstance() {
        if(balanceSheetController == null) {
            synchronized (BalanceSheetController.class) {
                if(balanceSheetController == null) {
                    return new BalanceSheetController();
                }
            }
        }
        return balanceSheetController;
    }
    public void updateUserExpenseBalanceSheet(User paidBy, int totalAmount, List<Split> splits) {
        BalanceSheet userPaidByBalanceSheet = paidBy.getBalanceSheet();
        userPaidByBalanceSheet.setTotalPaid(userPaidByBalanceSheet.getTotalPaid() + totalAmount);

        for(Split split : splits) {
            User splitUser = split.getUser();
            BalanceSheet splitUserBalanceSheet = split.getUser().getBalanceSheet();
            int splitAmount = split.getAmount();

            if(splitUser.getId() == paidBy.getId()) {
                userPaidByBalanceSheet.setTotalExpense(userPaidByBalanceSheet.getTotalExpense() + splitAmount);
            } else {
                Balance paidByUserBalance;
                userPaidByBalanceSheet.setTotalGetBack(userPaidByBalanceSheet.getTotalGetBack() + splitAmount);
                if(userPaidByBalanceSheet.getUserBalanceMap().containsKey(splitUser.getId())) {
                    paidByUserBalance = userPaidByBalanceSheet.getUserBalanceMap().get(splitUser.getId());
                } else {
                    paidByUserBalance = new Balance();
                }
                paidByUserBalance.setAmountGetBack(paidByUserBalance.getAmountGetBack() + splitAmount);
                userPaidByBalanceSheet.getUserBalanceMap().put(splitUser.getId(), paidByUserBalance);

                splitUserBalanceSheet.setTotalExpense(splitUserBalanceSheet.getTotalExpense() + splitAmount);
                splitUserBalanceSheet.setNeedToPay(splitUserBalanceSheet.getNeedToPay() + splitAmount);

                Balance userOwe;
                if(splitUserBalanceSheet.getUserBalanceMap().containsKey(paidBy.getId())) {
                    userOwe = splitUserBalanceSheet.getUserBalanceMap().get(paidBy.getId());
                } else {
                    userOwe = new Balance();
                }
                userOwe.setAmountOwe(userOwe.getAmountOwe() + splitAmount);
                splitUserBalanceSheet.getUserBalanceMap().put(paidBy.getId(), userOwe);

            }
        }
    }

    public void showBalance(User user) {
        BalanceSheet balanceSheet = user.getBalanceSheet();
        System.out.println("Balance sheet of user" + user.getName());
        System.out.println("Total expense" + balanceSheet.getTotalExpense());
        System.out.println("Total Owe" + balanceSheet.getNeedToPay());
        System.out.println("Total payment done by you" + balanceSheet.getTotalPaid());
        System.out.println("Total you will get back" + balanceSheet.getTotalGetBack());
        for(Map.Entry<Integer, Balance> mp : balanceSheet.getUserBalanceMap().entrySet()) {
            int userid = mp.getKey();
            Balance balance = mp.getValue();
            System.out.println("userId : " + userid + "you get back : " + balance.getAmountGetBack()  + " you owe : " + balance.getAmountOwe());
        }
    }

}
