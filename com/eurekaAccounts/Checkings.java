package com.eurekaAccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts{
//    public static BigDecimal cashBack = new BigDecimal(3.0);
    public static BigDecimal withdrawFee = new BigDecimal(0.01);

    public Checkings(String accNumber, BigDecimal accbalance) {
        super(accNumber, accbalance);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withDraw){
//        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawl of" +withDraw+ "is Success");
//        System.out.println("you got cashback of " +cashB+ "at" +cashBack+ "% rate");
        BigDecimal totalFees = withDraw.multiply(withdrawFee);
//        setAccbalance(getAccbalance().add(cashB));
        setAccbalance(getAccbalance().subtract(withDraw).subtract(totalFees));
        System.out.println("Remaing balance in the account");
        return getAccbalance();

    }

    public void something(){
        //java will create some space in memory
    };
    @Override
    public void printAccountdetails(){};


}
