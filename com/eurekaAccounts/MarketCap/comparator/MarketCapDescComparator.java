package com.eurekaAccounts.MarketCap.comparator;

import com.eurekaAccounts.MarketCap.StockFundamentalsVO;

import java.util.Comparator;

public class MarketCapDescComparator implements Comparator<StockFundamentalsVO> {

    @Override
    public int compare(StockFundamentalsVO o1, StockFundamentalsVO o2) {
        return o2.getMarketCap().compareTo(o1.getMarketCap());
    }
}
