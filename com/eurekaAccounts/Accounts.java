package com.eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {
    public String accNumber;
    public BigDecimal accBalance;

    public Accounts(BigDecimal accBalance, String accNumber) {
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }

    public Accounts() {}

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public BigDecimal withdrawAmount(BigDecimal withdraw) {
        return accBalance;
    }

    public BigDecimal depositAmount(BigDecimal deposit) {
        setAccBalance(getAccBalance().add(deposit));
        return getAccBalance();
    }

    public abstract void printAccountDetails();
}