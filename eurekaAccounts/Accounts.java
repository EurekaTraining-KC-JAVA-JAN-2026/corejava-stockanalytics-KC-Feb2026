package eurekaAccounts;

import java.math.BigDecimal;

public  abstract class Accounts {


    public String accNumber;
    public BigDecimal accBalance;

    public Accounts(BigDecimal accBalance, String accNumber) {
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

    // method to
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    //method to withdrawAmount
    public BigDecimal depositAmount(BigDecimal deposit) {
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    // method to see accountDetails
    //abstract doesnt have any body
    public abstract void printAccDetails();


    public abstract BigDecimal withdrawAmount(BigDecimal withdraw);
}