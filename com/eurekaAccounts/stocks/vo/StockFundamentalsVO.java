package com.eurekaAccounts.stocks.vo;

public class StockFundamentalsVO {

    public int sectorId;
    public int subsectorId;
    public String tickerSymbol;
    public long marketCap;
    public double currentRatio;
    public double debtEquityRatio;
    public double epsNxtYear;
    public double epsTtm;
    public double epsQq;
    public double forwardPe;
    public double insiderOwnership;
    public int peg;
    public double priceToBookRatio;
    public double roe;
    public double trailing_pe;


    public double getDebtEquityRatio() {
        return debtEquityRatio;
    }

    public void setDebtEquityRatio(double debtEquityRatio) {
        this.debtEquityRatio = debtEquityRatio;
    }

    public double getEpsNxtYear() {
        return epsNxtYear;
    }

    public void setEpsNxtYear(double epsNxtYear) {
        this.epsNxtYear = epsNxtYear;
    }

    public double getEpsTtm() {
        return epsTtm;
    }

    public void setEpsTtm(double epsTtm) {
        this.epsTtm = epsTtm;
    }

    public double getEpsQq() {
        return epsQq;
    }

    public void setEpsQq(double epsQq) {
        this.epsQq = epsQq;
    }

    public double getForwardPe() {
        return forwardPe;
    }

    public void setForwardPe(double forwardPe) {
        this.forwardPe = forwardPe;
    }

    public double getInsiderOwnership() {
        return insiderOwnership;
    }

    public void setInsiderOwnership(double insiderOwnership) {
        this.insiderOwnership = insiderOwnership;
    }

    public int getPeg() {
        return peg;
    }

    public void setPeg(int peg) {
        this.peg = peg;
    }

    public double getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(double priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public double getRoe() {
        return roe;
    }

    public void setRoe(double roe) {
        this.roe = roe;
    }

    public double getTrailing_pe() {
        return trailing_pe;
    }

    public void setTrailing_pe(double trailing_pe) {
        this.trailing_pe = trailing_pe;
    }

    public StockFundamentalsVO(double debtEquityRatio, double epsNxtYear, double epsTtm, double epsQq, double forwardPe, double insiderOwnership, int peg, double priceToBookRatio, double roe, double trailing_pe) {
        this.debtEquityRatio = debtEquityRatio;
        this.epsNxtYear = epsNxtYear;
        this.epsTtm = epsTtm;
        this.epsQq = epsQq;
        this.forwardPe = forwardPe;
        this.insiderOwnership = insiderOwnership;
        this.peg = peg;
        this.priceToBookRatio = priceToBookRatio;
        this.roe = roe;
        this.trailing_pe = trailing_pe;
    }

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "sectorId=" + sectorId +
                ", subsectorId=" + subsectorId +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", debtEquityRatio=" + debtEquityRatio +
                ", epsNxtYear=" + epsNxtYear +
                ", epsTtm=" + epsTtm +
                ", epsQq=" + epsQq +
                ", forwardPe=" + forwardPe +
                ", insiderOwnership=" + insiderOwnership +
                ", peg=" + peg +
                ", priceToBookRatio=" + priceToBookRatio +
                ", roe=" + roe +
                ", trailing_pe=" + trailing_pe +
                '}'+"\n";
    }

    public StockFundamentalsVO(int sectorId, int subsectorId, String tickerSymbol, long marketCap, double currentRatio) {
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }



    public StockFundamentalsVO() {

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

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }
}
