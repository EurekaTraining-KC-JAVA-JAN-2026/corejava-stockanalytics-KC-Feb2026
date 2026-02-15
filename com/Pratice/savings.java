package com.Pratice;

import java.math.BigDecimal;

public class savings extends  accounts{
    public static BigDecimal interest = new BigDecimal("0.12");

    public savings(String accNumber, BigDecimal accbalance) {
        super(accNumber, accbalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit)
    {
        BigDecimal interestAmount = deposit.multiply(interest.divide(new BigDecimal("12")));
        System.out.println("The interest amount is " +interestAmount);
        setAccbalance(getAccbalance().add(deposit).add(interestAmount));
        return getAccbalance();
    }
}
