package com.eurekaAccounts;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        //polymorphism
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checking("1234556",new BigDecimal(1234556)));
        accountsList.add(new Checking("23432", new BigDecimal(233455)));
        //System.out.println(accountsList);
        accountsList.add(new Savings("23432", new BigDecimal(233455)));
        accountsList.add(new Savings("23432", new BigDecimal(233455)));
        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for(int i=0;i<accountsList.size();i++){
            totalBal = accountsList.get(i).getAccBalance();
        }
        System.out.println("Total Balance in accountList: "+totalBal);
    }

}
