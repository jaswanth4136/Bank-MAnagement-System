package bank.service;

import bank.exceptions.InsufficientBalanceException;
import bank.models.BankAccount;
import bank.models.Customer;


public class Withdraw extends BankAccount {

    public Withdraw(int accountNo, String account_HolderName, double balance, Customer customer) {
        super(accountNo, account_HolderName, balance, customer);
    }

    @Override
    public void withdraw(double amount){
        if(amount > balance || balance <= 0){
            throw new InsufficientBalanceException ("Insufficient Balance");
        }
        else{
            balance -= amount;
        }

    }

}
