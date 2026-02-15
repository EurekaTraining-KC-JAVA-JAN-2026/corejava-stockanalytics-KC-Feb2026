package com.Pratice;

import java.math.BigDecimal;

public class mainAccount {
    public static void main(String[] args)
    {
        checkings checkingAcc = new checkings("1234",new BigDecimal("100"));
        checkingAcc.depositAmount(new BigDecimal("100"));

        System.out.println(checkingAcc.accNumber);
        System.out.println(checkingAcc.accbalance);

        System.out.println(checkingAcc.withdrawAmount(new BigDecimal("100")));


        savings savingsAcc = new savings("3434", new BigDecimal("1000"));
        System.out.println(savingsAcc.getAccNumber());
        System.out.println(savingsAcc.getAccbalance());


        System.out.println(savingsAcc.depositAmount(new BigDecimal("1000")));
    }
}
