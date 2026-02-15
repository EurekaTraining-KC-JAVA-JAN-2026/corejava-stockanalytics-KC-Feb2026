package com.eurekaAccounts;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Savings extends Accounts{

    public static BigDecimal APR = new BigDecimal(0.12);

    public Savings(String accNumber, BigDecimal accbalance) {
        super(accNumber, accbalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit){
        BigDecimal aprAmount = deposit.multiply(APR.divide(new BigDecimal(12), 5, RoundingMode.HALF_UP));
        System.out.println("APR amount is :" +aprAmount);
        setAccbalance(getAccbalance().add(deposit).add(aprAmount));
        System.out.println("Total balance is : ");
        return getAccbalance();
    }
    @Override
    public  void printAccountdetails(){};
}
