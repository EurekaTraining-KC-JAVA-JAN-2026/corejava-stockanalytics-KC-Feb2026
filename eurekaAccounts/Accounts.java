package eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {
    /**
     * Bank accounts
     * checkings &savings to understand inheritance in java
     */
    public String accNumber;
    public BigDecimal accBalance;
    //one is parameterized
    public Accounts( String accNumber,BigDecimal accBalance) {
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }
    //one is default
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
    //method to depositAmount
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    //method to withdrawAmount
    public BigDecimal withdrawAmount(BigDecimal withdraw){
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();
    }
    public void something(){

    };
    //method to see accountDetails
    //wont create any memory just registers with method signature
    public abstract void printAccountDetails();

    public abstract void printAccDetails();
}