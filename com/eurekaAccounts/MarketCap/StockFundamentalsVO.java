package com.eurekaAccounts.MarketCap;

import java.math.BigDecimal;

public class StockFundamentalsVO {
    private String tickerSymbol;
    private int sectorId;
    private int subSectorId;
    private BigDecimal marketCap;
    private float currentRation;
    private BigDecimal totalState;
    private BigDecimal count;

    public StockFundamentalsVO() {
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
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

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public float getCurrentRation() {
        return currentRation;
    }

    public void setCurrentRation(float currentRation) {
        this.currentRation = currentRation;
    }

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", marketCap=" + marketCap +
                ", currentRation=" + currentRation +
                '}'+"\n";
    }
}
