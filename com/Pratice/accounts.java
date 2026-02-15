package com.Pratice;

import java.math.BigDecimal;

public class accounts {
    public String accNumber;
    public BigDecimal accbalance;

    public accounts() {
    }

    public accounts(String accNumber, BigDecimal accbalance) {
        this.accNumber = accNumber;
        this.accbalance = accbalance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public BigDecimal getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(BigDecimal accbalance) {
        this.accbalance = accbalance;
    }

    public BigDecimal depositAmount(BigDecimal deposit){
        setAccbalance(accbalance.add(deposit));
        return getAccbalance();
    }

    public BigDecimal withdrawAmount(BigDecimal withdraw){
        setAccbalance(accbalance.subtract(withdraw));
        return getAccbalance();
    }
}
