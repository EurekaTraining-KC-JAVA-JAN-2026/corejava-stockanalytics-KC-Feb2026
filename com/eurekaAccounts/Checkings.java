package com.eurekaAccounts;

import java.math.BigDecimal;

//here we are extending parent class Accounts to get the prop's like AccNum and AccBal
public class Checkings extends Accounts{
    public static BigDecimal cashBack= new BigDecimal(3.0);

    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    @Override//anotation
    public BigDecimal withDrawAmount(BigDecimal withDraw){
        //here i am claculating the cashback promo amount because its a checking account
        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawel of "+withDraw+" is Success");
        //here i am deducting the withdraw amount
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("You got cashback of "+cashB+" at"+ cashBack+"% rate");
        //here im adding the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();
    }

    @Override
    public void printAccountDetails(){
        System.out.println("Account Details are : "+"\n"+"Account Number " +getAccNumber()+"\n"+"Account Balance "+getAccBalance());
    }
}
