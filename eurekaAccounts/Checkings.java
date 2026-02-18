package eurekaAccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts{
    public BigDecimal cashback = new BigDecimal((3.0));

    public Checkings(String accNumber,BigDecimal accBalance){
        super(accNumber, accBalance);
    }

    @Override
    public void printAccDetails() {

    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withdraw){
        BigDecimal cashB = withdraw.multiply(cashback).divide(new BigDecimal(100));
        System.out.println("Withdrawl of "+withdraw+"is success");

        System.out.println("withdrawl of"+withdraw+"is success");
        System.out.println("you get cashback of "+cashB +" at"+cashback+"% rate");
        setAccBalance(cashB);
        System.out.println("Remaining balance in the Account");
        return getAccBalance();

    }


}
