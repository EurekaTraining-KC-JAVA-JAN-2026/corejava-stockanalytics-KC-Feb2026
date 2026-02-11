package com.eurekaAccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts {

      public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings(String accountNumber, BigDecimal accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withDraw) {
        //Calculating the cashback promo amount because its checking account
         BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
         System.out.println("Withdrawal of " + withDraw + "is Success!");
         //here we are deducting the withdraw amount from accountBalance
         setAccountBalance(getAccountBalance().subtract(withDraw));
         System.out.println("You got cashback of " + cashB + "at " + cashBack + "% rate");
         setAccountBalance(getAccountBalance().add(cashB));
         System.out.println("Remaining balance in the account");
         return getAccountBalance();

    }

    @Override
    public void printAccountDetails() {
        System.out.println("Account Details(by):" + "\n"
        +"Account number " + getAccountNumber() + "\n"
        + "Account Balance" + getAccountBalance()
        );
    }

    public void newMethod() {
        System.out.println("");
    }


}
