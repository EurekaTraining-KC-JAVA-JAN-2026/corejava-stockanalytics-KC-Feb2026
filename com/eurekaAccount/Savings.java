package com.eurekaAccount;

import java.math.BigDecimal;
//if you extending the abstract class for sure you should implemeny the abstract method in the abstract class
public class Savings extends Accounts {

    // Annual Percentage Rate (20%)
    public static final BigDecimal APR = new BigDecimal("20");

    public Savings(BigDecimal accBalance, String accNumber) {
        super(accBalance, accNumber);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {

        // Calculate APR amount: (deposit * APR) / 100
        BigDecimal aprAmount = deposit.multiply(APR).divide(new BigDecimal("100"));

        System.out.println("APR amount is: " + aprAmount);

        setAccBalance(getAccBalance().add(deposit).add(aprAmount));

        System.out.println("Total balance is:");

        return getAccBalance();
    }
    @Override
    public void printAccountDetails() {
        System.out.println(
                "Savings Account | Account Number: " + getAccNumber()
                        + " | Balance: " + getAccBalance()
        );
    }

}
