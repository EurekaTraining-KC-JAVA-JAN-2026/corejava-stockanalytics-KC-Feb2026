package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO>{
    public BigDecimal sectorId;
    public BigDecimal subSectorId;
    public String tickerSymbol;
    public BigDecimal marketCap;

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "marketCap=" + marketCap +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                '}'+'\n';
    }

    public StockFundamentalsVO() {
    }

    public StockFundamentalsVO(BigDecimal marketCap, BigDecimal sectorId, BigDecimal subSectorId, String tickerSymbol) {
        this.marketCap = marketCap;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.tickerSymbol = tickerSymbol;
    }

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
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

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    @Override
    public int compareTo(StockFundamentalsVO o) {
        return o.marketCap.compareTo(this.marketCap);
    }
}
