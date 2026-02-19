package com.eurekaAccounts.stocks.vo;

public class StockFundamentalsVO {
    public String tickerSymbol;
    public int sectorID;
    public int subSectorID;
    public double marketCap;
    public float currentRatio;
    public float priceToBookRatio;

    public StockFundamentalsVO(float currentRatio, double marketCap, float priceToBookRatio, int sectorID, int subSectorID, String tickerSymbol) {
        this.currentRatio = currentRatio;
        this.marketCap = marketCap;
        this.priceToBookRatio = priceToBookRatio;
        this.sectorID = sectorID;
        this.subSectorID = subSectorID;
        this.tickerSymbol = tickerSymbol;
    }

    public StockFundamentalsVO() {
    }

    public float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(float currentRatio) {
        this.currentRatio = currentRatio;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public float getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(float priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
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

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "currentRatio=" + currentRatio +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorID=" + sectorID +
                ", subSectorID=" + subSectorID +
                ", marketCap=" + marketCap +
                ", priceToBookRatio=" + priceToBookRatio +
                '}'+'\n';
    }
}
