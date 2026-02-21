package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockfundamentalVO implements Comparable<StockfundamentalVO>{
    public String tickerSymbol;
    public int sectorId;
    public int subSectorId;
    public float marketCap;
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

    public StockfundamentalVO(String tickerSymbol, int sectorId, int subSectorId, float marketCap, BigDecimal currentRatio, BigDecimal priceToBookRatio, BigDecimal peg, BigDecimal epsqq, BigDecimal epsNxtYear, BigDecimal epsTtm, BigDecimal roe, BigDecimal insiderOwnership, BigDecimal debtEquityRatio, BigDecimal trailingPe, BigDecimal forwardPe) {

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

    public StockfundamentalVO() {
    }

    public StockfundamentalVO(String tickerSymbol, int sectorId, Object o) {
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

    public float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(BigDecimal currentRatio) {
        this.currentRatio = currentRatio;
    }

    public BigDecimal getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(BigDecimal priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public BigDecimal getPeg() {
        return Peg;
    }

    public void setPeg(BigDecimal peg) {
        Peg = peg;
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
        return "StockfundamentalVO{" +
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
               '}'+'\n';
    }

    @Override
    public int compareTo(StockfundamentalVO o) {
        if (o.marketCap>  this.getMarketCap()){
            return 1;
        }else if(o.marketCap < this.getMarketCap()){
            return -1;
        }
        else{
            return 0;
        }
    }
    }
