package com.eurekaAccount.sectorVO;

import java.math.BigDecimal;

public class StockFSectorVO {

    public StockFSectorVO(String tickersymbol, int sectorId, int subsectorId, BigDecimal marketcap, float debtquaityratio, double epsnxtyear, float currentratio) {
        this.tickersymbol = tickersymbol;
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
        this.marketcap = marketcap;
        this.debtquaityratio = debtquaityratio;
        this.epsnxtyear = epsnxtyear;
        this.currentratio = currentratio;
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

    public float getDebtquaityratio() {
        return debtquaityratio;
    }

    public void setDebtquaityratio(float debtquaityratio) {
        this.debtquaityratio = debtquaityratio;
    }

    public double getEpsnxtyear() {
        return epsnxtyear;
    }

    public void setEpsnxtyear(double epsnxtyear) {
        this.epsnxtyear = epsnxtyear;
    }

    public float getCurrentratio() {
        return currentratio;
    }

    public void setCurrentratio(float currentratio) {
        this.currentratio = currentratio;
    }

    public String tickersymbol;
    public int sectorId;
    public int subsectorId;
    public BigDecimal marketcap;
    public float debtquaityratio;
    public double epsnxtyear;
    public float currentratio;

    @Override
    public String toString() {
        return "StockFSectorVO{" +
               "tickersymbol='" + tickersymbol + '\'' +
               ", sectorId=" + sectorId +
               ", subsectorId=" + subsectorId +
               ", marketcap=" + marketcap +
               ", debtquaityratio=" + debtquaityratio +
               ", epsnxtyear=" + epsnxtyear +
               ", currentratio=" + currentratio +
               '}'+'\n';
    }
}
