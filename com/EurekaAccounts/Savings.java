package com.EurekaAccounts;

import java.math.BigDecimal;
// if you are extending the abstract class for sure you should implement the abstract methods in that abstarct class
public class Savings extends Accounts {
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is " + aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("total account balance in the ");
    return getAccBalance();
    }

    @Override
    public void printAccountDetails(){

    }

}