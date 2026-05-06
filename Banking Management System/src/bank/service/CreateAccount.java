package bank.service;

import bank.models.BankAccount;
import bank.models.Customer;

import java.util.LinkedHashMap;

public class CreateAccount extends BankAccount {
    protected LinkedHashMap<Integer, Integer> customerDetails = new LinkedHashMap<>();
    public CreateAccount(int accountNo, String account_HolderName, double balance, Customer customer) {
        super(accountNo, account_HolderName, balance, customer);

    }


    public void addCustomer(Customer customer, BankAccount account){
        if(customerDetails.containsKey(customer.getCustomerId())){
            System.err.print("Duplication found!! \n Cannot Add a customer more than once");
        }
        else {
            customerDetails.put(customer.getCustomerId(), account.getAccount());
            customer.getCustomerDetails(customer.getCustomerId());

        }

    }
}
