package com.eurekaAccounts.stocks.vo;

public class MarketCapReveresd extends StockFundamentalsVO implements Comparable<StockFundamentalsVO> {

    @Override
    public int compareTo(StockFundamentalsVO o) {
        return this.marketCap.compareTo(o.marketCap);
    }
}
