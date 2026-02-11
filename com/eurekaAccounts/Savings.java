
package com.eurekaAccounts;

import java.math.BigDecimal;
// if extending an abstract class you must use the abstract method of that abstract class
public class Savings  extends Accounts{
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings() {
    }

    @Override
    public void printAccountDetails() {

    }

    public Savings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit)
    {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR Amount is "+ aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("The total balance is: ");
        return getAccBalance();
    }
}
