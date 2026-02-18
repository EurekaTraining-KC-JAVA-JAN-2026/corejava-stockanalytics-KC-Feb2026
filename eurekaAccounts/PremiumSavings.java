package eurekaAccounts;

import java.math.BigDecimal;

public class PremiumSavings extends Savings {        //multilevel inheritence
    BigDecimal Bonus_rate=new BigDecimal(0.02);

    public PremiumSavings() {
    }

    public PremiumSavings(BigDecimal accBalance, String accNum) {
        super(accBalance, accNum);
    }

    public void applyBonus(){
        BigDecimal bonus=getAccBalance().multiply(Bonus_rate);
        setAccBalance(getAccBalance().add(bonus));
        System.out.println("Premium bonus added: " + bonus);
        System.out.println();

    }

    @Override
    public void PrintAccountDetails() {
        super.PrintAccountDetails();
    }
}
