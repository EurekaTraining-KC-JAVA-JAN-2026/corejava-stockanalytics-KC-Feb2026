package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentals implements Comparable<StockFundamentals>{
    public String tickerSymbol;
    public BigDecimal sectorId;
    public int subSectorId;
    public BigDecimal marketCap;
    public float currentRatio;

    public StockFundamentals() {
    }

    public StockFundamentals(String tickerSymbol, BigDecimal sectorId, int subSectorId, BigDecimal marketCap, float currentRatio) {
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

    public BigDecimal getSectorId() {
        return sectorId;
    }

    public void setSectorId(BigDecimal sectorId) {
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

    public float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(float currentRatio) {
        this.currentRatio = currentRatio;
    }

    @Override
    public String toString() {
        return "StockFundementals{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                '}' + '\n';
    }

    @Override
    public int compareTo(StockFundamentals o) {
        return this.marketCap.compareTo(o.getMarketCap());
    }


}