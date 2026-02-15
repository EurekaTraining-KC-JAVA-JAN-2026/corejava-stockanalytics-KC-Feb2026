package Eurekaaccounts;

import java.math.BigDecimal;

public class AccountPlayGround {
    public static void main(String[] args){
        Checking accountchecking1=new Checking("123456",new BigDecimal(20));
        Savings accountsaving1=new Savings("12333456", new BigDecimal(20));
        System.out.println(accountchecking1.withdrawAmout(new BigDecimal("20")));
        System.out.println(accountsaving1.withdrawAmout(new BigDecimal("20")));

        Accounts accountChecking2=new Checking("12345", new BigDecimal((100)));
        Accounts accountsaving2=new Savings("1234665", new BigDecimal((200)));
        System.out.println(accountChecking2.withdrawAmout(new BigDecimal("100")));
        System.out.println(accountsaving2.withdrawAmout(new BigDecimal("200")));

    }
}
