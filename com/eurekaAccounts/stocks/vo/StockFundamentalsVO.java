package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO> {
    public String tickerSymbol;
    public BigDecimal sectorId;
    public int subSectorId;
    public long marketCap;
    public float currentRation;

    public StockFundamentalsVO(String tickerSymbol, BigDecimal sectorId, long marketCap, int subSectorId, float currentRation) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.marketCap = marketCap;
        this.subSectorId = subSectorId;
        this.currentRation = currentRation;
    }

    public StockFundamentalsVO() {
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

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
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
                '}'+'\n';
    }

    @Override
    public int compareTo(StockFundamentalsVO o) {
       if(o.marketCap>this.marketCap){
           return 1;
       }else if(o.marketCap<this.marketCap){
           return -1;
       }else{
           return 0;
       }
    }
}
