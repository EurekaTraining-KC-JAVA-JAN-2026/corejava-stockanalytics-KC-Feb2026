package com.eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        Checkings accountChecking1 = new Checkings("123456", new BigDecimal(20));
        Savings accountSaving1 = new Savings("235456", new BigDecimal(20));

        System.out.println(accountChecking1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        Accounts accountChecking2 = new Checkings("123456", new BigDecimal(100));
        Accounts accountSaving2 = new Savings("235456", new BigDecimal(200));
    }
}