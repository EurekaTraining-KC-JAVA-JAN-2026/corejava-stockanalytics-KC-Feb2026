package Eurekaaccounts;

import Eurekaaccounts.Accounts;

import java.math.BigDecimal;

public class Checking extends Accounts {
 static BigDecimal cashb = new BigDecimal(3.0);
    public Checking(String accnumber, BigDecimal accBalance) {
        super(accnumber, accBalance);
    }
    @Override
    public BigDecimal withdrawAmout(BigDecimal withdrawAmount) {
        BigDecimal cashb1= withdrawAmount.multiply(cashb).divide(new BigDecimal(100));
        System.out.println("withDrawl of"+withdrawAmount+"is success");
        System.out.println("got cashback"+cashb+"at"+cashb+"rate");
        setAccBalance(cashb);
        System.out.println("remaining balance in the acaoount");
        return getAccBalance();
    }

    @Override
    public void something(){
        System.out.println("Account Details(by ):"+"\n"
                +"Account Number "+getAccNumber() +" \n"
                +"Account Balance "+getAccBalance()
        );
    }

    @Override
    public void printAcoountDetails() {
        System.out.println("account details are :" + "\n"
                + "Account number " + getAccNumber() + "\n"
                + "Account Balance" + getAccBalance()
        );
    }
}


