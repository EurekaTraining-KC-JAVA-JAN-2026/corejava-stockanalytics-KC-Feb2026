package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;
import java.util.Comparator;

public class StockFundementalsVO implements Comparable<StockFundementalsVO> {
    public String tickerSymbol;

    public StockFundementalsVO(int sectorId) {
        this.sectorId = sectorId;
    }

    public int sectorId;
    public int subSectorId;

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public BigDecimal marketCap;
    public float currentRatio;



    public StockFundementalsVO() {
    }

    public StockFundementalsVO(String tickerSymbol, int sectorId, int subSectorId, BigDecimal marketCap, float currentRatio) {
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

    public float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(float currentRatio) {
        this.currentRatio = currentRatio;
    }

    @Override
    public String toString() {
        return "StockFundementalsVO{" +
               "tickerSymbol='" + tickerSymbol + '\'' +
               ", sectorId=" + sectorId +
               ", subSectorId=" + subSectorId +
               ", marketCap=" + marketCap +
               ", currentRatio=" + currentRatio +
               '}' + '\n';
    }

    @Override
    public int compareTo(StockFundementalsVO o) {
        return Comparator
                .comparing(StockFundementalsVO::getMarketCap,
                        Comparator.nullsFirst(BigDecimal::compareTo))
                .compare(this, o);
    }
}