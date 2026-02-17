package Eurekaaccounts;

import java.math.BigDecimal;

public interface LoanFacility {
    void applyforloan(BigDecimal amount);
    void repayforloan(BigDecimal amount);
}
