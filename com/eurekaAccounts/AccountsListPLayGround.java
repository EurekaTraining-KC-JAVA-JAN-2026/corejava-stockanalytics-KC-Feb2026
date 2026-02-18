package com.eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPLayGround {
    public static void main(String[] args) {
        List<Accounts> list1 = new ArrayList<>();
        list1.add(new Checkings( "12345", new BigDecimal(100)));
        list1.add(new Checkings( "12345", new BigDecimal(200)));

        System.out.println(list1);
        System.out.println(calculateTotalBalance(list1));

    }

    public static BigDecimal calculateTotalBalance(List<Accounts> list1) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for(int i =0; i<list1.size();i++){
            totalBal = totalBal.add(list1.get(i).getAccBalance());
        }
        System.out.println(totalBal);

        return totalBal;
    }
}
