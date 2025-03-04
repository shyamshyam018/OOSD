package com.library.models;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private String memberUsername;
    private int bookId;
    private Date transactionDate;
    private String type; // "borrow" or "return"

    public Transaction(int transactionId, String memberUsername, int bookId, String type) {
        this.transactionId = transactionId;
        this.memberUsername = memberUsername;
        this.bookId = bookId;
        this.transactionDate = new Date();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Member: " + memberUsername + ", Book ID: " + bookId +
                ", Type: " + type + ", Date: " + transactionDate;
    }
}
