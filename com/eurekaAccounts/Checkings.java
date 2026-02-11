// Checkings.java
package com.eurekaAccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts {
    public static BigDecimal cashBack = new BigDecimal(10.0);

    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accBalance, accNumber);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withdraw) {
        BigDecimal cashB = withdraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawal of" + withdraw + " is Success");
        System.out.println("You got cashback of " + cashB + " at " + cashBack + "% rate");
        setAccBalance(getAccBalance().subtract(withdraw).add(cashB));
        System.out.println("Remaining balance in the Account: " + getAccBalance());
        return getAccBalance();
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Checking Account Number: " + getAccNumber());
        System.out.println("Checking Account Balance: " + getAccBalance());
    }
}