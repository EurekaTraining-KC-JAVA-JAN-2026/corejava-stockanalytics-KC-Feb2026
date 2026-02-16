package eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    static void main(String[] args) {
        // here created from child class
        Checkings accountChecking1 = new Checkings(new BigDecimal(20), "123456");
        Savings accountSaving1 = new Savings(new BigDecimal(10), "233456") {
            @Override
            public BigDecimal withdrawAmount(BigDecimal withdraw) {
                return null;
            }
        };
        System.out.println(accountChecking1.withdrawAmount(new BigDecimal(10)));
        System.out.println(accountSaving1.depositAmount(new BigDecimal(20)));

        /**
         * polymorphism
         * we can also create the objects from parent class
         */
        Accounts accountChecking2 = new Checkings(new BigDecimal(100), "12345");
        Accounts accountSaving2 = new Savings(new BigDecimal(200), "2345") {
            @Override
            public BigDecimal withdrawAmount(BigDecimal withdraw) {
                return null;
            }
        };

        Accounts[] accountsArray = new Accounts[]{accountSaving1,accountSaving2,accountChecking1,accountChecking2};
    }
}
