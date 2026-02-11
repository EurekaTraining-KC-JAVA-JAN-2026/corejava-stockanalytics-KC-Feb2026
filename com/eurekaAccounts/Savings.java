package com.eurekaAccounts;

import java.math.BigDecimal;
//if you are extending the Abstract class for sure you should implement the abstract methods in that abstract class
public class Savings extends Accounts{
    public static BigDecimal APR = new BigDecimal(0.8); //year

    public Savings( String accNumber,BigDecimal accBalance) {
        super(accNumber,accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit){
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.8)));
        System.out.println("APR amount is :"+aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.print("Total Balance is :");
        return getAccBalance();
    }

    @Override
    public void printAccountDetails(){

    }
}
