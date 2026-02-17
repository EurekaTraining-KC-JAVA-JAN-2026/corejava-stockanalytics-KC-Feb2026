package eurekaAccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts implements OnlineBanking {   //multiple Inheritence

    public static BigDecimal casBack=new BigDecimal(3.0);

    public Checkings() {
    }

    public Checkings(BigDecimal accBalance, String accNum) {
        super(accBalance, accNum);
    }

    @Override
    public void transferMoney(String toAccountNumber, BigDecimal amount) {
        withDrawAmount(amount);
        System.out.println("Transferred "+ amount+ " to " +toAccountNumber);
    }

    @Override
    public BigDecimal checkBalance() {
        return getAccBalance();
    }

    @Override
    public BigDecimal withDrawAmount(BigDecimal withDraw) {
        BigDecimal casB=withDraw.multiply(casBack).divide(new BigDecimal(100));
        System.out.println("withdrawal of "+withDraw+" is sucess");
        //Here Im subtracting the withdrawal amount
        setAccBalance(getAccBalance().subtract(withDraw));
        System.out.println("you got cashBack of"+casB+ " at"+ casBack +"% rate");
        // here im adding the cashback amount
        setAccBalance(getAccBalance().add(casB));
        return getAccBalance();
    }

    @Override
    public  void PrintAccountDetails(){
        System.out.println("Account Details:"+"\n"+
           "AccountNumberr:" + getAccNum() + "\n"+
        "AccountBalnace: " + getAccBalance());
    }
}

