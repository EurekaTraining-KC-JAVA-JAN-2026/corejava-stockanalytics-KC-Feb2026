
package Eurekaaccounts;

import java.math.BigDecimal;
public class Savings extends Accounts{
    public static BigDecimal APR = new BigDecimal(0.8); //year

    public Savings( String accNumber,BigDecimal accBalance) {
        super(accNumber,accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit){
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.8)));
        System.out.println("APR amount  :"+aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.print("total balance  :");
        return getAccBalance();
    }

    @Override
    public BigDecimal withdrawAmout(BigDecimal withdrawAmount) {
        return null;
    }

    @Override
    public void printAccountDetails(){

    }

    @Override
    public void printAcoountDetails() {

    }

    @Override
    public BigDecimal PremiumChecking() {
        return null;
    }


}
