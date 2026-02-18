package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountListPlayGround {

    public static void main(String args[]) {

        //PolyMorphism
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("123456", new BigDecimal(34)));
        accountsList.add(new Checkings("546783", new BigDecimal(45)));
        System.out.println(accountsList);

        accountsList.add(new Savings("435672", new BigDecimal(34)));
        accountsList.add(new Savings("156234", new BigDecimal(23)));

        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i = 0; i <accountsList.size(); i++) {
            totalBal =  totalBal.add(accountsList.get(i).getAccountBalance());
        }
        System.out.println("The Total Balance of in the AccountList is : " + totalBal);
    }
}
