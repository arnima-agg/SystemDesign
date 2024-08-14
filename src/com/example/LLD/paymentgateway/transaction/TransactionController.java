package com.example.LLD.paymentgateway.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.paymentgateway.instrument.InstrumentManager;

public class TransactionController {
    Map<Integer, List<Transaction>> transactionHistory = new HashMap<>();
    InstrumentManager instrumentManager;

    public void performTransaction(Transaction transaction) {
        String s1 = "ab", s2 = "be";
        s1.compareTo(s2);
        int senderId = transaction.getSender().getUserId();
        int receiverId = transaction.getReceiver().getUserId();
        if(!transactionHistory.containsKey(senderId)) {
            transactionHistory.put(senderId, new ArrayList<>());
        }
        if(!transactionHistory.containsKey(receiverId)) {
            transactionHistory.put(receiverId, new ArrayList<>());
        }
        List<Transaction> senderTransactions = transactionHistory.get(senderId);
        List<Transaction> receiverTransactions = transactionHistory.get(receiverId);

        senderTransactions.add(transaction);
        receiverTransactions.add(transaction);

    }

    public void getTransactionHistory(int userId) {
        List<Transaction> transactions = transactionHistory.get(userId);
        if(transactions.size() == 0) {
            System.out.println("No transactions present");
        }
        for(Transaction transaction : transactions) {
            System.out.println(transaction.getTransactionId() + " amount " + transaction.getAmount() + " sent to " + transaction.getReceiver().getUserId());
        }
    }
}
