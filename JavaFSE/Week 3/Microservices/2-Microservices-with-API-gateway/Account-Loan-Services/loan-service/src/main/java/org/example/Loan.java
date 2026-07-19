package org.example;

public class Loan {
    private String customerId;
    private String loanNumber;
    private String loanType;
    private double loanAmount;

    public Loan(String customerId, String loanNumber, String loanType, double loanAmount) {
        this.customerId = customerId;
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public String getCustomerId() { return customerId; }
    public String getLoanNumber() { return loanNumber; }
    public String getLoanType() { return loanType; }
    public double getLoanAmount() { return loanAmount; }
}