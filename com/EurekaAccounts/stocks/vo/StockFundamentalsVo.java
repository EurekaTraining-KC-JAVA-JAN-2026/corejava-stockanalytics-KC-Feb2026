package com.EurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class StockFundamentalsVo {

    public String ticker_symbol;
    public int sector_id;
    public int subsector_id;
    public BigDecimal market_cap;
    public float current_ratio;


    public StockFundamentalsVo() {
    }

    public StockFundamentalsVo(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public StockFundamentalsVo(String ticker_symbol, int sector_id, int subsector_id, BigDecimal market_cap, float current_ratio) {
        this.ticker_symbol = ticker_symbol;
        this.sector_id = sector_id;
        this.subsector_id = subsector_id;
        this.market_cap = market_cap;
        this.current_ratio = current_ratio;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public int getSubsector_id() {
        return subsector_id;
    }

    public void setSubsector_id(int subsector_id) {
        this.subsector_id = subsector_id;
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

    @Override
    public String toString() {
        return "StockFundamentalsVo{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", sector_id=" + sector_id +
                ", subsector_id=" + subsector_id +
                ", market_cap=" + market_cap +
                ", current_ratio=" + current_ratio +
                '}';
    }
}
