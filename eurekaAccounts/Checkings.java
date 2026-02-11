package eurekaAccounts;

import java.math.BigDecimal;

//here we are extending Parent class Accounts to get the prop's like Accnum and AccBal
public class Checkings extends Accounts{
    public static BigDecimal cashBack = new BigDecimal(3.0);

    public Checkings(String accNumber,BigDecimal accbalance) {
        super(accNumber, accbalance);
    }

    @Override
    public BigDecimal withdrawAmount(BigDecimal withDraw){
        //here im calculating the cashback promo amount because itd checking acc
        BigDecimal cashB = withDraw.multiply(cashBack).divide(new BigDecimal(100));
        System.out.println("Withdrawal of " + withDraw+"is Success");

        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("You got cashback of "+cashB+ "at"+cashBack+"% rate");
        setAccBalance(getAccBalance().add(cashB));
        System.out.println("Remaining balance in the Account");
        return getAccBalance();
    }
    @Override
    public void printAccountsDetails(){
        System.out.println("Account Details are: "+"\n"
        +"Account Number "+getAccNumber()+"\n"
        +"\n"+ "Account Balance"+getAccBalance());
    }
}
