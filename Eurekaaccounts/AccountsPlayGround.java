
package Eurekaaccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args) {
        Checkings accountChecking1 = new Checkings("1234",new BigDecimal(50));
        Savings accountSaving1 =  new Savings("23456", new BigDecimal(40));
        System.out.println(accountChecking1.withdrawAmount(new BigDecimal(30)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        Accounts accountCheckings2 =  new Checkings("12345",new BigDecimal(100));
        Accounts accountSavings2 = new Savings("2345",new BigDecimal(200));
        System.out.println(accountCheckings2.withdrawAmount(new BigDecimal(20)));
        System.out.println(accountSavings2.depositAmount(new BigDecimal(20)));


        LoanFacility loanchecking = new Checkings("9999", new BigDecimal(100));
        loanchecking.applyforloan(new BigDecimal (1000));

        //multilevel()
        PremiumCheckings pc=new PremiumCheckings("8888",new BigDecimal(200));
        pc.bonousapplied();
/// multiple inheritance
        Rewardfeature rf=new Checkings("5555", new BigDecimal(200));
        rf.addreward(new BigDecimal(15));



        Accounts[] accountsArray = new Accounts[]{
                accountSaving1,accountChecking1,accountCheckings2,accountSavings2};
        accountChecking1.printAccountDetails();

    }
}
