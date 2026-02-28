package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountPlayGround {

    public static void main(String[] args) {

        Checkings accountChecking1 = new Checkings("123456", new BigDecimal("20"));

        Savings accountSaving1 = new Savings("223746", new BigDecimal("10"));

        System.out.println(accountChecking1.withdrawAmount(new BigDecimal("10")));
        /**
         * Polymorphism
         * we can also create the object from parent class
         */
        Accounts accountCheckings2 = new Checkings("12345", new BigDecimal("100"));
        Accounts accountSavings2  = new Savings("24355", new BigDecimal("200"));

        Accounts[] accountArray = new Accounts[]{accountSaving1, accountChecking1,accountSavings2, accountCheckings2 };


        //printing account details from the abstract method
        accountChecking1.printAccountDetails();

    }
}
