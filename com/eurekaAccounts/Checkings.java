package com.eurekaAccounts;

import java.math.BigDecimal;

public class Checkings  extends Accounts {
    public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    public Checkings() {
    }
    @Override
    public BigDecimal withdrawAmount(BigDecimal withdraw)
    {
        // Calculating the cashback promo account as it is the checking account
        BigDecimal cashB = withdraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawl of "+ withdraw + " is success");
        // here deducting the withdrawl amount from the account balance
        setAccBalance(getAccBalance().subtract(withdraw));
        System.out.println("We get a cashback of "+ cashB + " at "+ cashBack + " %rate");
        // here adding the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("The remaining balance");
        return getAccBalance();
        //setAccBalance(accBalance.subtract(withdraw));
    }

    @Override
    public void printAccountDetails() {
        System.out.println("AccountsDetails:"+" " +
                "accNumber='" + getAccNumber()+ "/n" +
                " accBalance=" + getAccBalance()
        );
    }

}