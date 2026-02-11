package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        Checking accountChecking1 = new Checking("1234456",new BigDecimal(9999999));
        Savings accountSavings1 = new Savings("234456", new BigDecimal(10)) {
            @Override
            public void printAccountDetails() {

            }
        };
        System.out.println(accountChecking1.withDrawAmount(new BigDecimal(10)));
        System.out.println(accountSavings1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can also create the objects from parent class
         * same class behaving differently on different calls
         */
        //array's will only hold values of same type:

        Accounts accountCheckings2 = new Checking("12345566",new BigDecimal(100));
        Accounts accountSavings2 = new Savings("234566778", new BigDecimal(200)) {

            @Override
            public void printAccountDetails() {

            }
        };

        Accounts[] accountsArray = new Accounts[]{accountSavings1,accountChecking1,accountSavings2,accountCheckings2};
        // printing account details
        accountChecking1.printAccountDetails();
    }
}
