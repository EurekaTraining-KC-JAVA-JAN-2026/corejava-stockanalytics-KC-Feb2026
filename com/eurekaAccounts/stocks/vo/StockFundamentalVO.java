package com.eurekaAccounts.stocks.vo;

public class StockFundamentalVO {

    public String tickerSymbol;
    public int sectorId;
    public int subsectorId;
    public int marketCap;
    public float currentRatio;
    public float priceToBookRa;
    public float peg;
    public float epsqq;
    public float epsNxtYear;

    public StockFundamentalVO() {
    }

    public StockFundamentalVO(String tickerSymbol, int sectorId, int subsectorId, int marketCap, float currentRatio, float priceToBookRa, float peg, float epsqq, float epsNxtYear) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.priceToBookRa = priceToBookRa;
        this.peg = peg;
        this.epsqq = epsqq;
        this.epsNxtYear = epsNxtYear;
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

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    public float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(float currentRatio) {
        this.currentRatio = currentRatio;
    }

    public float getPriceToBookRa() {
        return priceToBookRa;
    }

    public void setPriceToBookRa(float priceToBookRa) {
        this.priceToBookRa = priceToBookRa;
    }

    public float getPeg() {
        return peg;
    }

    public void setPeg(float peg) {
        this.peg = peg;
    }

    public float getEpsqq() {
        return epsqq;
    }

    public void setEpsqq(float epsqq) {
        this.epsqq = epsqq;
    }

    public float getEpsNxtYear() {
        return epsNxtYear;
    }

    public void setEpsNxtYear(float epsNxtYear) {
        this.epsNxtYear = epsNxtYear;
    }

    @Override
    public String toString() {
        return "StockFundamentalVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subsectorId=" + subsectorId +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", priceToBookRa=" + priceToBookRa +
                ", peg=" + peg +
                ", epsqq=" + epsqq +
                ", epsNxtYear=" + epsNxtYear +
                '}' + '\n';
    }
}
