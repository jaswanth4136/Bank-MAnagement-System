package bank.service;

import bank.exceptions.InvalidAmountException;
import bank.models.BankAccount;
import bank.models.Customer;

import java.util.LinkedHashMap;

public class Deposit extends BankAccount{

    private BankAccount bankAcct;

    public Deposit(int accountNo, String account_HolderName, double balance, Customer customer) {
        super(accountNo, account_HolderName, balance, customer);
    }

    public void addDeposit(double amount){
        if(amount > 0) {
            double balance = this.bankAcct.getBalance();
            balance += amount;
        }
        else{
            throw new InvalidAmountException("Invalid Amount Please Enter Valid Amount");
        }
    }


}
