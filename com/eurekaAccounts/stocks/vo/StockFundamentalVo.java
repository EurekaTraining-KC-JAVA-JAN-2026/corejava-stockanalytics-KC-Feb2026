package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalVo {
    public String tickerSymbol;
    public int sectorID;
    public int subSectorID;
    public long marketCap;


    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public int getSectorID() {
        return sectorID;
    }

    public void setSectorID(int sectorID) {
        this.sectorID = sectorID;
    }

    public int getSubSectorID() {
        return subSectorID;
    }

    public void setSubSectorID(int subSectorID) {
        this.subSectorID = subSectorID;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "StockFundamentalVo{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorID=" + sectorID +
                ", subSectorID=" + subSectorID +
                ", marketCap=" + marketCap +
                '}';
    }

    public StockFundamentalVo(String tickerSymbol, int sectorID, int subSectorID, long marketCap) {
        this.tickerSymbol = tickerSymbol;
        this.sectorID = sectorID;
        this.subSectorID = subSectorID;
        this.marketCap = marketCap;
    }

    public StockFundamentalVo() {
    }
}


