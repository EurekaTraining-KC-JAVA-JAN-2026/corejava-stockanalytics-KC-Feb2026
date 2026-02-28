package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO> {
    public String tickerSymbol;
    public BigDecimal sectorId;
    public BigDecimal subSectorId;
    public BigDecimal marketCap;
    public float currentRatio;

    public StockFundamentalsVO() {
    }

    public StockFundamentalsVO(String tickerSymbol, BigDecimal sectorId, BigDecimal subSectorId, BigDecimal marketCap, float currentRatio) {
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

    public BigDecimal getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(BigDecimal subSectorId) {
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
        return "StockFundamentalsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                '}'+'\n';
    }

    @Override
    public int compareTo(StockFundamentalsVO o) {
        return 0;
    }
}