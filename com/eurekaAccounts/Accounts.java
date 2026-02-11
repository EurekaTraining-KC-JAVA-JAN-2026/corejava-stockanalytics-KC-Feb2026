package com.eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {

    /**
     * Bank Accounts
     * checkings and savings to understand the inheritance.
     * Abstracts will have tight coupling, in interface its tight coupling.
     */

    public String accountNumber;
    public BigDecimal accountBalance;

    public Accounts() {
    }

    public Accounts(String accountNumber, BigDecimal accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal depositAmount(BigDecimal deposit) {
        setAccountBalance(accountBalance.add(deposit));
        return getAccountBalance();
    }

    public BigDecimal withdrawAmount(BigDecimal withdraw) {
        setAccountBalance(accountBalance.subtract(withdraw));
        return getAccountBalance();
    }

    public abstract void printAccountDetails();

    /**
     * Usually Java will create some space in memory ,
     * abstract don't have any body so it doesn't create any memory
     */
}
