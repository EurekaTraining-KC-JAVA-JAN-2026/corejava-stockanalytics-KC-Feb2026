package com.eurekaAccounts;

import java.math.BigDecimal;

public  abstract class Accounts {
    // accounts checking and saving accounts
    public String accNumber;
    public BigDecimal accBalance;

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
    public BigDecimal depositAmount(BigDecimal deposit)
    {
        setAccBalance(accBalance.add(deposit));
        return accBalance;
    }
    public BigDecimal withdrawAmount(BigDecimal withdraw)
    {
        setAccBalance(accBalance.subtract(withdraw));
        return accBalance;
    }

    public Accounts(String accNumber, BigDecimal accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public Accounts() {
    }
    public abstract void printAccountDetails();

    @Override
    public String toString() {
        return "Accounts{" +
                "accNumber='" + accNumber + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}
