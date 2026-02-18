package com.eurekaAccounts;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345",new BigDecimal(34567)));
        accountsList.add(new Checkings("12355",new BigDecimal(2345)));

        System.out.println(accountsList);
        accountsList.add(new Savings("143555",new BigDecimal(23567)));
        accountsList.add(new Savings("43355",new BigDecimal(44567)));
        System.out.println(accountsList);
        caluclateTotalBalInAccount(accountsList);
    }

    private static void caluclateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i =0; i < accountsList.size();i++){
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("total bal in Accounts in accountlist: " +totalBal);
    }


}
