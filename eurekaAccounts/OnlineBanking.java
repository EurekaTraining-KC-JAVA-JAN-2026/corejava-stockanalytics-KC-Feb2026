package eurekaAccounts;

import java.math.BigDecimal;

public interface OnlineBanking {      ///Interface
    void transferMoney(String toAccountNumber, BigDecimal amount);

    BigDecimal checkBalance();
}
