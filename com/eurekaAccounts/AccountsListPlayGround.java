package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345", new BigDecimal(10)));
        accountsList.add(new Checkings("23432",new BigDecimal(234)));
        System.out.println(accountsList);

        accountsList.add(new Savings("12333", new BigDecimal(124)));
        accountsList.add(new Savings("12121", new BigDecimal(111)));
        System.out.println(accountsList);

        calculateTotalBalInAccount(accountsList);


    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal =  BigDecimal.ZERO;
        for (int i =0; i< accountsList.size();i++) {
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total Balance:" +totalBal);
        }
    }


