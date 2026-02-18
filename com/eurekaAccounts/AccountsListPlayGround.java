package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {

        //polymorphism
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345", new BigDecimal(1232343)));
        accountsList.add(new Checkings("23456",new BigDecimal(234561)));
        //System.out.println(accountsList);
        accountsList.add(new Savings("23421", new BigDecimal(2434234)));
        accountsList.add(new Savings("3456432",new BigDecimal(123124)));
        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);

    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal= BigDecimal.ZERO;
        for (int i=0;i<accountsList.size();i++){
            totalBal=totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total bal in Accounts in accountList is : "+totalBal);
    }
}
