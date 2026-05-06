package bank.models;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNo, String account_HolderName, double balance) {
        super(accountNo, account_HolderName, balance);
    }
    private final double overDraftLimit = 5000;

    public void withdraw(double amount){
        if(balance+overDraftLimit >= amount){
            balance -= amount;
        }
        else{
            throw new RuntimeException("Amount Exceed The Limit");
        }
    }

}
