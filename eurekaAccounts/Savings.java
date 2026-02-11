package eurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {

    public static BigDecimal APR= new BigDecimal(20);

    public Savings() {
    }

    public Savings(BigDecimal accBalance, String accNum) {
        super(accBalance, accNum);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount=deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is " + aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("Total Balance is :" );
        return getAccBalance();
    }

    @Override
    public  void PrintAccountDetails(){

    }
}
