package bank.models;


import java.io.*;

public abstract class BankAccount implements Serializable {
    protected int accountNo;
    protected double balance;
    protected String account_HolderName;

    protected Customer customer;


    public BankAccount(int accountNo, String account_HolderName, double balance, Customer customer){
        this.accountNo = accountNo;
        this.account_HolderName = account_HolderName;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double deposit){
        balance += deposit;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccount(){
        return accountNo;
    }






}
