package Eurekaaccounts;

import java.math.BigDecimal;

public abstract class Accounts {
    public BigDecimal accBalance;
    public String accNumber;

    public Accounts(String accNumber,BigDecimal accBalance) {
        this.accBalance=accBalance;
        this.accNumber=accNumber;
    }
    public Accounts(){

    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public Accounts(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {

        this.accBalance = accBalance;
    }

    public Accounts(String accNumber) {
        this.accNumber = accNumber;
    }
     public BigDecimal depositAmount(BigDecimal deposit){
         setAccBalance(accBalance.add(deposit));
         return getAccBalance();
     }
    public BigDecimal withdrawAmount(BigDecimal withdraw) {
        setAccBalance(accBalance.subtract(withdraw));
        return getAccBalance();
    }
    public void something(){

    }

    public abstract BigDecimal withdrawAmout(BigDecimal deposit);

    public abstract void printAcoountDetails();
}
