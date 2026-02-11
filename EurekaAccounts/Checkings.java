package EurekaAccounts;

import java.math.BigDecimal;

// here we are extending parent class Accounts to get the pro like accNum and accBalace
public class Checkings extends Accounts {
    //@Override
    public BigDecimal withdrawAmount(BigDecimal withDraw){
        BigDecimal cashB =withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("withdrawl of "+withDraw+"is success");
        //
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("you get cashback of"+cashB+"at "+cashBack+"% rate");
       // here in adding the cashback amount
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();
    }
    public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings(String accNumber, BigDecimal accBalance) {
        super(accNumber, accBalance);
    }
}
