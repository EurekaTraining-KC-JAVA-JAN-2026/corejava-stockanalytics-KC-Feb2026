package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        //here created from child class
        Checkings accountChecking1 =new Checkings("123456",new BigDecimal(20));
        Savings accountSaving1 = new Savings("233456", new BigDecimal(10));
        System.out.println(accountChecking1.withDrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can also create the objects from  parent class
         * same class behaving differently on different calls
         * Benifit
         */

        Accounts accountChecking2= new Checkings("12345", new BigDecimal(100));
        Accounts accountSaving2= new Savings("23456", new BigDecimal(200));
        //real benefit of polymorphism
        Accounts[] accountArray = new Accounts[]{accountSaving1,accountChecking1,accountSaving2,accountChecking2};

        //printing account details from abstract method
        accountChecking1.printAccountDetails();
        accountSaving1.printAccountDetails();


    }
}
