package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalVO{
    public String tickerSymbol;
    public int sectorId;
    public int subSectorId;
    public BigDecimal marketCap;
    public BigDecimal currentRatio;
    public BigDecimal priceToBookRatio;
    public BigDecimal Peg;
    public BigDecimal Epsqq;
    public BigDecimal epsNxtYear;
    public BigDecimal epsTtm;
    public BigDecimal Roe;
    public BigDecimal insiderOwnership;
    public BigDecimal debtEquityRatio;
    public BigDecimal trailingPe;
    public BigDecimal forwardPe;

    public StockFundamentalVO(String tickerSymbol, int sectorId, int subSectorId, BigDecimal marketCap, BigDecimal currentRatio, BigDecimal priceToBookRatio, BigDecimal peg, BigDecimal epsqq, BigDecimal epsNxtYear, BigDecimal epsTtm, BigDecimal roe, BigDecimal insiderOwnership, BigDecimal debtEquityRatio, BigDecimal trailingPe, BigDecimal forwardPe) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.priceToBookRatio = priceToBookRatio;
        Peg = peg;
        Epsqq = epsqq;
        this.epsNxtYear = epsNxtYear;
        this.epsTtm = epsTtm;
        Roe = roe;
        this.insiderOwnership = insiderOwnership;
        this.debtEquityRatio = debtEquityRatio;
        this.trailingPe = trailingPe;
        this.forwardPe = forwardPe;


    }

    public StockFundamentalVO() {
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

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(BigDecimal currentRatio) {
        this.currentRatio = currentRatio;
    }

    public BigDecimal getPeg() {
        return Peg;
    }

    public void setPeg(BigDecimal peg) {
        Peg = peg;
    }

    public BigDecimal getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(BigDecimal priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public BigDecimal getEpsqq() {
        return Epsqq;
    }

    public void setEpsqq(BigDecimal epsqq) {
        Epsqq = epsqq;
    }

    public BigDecimal getEpsNxtYear() {
        return epsNxtYear;
    }

    public void setEpsNxtYear(BigDecimal epsNxtYear) {
        this.epsNxtYear = epsNxtYear;
    }

    public BigDecimal getEpsTtm() {
        return epsTtm;
    }

    public void setEpsTtm(BigDecimal epsTtm) {
        this.epsTtm = epsTtm;
    }

    public BigDecimal getRoe() {
        return Roe;
    }

    public void setRoe(BigDecimal roe) {
        Roe = roe;
    }

    public BigDecimal getInsiderOwnership() {
        return insiderOwnership;
    }

    public void setInsiderOwnership(BigDecimal insiderOwnership) {
        this.insiderOwnership = insiderOwnership;
    }

    public BigDecimal getDebtEquityRatio() {
        return debtEquityRatio;
    }

    public void setDebtEquityRatio(BigDecimal debtEquityRatio) {
        this.debtEquityRatio = debtEquityRatio;
    }

    public BigDecimal getTrailingPe() {
        return trailingPe;
    }

    public void setTrailingPe(BigDecimal trailingPe) {
        this.trailingPe = trailingPe;
    }

    public BigDecimal getForwardPe() {
        return forwardPe;
    }

    public void setForwardPe(BigDecimal forwardPe) {
        this.forwardPe = forwardPe;
    }

    @Override
    public String toString() {
        return "StockFundamentalVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", priceToBookRatio=" + priceToBookRatio +
                ", Peg=" + Peg +
                ", Epsqq=" + Epsqq +
                ", epsNxtYear=" + epsNxtYear +
                ", epsTtm=" + epsTtm +
                ", Roe=" + Roe +
                ", insiderOwnership=" + insiderOwnership +
                ", debtEquityRatio=" + debtEquityRatio +
                ", trailingPe=" + trailingPe +
                ", forwardPe=" + forwardPe +
                '}'+ '\n';
    }
}