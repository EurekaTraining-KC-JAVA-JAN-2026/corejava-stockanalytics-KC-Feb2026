package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        //polymorphism
        List<Accounts> anotherList = new ArrayList<>();
        anotherList.add(new Checkings("12345",new BigDecimal((1234567))));
        anotherList.add(new Checkings("2345",new BigDecimal(533222)));
        System.out.println(anotherList);
        anotherList.add(new Savings("1232",new BigDecimal(10)));
        anotherList.add(new Savings("12382",new BigDecimal(20)));
        System.out.println(anotherList);
        calculateTotalBalInAccount(anotherList);

    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;

        for (int i = 0; i < accountsList.size(); i++){
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total bal in Accounts in accountsList is: " +totalBal);

    }

}
