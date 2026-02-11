package com.eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {
    /**
     * Bank Accounts
     * checking and savings to understand the inheritance in java
     */

    public String accNumber;
    public BigDecimal accBalance;

    public Accounts(String accNumber,BigDecimal accBalance) {
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
    public BigDecimal depositAmount(BigDecimal deposit) {
        setAccBalance(accBalance.add(deposit));
        return deposit;
    }

    //method to withdrawAmount
    public BigDecimal withDrawAmount(BigDecimal withdraw) {
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();
    }
    public BigDecimal something(){
        return new BigDecimal(10);
    }

    //abstract doesnt have anybody
    //won't create any memory just register with method signature
    public abstract void printAccountDetails();
    }

