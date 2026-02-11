package com.eurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(String accNumber, BigDecimal accBalance) {
        super(accBalance, accNumber);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is: " + aprAmount);
        setAccBalance(getAccBalance().add(deposit).add(aprAmount));
        System.out.println("Total Balance is: " + getAccBalance());
        return getAccBalance();
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Savings Account Number: " + getAccNumber());
        System.out.println("Savings Account Balance: " + getAccBalance());
    }
}