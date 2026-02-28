package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("1234", new BigDecimal(129488798)));
        accountsList.add(new Checkings("1234", new BigDecimal(129488798)));
//        System.out.println(accountsList);
        accountsList.add(new Savings("1234", new BigDecimal(129488798)));
        accountsList.add(new Savings("1234", new BigDecimal(129488798)));
//        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }

    //we are printing the total balance from the checkings and Savings accounts using for loop to go and check accounts in the list
    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for(int i=0; i<accountsList.size(); i++){

            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total Balance in the account:" +totalBal);

    }
}
