package eurekaAccounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountsListPlayGround {
    public static void main(String[] args) {
        List<Accounts> accountList = new ArrayList<>();
        accountList.add(new Checkings(new BigDecimal(4000), "12345"));
        accountList.add(new Checkings(new BigDecimal(6000), "12745"));


        accountList.add(new Savings(new BigDecimal(7000), "12395"));
        accountList.add(new Checkings(new BigDecimal(8000), "12045"));
        System.out.println(accountList);
        calculateTotalBalanceInAccount(accountList);
    }

    private static void calculateTotalBalanceInAccount(List<Accounts> accountList) {
        BigDecimal totalBal=BigDecimal.ZERO;
        for(int i=0;i<accountList.size();i++){
            totalBal =totalBal.add(accountList.get(i).getAccBalance());
        }
        System.out.println("Total Bal in Accounts in accountList  is :" +totalBal);
    }


}
