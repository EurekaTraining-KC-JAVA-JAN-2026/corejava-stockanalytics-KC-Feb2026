package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String args[]) {
        Checkings accountCheckings1 = new Checkings("123456", new BigDecimal(20));
        Savings accountSavings1 = new Savings("233456", new BigDecimal(10));

        System.out.println(accountCheckings1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSavings1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can also create the objet from parent class
         *Same class behaving differently on different calls
         */
        Accounts accountCheckings2 = new Checkings("12345", new BigDecimal(100));
        Accounts accountsavings2 = new Savings("2345", new BigDecimal(200));
        //The real benefit of polymorphism
        Accounts[] accountsArray = new Accounts[]{accountSavings1, accountsavings2, accountCheckings1, accountCheckings2};

        //printing account details from the abstract method
        accountCheckings1.printAccountDetails();
    }
}
