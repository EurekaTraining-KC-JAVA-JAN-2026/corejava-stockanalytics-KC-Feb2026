package com.eurekaAccounts.stocks.vo;

import java.util.Comparator;

public class StockLookupVO  {
    public String tickerName;
    public String tickerSymbol;

    public String getTickerName() {
        return tickerName;
    }

    public void setTickerName(String tickerName) {
        this.tickerName = tickerName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public StockLookupVO(String tickerName, String tickerSymbol) {
        this.tickerName = tickerName;
        this.tickerSymbol = tickerSymbol;
    }

    public StockLookupVO() {
    }

    @Override
    public String toString() {
        return "StockLookupVO{" +
                "tickerName='" + tickerName + '\'' +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                '}'+'\n';
    }



}
