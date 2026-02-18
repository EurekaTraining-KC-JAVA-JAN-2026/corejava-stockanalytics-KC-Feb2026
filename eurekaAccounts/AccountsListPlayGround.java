package eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12345",new BigDecimal(1000)));
        accountsList.add(new Checkings("23432",new BigDecimal(2000)));
        System.out.println(accountsList);
        calculateTotalBalInAccount(accountsList);
    }

    private static void calculateTotalBalInAccount(List<Accounts> accountsList) {
        BigDecimal totalBal = BigDecimal.ZERO;
        for (int i = 0; i < accountsList.size(); i++) {
            totalBal = totalBal.add(accountsList.get(i).getAccBalance());
        }
        System.out.println("Total bal in Accounts in accountList is :"+totalBal);
    }
}
