package Eurekaaccounts;

import java.math.BigDecimal;

public class Savings extends Accounts{
    public static BigDecimal APR=new BigDecimal(0.8);

    public Savings(String accNumber,BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(20.00)));
        System.out.println("amount is"+aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("total balance is:");
        return getAccBalance();
    }

    @Override
    public BigDecimal withdrawAmout(BigDecimal deposit) {
        return null;
    }

    @Override
    public void printAcoountDetails(){

    }
}
