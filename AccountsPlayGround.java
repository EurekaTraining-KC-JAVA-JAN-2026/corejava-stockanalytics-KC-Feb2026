import com.eurekaAccounts.Accounts;
import com.eurekaAccounts.Checkings;
import com.eurekaAccounts.Savings;

import java.math.BigDecimal;

public class AccountsPlayGround {
    public static void main(String[] args)
    {
        Checkings accountChecking = new Checkings("123456", new BigDecimal(20));
        Savings accountSavings = new Savings("23445566", new BigDecimal(10));
        System.out.println(accountChecking.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSavings.depositAmount(new BigDecimal(20)));

        Accounts accountChecking2 = new Checkings("12333" , new BigDecimal(100));
        Accounts accountSavings2 = new Savings("2323", new BigDecimal(200));

        Accounts[] accountsArray = new Accounts[]{accountSavings,accountChecking2,accountSavings2};
    }
}
