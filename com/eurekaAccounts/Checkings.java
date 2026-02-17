package com.eurekaAccounts;

import java.math.BigDecimal;

//here we are extending Parent class Accounts to get the prop's like AccNum and AccBal
public class Checkings extends Accounts{
    public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings( String accNumber,BigDecimal accBalance) {
        super( accNumber,accBalance);
    }

    @Override//annotation
    public BigDecimal withdrawAmount(BigDecimal withDraw){
        //here Im calculating the cashBack promo amount because its checking account
        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawl of "+withDraw+" is Success");
        //here Im deducting the withDraw amount from accountBalace
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("You got cashback of "+cashB +" at "+cashBack+"% rate");
        //here Im adding the the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();
    }
    @Override
    public void something(){
        System.out.println("Account Details(by ):"+"\n"
                +"Account Number "+getAccNumber() +" \n"
                +"Account Balance "+getAccBalance()
        );
    }
    @Override
    public void printAccountDetails(){
        System.out.println("Account Details(by ):"+"\n"
            +"Account Number "+getAccNumber() +" \n"
                +"Account Balance "+getAccBalance()
        );
    }
}
