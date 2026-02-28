package com.eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {

    /**
     * Bank Accounts
     * Checkings and Savings to Understanding the inheritance in java
     */

    private String accNumber;
    private BigDecimal accBalance;

    public Accounts(String accNumber, BigDecimal accBalance ){
        this.accNumber = accNumber;
        this.accBalance = accBalance;

    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }



    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    //method i
    public BigDecimal withdrawAmount(BigDecimal withDraw){
        setAccBalance(accBalance.subtract(withDraw));
        return getAccBalance();
    }
    public BigDecimal something(){
        return new BigDecimal(10);
    }

    //method to see accountDetails
    //Abstract doesn't have any body
    public abstract void printAccountDetails();

    @Override
    public String toString() {
        return "Accounts{" +
                "accNumber='" + accNumber + '\'' +
                ", accBalance=" + accBalance +
                '}' + '\n';
    }
}
