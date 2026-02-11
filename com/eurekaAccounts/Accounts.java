package com.eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {

    /**
     * Bank accounts
     * acoounts to understand the inheritance
     */
    public String accNumber;
    public BigDecimal accBalance;

    public Accounts(String accNumber, BigDecimal accbalance){
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }
    public Accounts(){

    }

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
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    public BigDecimal withdrawAmount(BigDecimal withdraw){
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();
    }

    public abstract void printAccountsDetails();
    }
