package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345",new BigDecimal(123)));
        accountsList.add(new Checkings("234567",new BigDecimal(345)));
        //System.out.println(accountsList);
        accountsList.add(new Savings("23456",new BigDecimal(30)));
        accountsList.add(new Savings("678965",new BigDecimal(40)));
        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }
    private static void calculateTotalBalInAccount(List<Accounts> accountsList){
        BigDecimal totalBal = BigDecimal.ZERO;
        for(int i=0; i<accountsList.size(); i++) {
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("total bal in accounts in accounts:" +totalBal);
    }
}
