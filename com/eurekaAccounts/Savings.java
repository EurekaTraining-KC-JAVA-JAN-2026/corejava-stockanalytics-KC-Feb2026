package com.eurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(String accNumber,BigDecimal accbalance) {
        super(accNumber, accbalance );
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is :" +aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("Total Balance is: ");
        return getAccBalance();
    }

    @Override
    public void printAccountsDetails(){
        System.out.println("Account Details are: "+"\n"
                +"Account Number "+getAccNumber()+"\n"
                +"\n"+ "Account Balance"+getAccBalance());

    }
}
