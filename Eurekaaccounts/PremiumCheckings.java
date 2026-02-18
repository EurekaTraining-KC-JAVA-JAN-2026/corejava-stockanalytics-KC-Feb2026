package Eurekaaccounts;

import java.math.BigDecimal;

public class PremiumCheckings extends Checkings{
       BigDecimal bonusrate =new BigDecimal(10);

    public PremiumCheckings(String accnumber, BigDecimal accBalance) {
        super(accnumber, accBalance);
        this.bonusrate = bonusrate;
    }

    public PremiumCheckings() {

    }

    public void bonousapplied(){
           getAccBalance().multiply(bonusrate);
           setAccBalance(getAccBalance().add(bonusrate));
           System.out.println("premiun added bonous is" +bonusrate);
       }
    @Override
    public void printAcoountDetails() {
super.printAcoountDetails();
    }

}
