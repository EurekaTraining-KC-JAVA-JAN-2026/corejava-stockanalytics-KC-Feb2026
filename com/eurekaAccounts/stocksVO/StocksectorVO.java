package com.eurekaAccounts.stocksVO;

import com.eurekaAccounts.BigDecimal;

public class StocksectorVO implements Comparable<StocksectorVO>{
    public String tickerSymbol;
    public int sectorId;
    public int subSectorId;
    public long marketCap;
    public float currentRatio;

    public StocksectorVO() {
    }

    public StocksectorVO(String tickerSymbol, int sectorId, int subSectorId, long marketCap, float currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(float currentRatio) {
        this.currentRatio = currentRatio;
    }

    @Override
    public String toString() {
        return "StocksectorVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                '}' + '\n';
    }

    @Override
    public int compareTo(StocksectorVO o) {
        if(o.marketCap> this.getMarketCap())
        {
            return 1;

        }
        else if (o.marketCap < this .getMarketCap())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}