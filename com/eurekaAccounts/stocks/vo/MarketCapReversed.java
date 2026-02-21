package com.eurekaAccounts.stocks.vo;

public class MarketCapReversed extends StockFundamentalVO implements Comparable<StockFundamentalVO>{

    @Override
    public int compareTo(StockFundamentalVO o) {
        return this.marketCap.compareTo(o.marketCap);
    }
}
