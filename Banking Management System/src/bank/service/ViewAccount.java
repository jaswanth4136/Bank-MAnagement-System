package bank.service;

import bank.models.BankAccount;
import bank.models.Customer;

public class ViewAccount extends BankAccount {
    public ViewAccount(int accountNo, String account_HolderName, double balance, Customer customer) {
        super(accountNo, account_HolderName, balance, customer);

    }

    protected CreateAccount create;
    private int customerId = customer.getCustomerId();

    public void getBankDetails(int customer_Id){
        if(create.customerDetails.containsKey(customer_Id)){
            System.out.println(accountNo + " "
                    + account_HolderName + " "
                    + balance
            );
        }
        else{
            System.out.print("No Customer Found");
        }
    }

}
