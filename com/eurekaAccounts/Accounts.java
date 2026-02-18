package com.eurekaAccounts;

import java.math.BigDecimal;
//
public  abstract class Accounts {
    /**
     * Bank Accounts
     * checkings and savings to understand inheritance in java
     *
     */
    public String accNumber;
    public BigDecimal accBalance;
// parameterized constructor
    public Accounts(String accNumber, BigDecimal accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }
// default constructor
    public Accounts() {
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
    //method to deposit amount
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    //method withdraw account
    public BigDecimal withdrawAmount(BigDecimal withdraw)
    {
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();

    }
    public void something(){
        // java will have some spaces in memory(metaspace for methods) and also registers method signature
    }
    //simple method will have body and abstract will not have body
    //meth to see account details
    // abstarct method should be in a body
    // it should be in abstract class
    //wont create any memory just register with method signature
    public abstract  void printAccountDetails();

    @Override
    public String toString() {
        return "Accounts{" +
                "accNumber='" + accNumber + '\'' +
                ", accBalance=" + accBalance + '\n'+
                '}';
    }
}
