package EurekaAccounts;

import java.math.BigDecimal;

public class AccountPlayGround {
    static void main(String[] args) {
        Checkings accountCheckings1 = new Checkings("12345",new BigDecimal(28829201));
        Savings accountSavings1 = new Savings("12543",new BigDecimal(12543));
        System.out.println(accountCheckings1.withdrawAmount(new BigDecimal(30)));
        System.out.println(accountSavings1.depositAmount(new BigDecimal(4)));


        /*
        polymorphsm
        we can also create the objects from parent class
        some class behaving diffently on differrent calls

        =>benenfits of polymorphism

         */
        // array will only hold values of same type
        // but polymorphism can take diff values


        Accounts accountsCheckings2 =new Checkings("12342",new BigDecimal(1762));
        Accounts accountSavings2 = new Savings("14662",new BigDecimal(7899));

        Accounts[] accountsArray =new Accounts[]{accountCheckings1,accountSavings1,accountsCheckings2,accountSavings2};
        // printing
    }
}
