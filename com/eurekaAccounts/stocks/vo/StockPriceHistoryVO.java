package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;
import java.util.Date;

public class StockPriceHistoryVO {
    public String tickerSymbol;
    public Date tradingDate;
    public BigDecimal openPrice;
    public BigDecimal closePrice;
    public BigDecimal volume;

    public StockPriceHistoryVO(String tickerSymbol, Date tradingDate, BigDecimal openPrice, BigDecimal closePrice, BigDecimal volume) {
        this.tickerSymbol = tickerSymbol;
        this.tradingDate = tradingDate;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "StockPriceHistoryVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", tradingDate=" + tradingDate +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", volume=" + volume +
                '}' + '\n';
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public Date getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(Date tradingDate) {
        this.tradingDate = tradingDate;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public StockPriceHistoryVO() {
    }
}
