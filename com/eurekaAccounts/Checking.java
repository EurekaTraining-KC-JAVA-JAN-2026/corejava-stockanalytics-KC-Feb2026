package com.eurekaAccounts;

import java.math.BigDecimal;

//here we are extending parent class accounts to get the props like accNum and AccBal
public class Checking extends Accounts {

    public static BigDecimal cashBack = new BigDecimal("3.0");

    public Checking(String accNumber, BigDecimal accBalance) {
        super(accNumber,accBalance);
    }



    @Override //annotation
    public BigDecimal withDrawAmount(BigDecimal withDraw){

        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal("100"));

        System.out.println("Withdrawal of"+withDraw+" at"+cashBack+"% rate");

        // correct logic: subtract withdraw and add cashback
        BigDecimal newBalance = getAccBalance().subtract(withDraw).add(cashB);

        setAccBalance(newBalance);

        System.out.println("Remaining balance in the account");

        return getAccBalance();
    }

    @Override
    public void printAccountDetails(){
        System.out.println("Account Details are :"+"\n"
        +"Account Balance "+getAccBalance()+"\n"+
                "Account Number :"+getAccNumber());
    }
}
