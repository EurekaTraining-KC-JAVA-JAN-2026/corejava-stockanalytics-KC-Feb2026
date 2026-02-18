package eurekaAccounts;

import java.math.BigDecimal;

public class AccountsPlayGround {
    static void main(String[] args) {
        // here created from child class
        Checkings accountChecking1 = new Checkings("123456", new BigDecimal(20));
        Savings accountSaving1 = new Savings("233456", new BigDecimal(10)) {
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
        Accounts accountChecking2 = new Checkings("12345", new BigDecimal(100));
        Accounts accountSaving2 = new Savings("2345", new BigDecimal(200)) {
            @Override
            public BigDecimal withdrawAmount(BigDecimal withdraw) {
                return null;
            }
        };

        Accounts[] accountsArray = new Accounts[]{accountSaving1,accountSaving2,accountChecking1,accountChecking2};
    }
}
