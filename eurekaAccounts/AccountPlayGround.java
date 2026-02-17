package eurekaAccounts;

import java.math.BigDecimal;

public class AccountPlayGround {
    public static void main(String[] args){
        Checkings accountChecking = new Checkings(new BigDecimal(20600),"12345");
        Savings accountSaving=new Savings(new BigDecimal(10000),"22456");
        System.out.println(accountChecking.withDrawAmount(new BigDecimal(10)));
        accountChecking.transferMoney("12345",new BigDecimal(50));
        System.out.println(accountChecking.getAccBalance());
        PremiumSavings accountPremiumSavings=new PremiumSavings(new BigDecimal(5000),"12345");
        accountPremiumSavings.applyBonus();
        System.out.println(accountPremiumSavings.getAccBalance());

         accountPremiumSavings.PrintAccountDetails();
        /**
         * polymorphism
         * we can also create the objects from parent class
         * same class behaving differently on different calls
         */

        Accounts accountChecking1= new Checkings(new BigDecimal(100),"12345");

        Accounts accountSaving1=new Savings(new BigDecimal(50),"2467678");

        Accounts[] accountsArray=new Accounts[]{accountChecking1,accountChecking,accountSaving,accountSaving1};
        accountChecking.PrintAccountDetails();





    }

}
