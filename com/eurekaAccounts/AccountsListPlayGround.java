package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args)
    {
        List<Accounts> accountsList= new ArrayList<>();
        accountsList.add(new Checkings("1223",new BigDecimal(10)));

        accountsList.add(new Checkings("1499",new BigDecimal(30)));

        System.out.println(accountsList);
        accountsList.add(new Savings("1442",new BigDecimal(50)));
        accountsList.add(new Savings("5454667",new BigDecimal(10)));

        System.out.println(accountsList);

        CalculatebalinAccount(accountsList);


    }

    private static void CalculatebalinAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i=0; i<accountsList.size(); i++){
            totalBal = totalBal.add(accountsList.get(i).getAccbalance());
        }
        System.out.println("totalbal: "+totalBal);
    }

}
