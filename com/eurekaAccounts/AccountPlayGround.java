package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountPlayGround {
    public static void main(String[] args) {
        Checkings accountchecking1 = new Checkings("213456",new BigDecimal(20));
        Savings accountsaving1 = new Savings("1324576",new BigDecimal(10));
        System.out.println(accountchecking1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountsaving1.depositAmount(new BigDecimal(20)));
        /**
         * polymorphism
         * we can also create the objects from the parent class
         * it will have same class but deferent behaviour on diff calls
         * benifit:-
         * int arr[] = new
         * we can hold values of diff type in array with help of polymorphism
         * generally arrys hold same type data
         */
        // we are creating objects from the parent class
        Accounts accountCheckings2 = new Checkings("12345",new BigDecimal(108));
        Accounts accountsSavings2 = new Savings("2345",new BigDecimal(200));
        Accounts[] accountsArray = new Accounts[]{accountsaving1,accountchecking1,accountsSavings2,accountCheckings2};
        accountchecking1.printAccountDetails();

    }
}
