package eurekaAccounts;

import java.math.BigDecimal;

public abstract class Savings extends Accounts{
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(BigDecimal accBalance, String accNumber) {
        super(accBalance, accNumber);
    }
    @Override
    public  BigDecimal depositAmount(BigDecimal deposit){
        BigDecimal aprAmount = deposit.multiply((APR.multiply(new BigDecimal(0.8))));
        System.out.println("APR amount is :"+aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("Total Balance is:");

        return getAccBalance();
    }

    @Override
    public void printAccDetails() {

    }
}
