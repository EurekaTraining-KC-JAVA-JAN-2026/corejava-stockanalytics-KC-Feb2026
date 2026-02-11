package com.eurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {
    //if u r extending abstract class for sure uh should implemt abstract methods in abstract class
    //constructor frm parent class
    public Savings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    public Savings() {
    }

    //intrest on amount
    public static BigDecimal APR = new BigDecimal(20.00);

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is:"+aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("final amount");

        return getAccBalance();
    }

    @Override
    public void printAccountDetails() {

    }

}
//explore diff type of inheritance subchild subchild ----


