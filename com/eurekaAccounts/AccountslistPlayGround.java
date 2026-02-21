package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountslistPlayGround {
    public static void main() {
        List<Accounts> amountsList = new ArrayList<>();
        amountsList.add(new Checkings("12345", new BigDecimal(100)));
        amountsList.add(new Checkings("12345", new BigDecimal(200)));
        amountsList.add(new Checkings("12345", new BigDecimal(10)));
        amountsList.add(new Checkings("12345", new BigDecimal(20)));
        System.out.println(amountsList);
        calculateTotalBalInAccount(amountsList);

    }

    private static void calculateTotalBalInAccount(List<Accounts> amountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i = 0; i < amountsList.size(); i++) {
            totalBal = totalBal.add(amountsList.get(i).getAccBalance());
        }
        System.out.println("total balance in accounts is :" + totalBal);
    }

}
