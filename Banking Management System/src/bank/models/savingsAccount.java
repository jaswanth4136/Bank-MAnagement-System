package bank.models;
import java.util.Scanner;

public class savingsAccount extends BankAccount{
    public savingsAccount(int acctNo, String acctHolderName, double balance){
        super(acctNo, acctHolderName, balance);
    }
    Scanner sc = new Scanner(System.in);
    private final double overDraftLimit = 5000;
    private final double interest = 4.0;

    public void withdraw(double amount) {

        if(balance + overDraftLimit >= amount){
            balance -= amount;
        } else {
            throw new RuntimeException("Amount Exceed The Limit");
        }

    }

    public double calculateInterest(){
        return (balance * interest)/100;
    }
}
