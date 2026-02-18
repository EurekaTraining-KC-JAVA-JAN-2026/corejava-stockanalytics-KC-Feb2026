package Eurekaaccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountArraylistPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Checkings("12344", new BigDecimal(123456)));
        accountsList.add(new Checkings("23455", new BigDecimal(2345)));
        //System.out.println(accountsList);
        accountsList.add(new Savings("234", new BigDecimal(10)));
        accountsList.add(new Savings("2344", new BigDecimal(20)));
        System.out.println(accountsList);
        calculateTotalBalanceAccount(accountsList);
    }
    private static void calculateTotalBalanceAccount(List<Accounts> accountsList) {
            BigDecimal totalBal = BigDecimal.ZERO;
            for (int i=0;i< accountsList.size();i++){
                totalBal= totalBal.add(accountsList.get(i).getAccBalance());
            }
            System.out.println("total accountlist" + totalBal);
    }
}
