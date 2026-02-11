package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        Checkings accountChecking1= new Checkings("1234567",new BigDecimal(20));
        Savings accountSaving1 = new Savings("233456", new BigDecimal(10));
        System.out.println(accountChecking1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));
        // polymorphism creating objects from parent class
        // same class behaving differently on different calls
        // benefit -
        // arrays will hold homogeneous elements
        Accounts accountChecking2 = new Checkings("124554",new BigDecimal(100));
        Accounts accountSaving2 = new Savings("12243546",new BigDecimal(200));
        Accounts[] accountsArray = new Accounts[]{accountChecking1,accountSaving1,accountChecking2,accountSaving2};
        // printing account details
        accountChecking1.printAccountDetails();

    }
}