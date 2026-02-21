package com.eurekaAccounts.stocks.vo;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO> {

    private String tickerSymbol;
    private int sectorId;
    private int subsectorId;
    private long marketCap;

    public StockFundamentalsVO() {}

    public StockFundamentalsVO(String tickerSymbol, long marketCap, int subsectorId, int sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.subsectorId = subsectorId;
        this.sectorId = sectorId;
    }

    public String getTickerSymbol() { return tickerSymbol; }
    public void setTickerSymbol(String tickerSymbol) { this.tickerSymbol = tickerSymbol; }

    public int getSectorId() { return sectorId; }
    public void setSectorId(int sectorId) { this.sectorId = sectorId; }

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