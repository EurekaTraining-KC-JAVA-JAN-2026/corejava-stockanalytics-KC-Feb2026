package eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        //here created from child class
        Checkings accountCheckings1 = new Checkings("123456", new BigDecimal(20));
        Savings accountSaving1 = new Savings("233456", new BigDecimal(10));
        System.out.println(accountCheckings1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can also create the objects from Parent class
         * same class behaving differently on different calls
         * Benefits
         */
        //array's will only hold values of same type
        Accounts accountsCheckings2 = new Checkings("12345", new BigDecimal((100)));
        Accounts accountSavings2 = new Savings("2345", new BigDecimal(200));

        Accounts[] accountsArray =  new Accounts[]{accountSaving1, accountCheckings1, accountSavings2,accountsCheckings2};

        accountCheckings1.printAccountsDetails();

    }
    }

