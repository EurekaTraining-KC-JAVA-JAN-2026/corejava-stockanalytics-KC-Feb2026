package com.EurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountListPlayGround {
    static void main(String[] args) {

        //polymorphism
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345",new BigDecimal(123675)));
        accountsList.add(new Checkings("2453",new BigDecimal(46765)));
        accountsList.add(new Savings("1234",new BigDecimal(20)));

        System.out.println(accountsList);
        calculateTotalBalanceAccount(accountsList);
    }

    private static void calculateTotalBalanceAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for(int i=0;i<accountsList.size();i++){

        totalBal=totalBal.add(accountsList.get(i).getAccBalance());
    }
        System.out.println("total bal in account "+totalBal);
    }



}
