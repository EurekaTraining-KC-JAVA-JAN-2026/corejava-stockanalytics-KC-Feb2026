package com.eurekaAccounts;

import java.math.BigDecimal;

public  abstract class Accounts {
    /**
     * Bank accounts
     * checking and savings to understand inheritence
     */
    public String accNumber;
    public BigDecimal accBalance;

    public Accounts(String accNumber, BigDecimal accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public Accounts() {
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
    //method to deposit
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    //method to withdraw
    public BigDecimal withDrawAmount (BigDecimal withdraw){
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();
    }
    //abstract dosent have body and dont create memory space just registers with method signature
    public abstract void printAccountDetails();
}
