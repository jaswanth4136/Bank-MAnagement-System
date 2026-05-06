package bank.models;

import java.io.Serializable;
public class Customer implements Serializable{
    private int customer_Id;
    private String customerName;
    private int phoneNo;
    private String eMail;


    public void getCustomerDetails(int customerId){
        System.out.println(customer_Id + " "
                + customerName + " "
                + phoneNo + " "
                + eMail
        );

    }

    public int getCustomerId(){
        return customer_Id;
    }

}
