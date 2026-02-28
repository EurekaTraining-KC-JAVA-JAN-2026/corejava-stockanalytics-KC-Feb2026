package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class SFDemoVO {

    public String tickerSymbol;
    public BigDecimal sectorId;
    public BigDecimal subsectorId;
    public BigDecimal marketCap;
    public float currentRatio;
    public float priceToBookRa;
    public float peg;
    public float epsqq;
    public float epsNxtYear;

    public SFDemoVO() {
    }

    public SFDemoVO(String tickerSymbol, BigDecimal sectorId, BigDecimal subsectorId, BigDecimal marketCap, float currentRatio, float priceToBookRa, float peg, float epsqq, float epsNxtYear) {
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

    public BigDecimal getSectorId() {
        return sectorId;
    }

    public void setSectorId(BigDecimal sectorId) {
        this.sectorId = sectorId;
    }

    public BigDecimal getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(BigDecimal subsectorId) {
        this.subsectorId = subsectorId;
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
        return "SFDemo{" +
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
