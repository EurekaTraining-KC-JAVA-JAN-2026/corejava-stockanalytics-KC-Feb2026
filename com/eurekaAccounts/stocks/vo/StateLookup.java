package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StateLookup {
    BigDecimal count;

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public StateLookup(BigDecimal count) {
        this.count = count;
    }
}
