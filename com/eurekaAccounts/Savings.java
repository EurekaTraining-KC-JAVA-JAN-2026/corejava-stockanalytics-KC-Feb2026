package com.eurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {

    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(String accountNumber, BigDecimal accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is :" + aprAmount);
        setAccountBalance(getAccountBalance().add(deposit));
        System.out.println("Total Balance is : ");
        return getAccountBalance();
    }

    @Override
    public void printAccountDetails() {

    }
}
