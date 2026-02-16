package com.eurekaAccount;

import java.math.BigDecimal;

public class Checkings extends Accounts {

    // Cashback percentage (3%)
    private BigDecimal cashBack = new BigDecimal("3");

    // Constructor
    public Checkings(BigDecimal accBalance, String accNumber) {
        super(accBalance, accNumber);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withdraw) {

        // Calculate cashback: (withdraw * cashback) / 100
        BigDecimal cashB = withdraw
                .multiply(cashBack)
                .divide(new BigDecimal("100"));

        System.out.println("Withdrawal of " + withdraw + " is successful");

        // Subtract withdrawn amount
        setAccBalance(getAccBalance().subtract(withdraw));

        System.out.println(
                "You got the cashback of " + cashB + " at " + cashBack + "% rate"
        );

        // Add cashback to balance
        setAccBalance(getAccBalance().add(cashB));

        System.out.println("Remaining balance in Account");

        return getAccBalance();
    }

    @Override
    public void printAccountDetails(){
        System.out.println("Account Details:"+"\n"
        +"Account Number"+ getAccNumber()+ "\n"
        +"Account Balance");
    }
}
