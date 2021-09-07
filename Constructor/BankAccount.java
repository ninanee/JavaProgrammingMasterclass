package com.yunni;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public BankAccount(){
        this(123, 0.00, "default", "1234");
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        System.out.println("this is parameter ctor");
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double cash){
        this.balance += cash;
    }

    public void withdraw(double cash){
        if(this.balance-cash < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }else {
            this.balance -= cash;
            System.out.println("Withdrawal of " + cash + "processed. Remaining balance " + this.balance);
        }

    }
}
