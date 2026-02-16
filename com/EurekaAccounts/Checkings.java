package com.EurekaAccounts;

import java.math.BigDecimal;

// here we are extending parent class Accounts to get the pro like accNum and accBalace

// as we discussed before account is like a class and we creating another class as checking accounts we will use extend keyword to get
// the properties like accNum and account balance

public class Checkings extends Accounts {

    // we are assuming that we nedd to provide cashback for each withdrwal
    // to avoid these line to changed we can just put it is as a static
    public static BigDecimal cashBack = new BigDecimal(3.0);

// creating a constructor
    // as it is extending or getting the behaviours from the other class we are getting them from accounts
    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    // and then for withdrawls we just need to get debit


    @Override // annotation
    public BigDecimal withdrawAmount(BigDecimal withDraw){

        // here i am calculating the cashBack promo amount because its checking account
        BigDecimal cashB =withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("withdrawl of "+withDraw+" is success");
        //here im deducting the withdraw amonutfrom accountBalance
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("you get cashback of "+cashB+"at "+cashBack+"% rate");
        // here im adding the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();
    }

    @Override
    public BigDecimal something(){
        System.out.println("Account Details are: "+"\n"+"Account Number"+getAccBalance()+"\n"+"Account Balance"+getAccBalance());

        return null;
    }

    @Override
    public void printAccountDetails(){
        System.out.println("Account Details are: "+"\n"+"Account Number"+getAccBalance()+"\n"+"Account Balance"+getAccBalance());

    }

}
