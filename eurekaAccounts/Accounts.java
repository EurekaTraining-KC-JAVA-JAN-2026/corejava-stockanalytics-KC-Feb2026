package eurekaAccounts;

import java.math.BigDecimal;

public abstract class Accounts {


    private  String accNum;
    private BigDecimal accBalance;

    public Accounts( BigDecimal accBalance,String accNum) {
        this.accNum = accNum;
        this.accBalance = accBalance;
    }
    public Accounts() {
    }

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    public BigDecimal withDrawAmount(BigDecimal withDraw){
         setAccBalance(accBalance.subtract(withDraw));
         return getAccBalance();
    }
    public abstract void PrintAccountDetails();
}
