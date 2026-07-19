package org.example;

public class Account {
    private String customerId;
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String customerId, String accountNumber, String accountType, double balance) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getCustomerId() { return customerId; }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
}