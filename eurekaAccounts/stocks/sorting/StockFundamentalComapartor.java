package eurekaAccounts.stocks.sorting;

import eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.util.Comparator;

public class StockFundamentalComapartor implements Comparator<StockFundamentalsVO>{

    @Override
    public int compare(StockFundamentalsVO o1, StockFundamentalsVO o2) {
        return Double.compare(o2.market_cap,o1.market_cap);
    }
}
