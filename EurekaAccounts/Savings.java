package EurekaAccounts;

import java.math.BigDecimal;

public class Savings extends Accounts {
    public static BigDecimal APR = new BigDecimal(20.00);

    public Savings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }

    @Override
    public BigDecimal depositAmount(BigDecimal deposit) {
        BigDecimal aprAmount = deposit.multiply(APR.multiply(new BigDecimal(0.24)));
        System.out.println("APR amount is" + aprAmount);
        setAccBalance(getAccBalance().add(deposit));
        System.out.println("total account balance in the ");
    return getAccBalance();
    }

}