package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO> {

    private String tickerSymbol;
    private BigDecimal sectorId;
    private int subsectorId;
    private long marketCap;

    public StockFundamentalsVO() {}

    public StockFundamentalsVO(String tickerSymbol, long marketCap, int subsectorId, BigDecimal sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.subsectorId = subsectorId;
        this.sectorId = sectorId;
    }

    public String getTickerSymbol() { return tickerSymbol; }
    public void setTickerSymbol(String tickerSymbol) { this.tickerSymbol = tickerSymbol; }

    public BigDecimal getSectorId() { return sectorId; }
    public void setSectorId(BigDecimal sectorId) { this.sectorId = sectorId; }

    public int getSubsectorId() { return subsectorId; }
    public void setSubsectorId(int subsectorId) { this.subsectorId = subsectorId; }

    public long getMarketCap() { return marketCap; }
    public void setMarketCap(long marketCap) { this.marketCap = marketCap; }

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subsectorId=" + subsectorId +
                ", marketCap=" + marketCap +
                '}' +'\n';
    }

    @Override
    public int compareTo(StockFundamentalsVO o) {
        return Long.compare(o.getMarketCap(), this.getMarketCap());
    }
}