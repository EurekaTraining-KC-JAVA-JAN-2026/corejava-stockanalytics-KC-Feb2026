package com.eurekaAccount;

import java.math.BigDecimal;

public class AccountPlayGround {

    public static void main(String[] args) {

        Checkings accountChecking1 = new Checkings(new BigDecimal("20"), "123456");

        Savings accountSaving1 = new Savings(new BigDecimal("10"), "223746");

        System.out.println(accountChecking1.withdrawAmount(new BigDecimal("10")));
        /**
         * Polymorphism
         * we can also create the object from parent class
         */
        Accounts accountCheckings2 = new Checkings(new BigDecimal("100"), "12345");
        Accounts accountSavings2  = new Savings(new BigDecimal("200"), "24355");

        Accounts[] accountArray = new Accounts[]{accountSaving1, accountChecking1,accountSavings2, accountCheckings2 };


        //printing account details from the abstract method
        accountChecking1.printAccountDetails();

    }
}
