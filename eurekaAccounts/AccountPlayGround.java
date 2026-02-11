package eurekaAccounts;

import java.math.BigDecimal;

public class AccountPlayGround {
    public static void main(String[] args){
        Checkings accountChecking = new Checkings(new BigDecimal(20),"12345");
        Savings accountSaving=new Savings(new BigDecimal(10),"22456");
        System.out.println(accountChecking.withDrawAmount(new BigDecimal(10)));
        /**
         * polymorphism
         * we can also create the objects from parent class
         * same class behaving differently on different calls
         */

        Accounts accountChecking1= new Checkings(new BigDecimal(100),"12345");

        Accounts accountSaving1=new Savings(new BigDecimal(50),"2467678");

        Accounts[] accountsArray=new Accounts[]{accountChecking1,accountChecking,accountSaving,accountSaving1};
        accountChecking.PrintAccountDetails();
    }

}
