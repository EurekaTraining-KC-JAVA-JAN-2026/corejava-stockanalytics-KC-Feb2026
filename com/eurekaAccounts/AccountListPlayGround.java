package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new  Checkings("12345", new BigDecimal( 1234566)));
        accountsList.add(new  Checkings("55336", new BigDecimal( 3463636)));

        accountsList.add(new Savings("17574747", new BigDecimal( 100)));
        accountsList.add(new Savings("16636362", new BigDecimal( 200)));
        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);

    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;;
        for (int i=0; i< accountsList.size(); i++) {
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total bal in accounts in account list is: " + totalBal);
    }
}
