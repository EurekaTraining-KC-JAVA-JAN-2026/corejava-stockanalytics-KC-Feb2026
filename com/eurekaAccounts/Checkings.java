package com.eurekaAccounts;

import java.math.BigDecimal;

//it is a child class of Accounts class
//extending parent class accounts to get prop like Accnum and AccBal
public class Checkings extends Accounts{

    public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings() {
    }

    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }


    @Override//overiding from parennt class
    public BigDecimal withdrawAmount(BigDecimal withDraw) {
        //here in calculating the cashback promo amount because its checking account
        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("Withdraw of " + withDraw + "Sucess ");
        System.out.println("you got cashback of " + cashB + "at" + cashBack + "% rate");
        //here im adding the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();

    }

//
//


    @Override
    public void printAccountDetails() {
        System.out.println("AccountsDetails:"+" " +
                "accNumber='" + getAccNumber()+ "\n" +
                " accBalance=" + getAccBalance()
                );
    }
}
