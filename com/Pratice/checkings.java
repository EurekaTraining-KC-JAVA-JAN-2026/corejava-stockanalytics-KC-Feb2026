package com.Pratice;

import java.math.BigDecimal;

public class checkings extends accounts{

    public static BigDecimal withdrawlFee = new BigDecimal("5.0");

    public checkings(String accNumber, BigDecimal accbalance) {
        super(accNumber, accbalance);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withDraw){
        System.out.println("Withdrawl of" + withDraw + "is Success");
        setAccbalance(getAccbalance().subtract(withDraw).subtract(withdrawlFee));
        System.out.println("Remaing balance in the account");
        return getAccbalance();

    }
}
