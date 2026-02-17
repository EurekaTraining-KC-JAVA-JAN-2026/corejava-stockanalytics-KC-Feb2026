package Eurekaaccounts;

import java.math.BigDecimal;

public class Checkings extends Accounts implements LoanFacility,Rewardfeature{
 static BigDecimal cash = new BigDecimal(3.0);
    public Checkings(String accnumber, BigDecimal accBalance) {

        super(accnumber, accBalance);
    }

    public Checkings() {
    }

    @Override
    public BigDecimal withdrawAmout(BigDecimal withdrawAmount) {
        BigDecimal cashb1= withdrawAmount.multiply(cash).divide(new BigDecimal(100));
        System.out.println("withDrawl "+withdrawAmount+"success");
        System.out.println("got cashback"+ cash +"at"+ cash +"rate");
        setAccBalance(getAccBalance().subtract(withdrawAmount));
        System.out.println("remaining balance in  acaoount");
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
    public void printAccountDetails() {
        System.out.println("account details are :" + "\n"
                + "Account number " + getAccNumber() + "\n"
                + "Account Balance" + getAccBalance()
        );
    }

    @Override
    public void printAcoountDetails() {

    }

    @Override
    public BigDecimal PremiumChecking() {
        return null;
    }


    @Override
    public void applyforloan(BigDecimal amount) {
        System.out.println("loanamout submission" +amount);
    }

    @Override
    public void repayforloan(BigDecimal amount) {
        System.out.println("loanamout replay"+amount);
    }

    @Override
    public BigDecimal addreward(BigDecimal rewardamount) {
        System.out.println("reward ammout"+rewardamount);
        return rewardamount;
    }
}


