package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockSectorVO {
    public StockSectorVO(String ticker_symbol, int sectorId, int subsectorId, BigDecimal market_cap, float current_ratio) {
        this.ticker_symbol = ticker_symbol;
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
        this.market_cap = market_cap;
        this.current_ratio = current_ratio;
    }

    public StockSectorVO() {

    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
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

    public BigDecimal getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(BigDecimal market_cap) {
        this.market_cap = market_cap;
    }

    public float getCurrent_ratio() {
        return current_ratio;
    }

    public void setCurrent_ratio(float current_ratio) {
        this.current_ratio = current_ratio;
    }

    public String ticker_symbol;
    public int sectorId;
    public int subsectorId;
    public BigDecimal market_cap;
    public float current_ratio;

    @Override
    public String toString() {
        return "StockSectorVO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", sectorId=" + sectorId +
                ", subsectorId=" + subsectorId +
                ", market_cap=" + market_cap +
                ", current_ratio=" + current_ratio +
                '}';
    }
}













