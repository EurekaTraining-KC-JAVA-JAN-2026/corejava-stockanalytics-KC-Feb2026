package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    static void main() {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12645",new BigDecimal(100)));
        accountsList.add(new Checkings("23751",new BigDecimal(200)));
        System.out.println(accountsList);
        accountsList.add(new Savings("131345",new BigDecimal(10)));
        accountsList.add(new Savings("358657",new BigDecimal(20)));

        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal =  BigDecimal.ZERO;

        for(int i = 0; i <accountsList.size(); i++)
        {
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total Balance in accounts is " + totalBal);
    }


}
