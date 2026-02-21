package com.eurekaAccounts.stocks.StocksVO;

import java.math.BigDecimal;

public class StockSectorVO {
    public String tickersymbol;
    public int sectorId;
    public int subsectorId;
    public BigDecimal marketcap;
    public float currentratio;


    public StockSectorVO(String tickersymbol, int sectorId, int subsectorId, BigDecimal marketcap, float currentratio) {
        this.tickersymbol = tickersymbol;
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
        this.marketcap = marketcap;
        this.currentratio = currentratio;
    }

    public StockSectorVO() {

    }

    public StockSectorVO(String tickerSymbol, int sectorId, int subsectorId, BigDecimal marketCap, float debtEquityRatio, double epsNxtyear, float currentRatio) {
    }

    public StockSectorVO(String s) {
    }

    public StockSectorVO(BigDecimal marketCap) {
    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
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

    public BigDecimal getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(BigDecimal marketcap) {
        this.marketcap = marketcap;
    }

    public float getCurrentratio() {
        return currentratio;
    }

    public void setCurrentratio(float currentratio) {
        this.currentratio = currentratio;
    }



    @Override
    public String toString() {
        return "StockSectorVO{" +
               "tickersymbol='" + tickersymbol + '\'' +
               ", sectorId=" + sectorId +
               ", subsectorId=" + subsectorId +
               ", marketcap=" + marketcap +
               ", currentratio=" + currentratio +
               '}'+'\n';
    }
}