package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        List<Accounts> anotherList = new ArrayList<>();
        anotherList.add(new Checkings("12345",new BigDecimal(123)));
        anotherList.add(new Checkings("23453",new BigDecimal(234)));
        //System.out.println(accountsList);
        calculateTotalBalInAccount(anotherList);


    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i =0; i < accountsList.size(); i++) {
            totalBal =totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total bal in Accounts in accountList is :");
    }
}
