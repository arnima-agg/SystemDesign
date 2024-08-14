package com.example.LLD.paymentgateway.transaction;

import com.example.LLD.paymentgateway.instrument.Instrument;
import com.example.LLD.paymentgateway.user.User;

public class Transaction {
    private String transactionId;
    private User sender;
    private User receiver;
    private int amount;
    private Instrument senderInstrument;
    private TransactionStatus transactionStatus;

    public Transaction(String transactionId, User sender, User receiver, int amount, Instrument senderInstrument,
            TransactionStatus transactionStatus) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.senderInstrument = senderInstrument;
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Instrument getSenderInstrument() {
        return senderInstrument;
    }

    public void setSenderInstrument(Instrument senderInstrument) {
        this.senderInstrument = senderInstrument;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
