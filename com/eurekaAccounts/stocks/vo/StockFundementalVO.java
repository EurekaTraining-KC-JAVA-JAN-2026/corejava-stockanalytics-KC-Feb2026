package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundementalVO implements Comparable<StockFundementalVO>{
    public StockFundementalVO() {

    }

    public String getTickerSymbol() {

        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
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

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
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

    public String tickerSymbol;
    public int sectorID;
    public int subSectorID;
    public long marketCap;
    public BigDecimal currentRatio;
    public BigDecimal priceToBookRatio;
    public BigDecimal debtEquityRatio;
    public BigDecimal trailingPe;
    public BigDecimal forwardPe;
    public BigDecimal insiderOwnership;
    public BigDecimal roe;
    public int peg;
    public BigDecimal epsqq;
    public BigDecimal epsNxtyear;
    public BigDecimal epsTtm;

    @Override
    public String toString() {
        return "StockFundementalVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorID=" + sectorID +
                ", subSectorID=" + subSectorID +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", priceToBookRatio=" + priceToBookRatio +
                ", debtEquityRatio=" + debtEquityRatio +
                ", trailingPe=" + trailingPe +
                ", forwardPe=" + forwardPe +
                ", insiderOwnership=" + insiderOwnership +
                ", roe=" + roe +
                ", peg=" + peg +
                ", epsqq=" + epsqq +
                ", epsNxtyear=" + epsNxtyear +
                ", epsTtm=" + epsTtm +
                '}'+"\n";
    }

    public BigDecimal getForwardPe() {
        return forwardPe;
    }

    public void setForwardPe(BigDecimal forwardPe) {
        this.forwardPe = forwardPe;
    }

    public BigDecimal getInsiderOwnership() {
        return insiderOwnership;
    }

    public void setInsiderOwnership(BigDecimal insiderOwnership) {
        this.insiderOwnership = insiderOwnership;
    }

    public BigDecimal getRoe()
    {
        return roe;
    }

    public void setRoe(BigDecimal roe) {

        this.roe = roe;
    }

    public int getPeg() {

        return peg;
    }

    public void setPeg(int peg) {

        this.peg = peg;
    }

    public BigDecimal getEpsqq() {
        return epsqq;
    }

    public void setEpsqq(BigDecimal epsqq) {
        this.epsqq = epsqq;
    }

    public BigDecimal getEpsNxtyear() {
        return epsNxtyear;
    }

    public void setEpsNxtyear(BigDecimal epsNxtyear) {
        this.epsNxtyear = epsNxtyear;
    }

    public BigDecimal getEpsTtm() {
        return epsTtm;
    }

    public void setEpsTtm(BigDecimal epsTtm) {
        this.epsTtm = epsTtm;
    }

    public StockFundementalVO(String tickerSymbol, int sectorID, long marketCap, int subSectorID, BigDecimal currentRatio, BigDecimal priceToBookRatio, BigDecimal debtEquityRatio, BigDecimal trailingPe, BigDecimal forwardPe, BigDecimal insiderOwnership, BigDecimal roe, int peg, BigDecimal epsqq, BigDecimal epsNxtyear, BigDecimal epsTtm) {
        this.tickerSymbol = tickerSymbol;
        this.sectorID = sectorID;
        this.marketCap = marketCap;
        this.subSectorID = subSectorID;
        this.currentRatio = currentRatio;
        this.priceToBookRatio = priceToBookRatio;
        this.debtEquityRatio = debtEquityRatio;
        this.trailingPe = trailingPe;
        this.forwardPe = forwardPe;
        this.insiderOwnership = insiderOwnership;
        this.roe = roe;
        this.peg = peg;
        this.epsqq = epsqq;
        this.epsNxtyear = epsNxtyear;
        this.epsTtm = epsTtm;
    }

    @Override
    public int compareTo(StockFundementalVO o) {
       if(o.marketCap > this.getMarketCap()){
           return 1;
       }else if(o.marketCap < this.getMarketCap()){
           return -1;
       } else{
           return 0;
       }
    }
}
