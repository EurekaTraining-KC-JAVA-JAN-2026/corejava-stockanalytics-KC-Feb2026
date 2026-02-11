package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        //here created from child class
        Checkings accountChecking1 = new Checkings("123456",new BigDecimal(20));
        Savings accountSaving1 =  new Savings("233456", new BigDecimal(10));
        System.out.println(accountChecking1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can create the objects from Parent class
         * same class behave different on different calls
         */
        //array's will only hold values of same type:
        Accounts accountCheckings2 =  new Checkings("12345",new BigDecimal(100));
        Accounts accountSavings2 = new Savings("2345",new BigDecimal(200));
        //the real benefit of polymorphism
        Accounts[] accountsArray = new Accounts[]{accountSaving1,accountChecking1,accountCheckings2,accountSavings2};

        //printing account details from the abstract method

        accountChecking1.printAccountDetails();

    }
}