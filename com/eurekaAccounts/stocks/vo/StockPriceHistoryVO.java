package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;
import java.util.Date;
public class StockPriceHistoryVO {

    public Date tradingDate;
    String tickerSymbol;
    BigDecimal openPrice;
    BigDecimal closingPrice;
    BigDecimal Volume;

    @Override
    public String toString() {
        return "StockPriceHistoryVO{" +
                "tradingDate=" + tradingDate +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                ", openPrice=" + openPrice +
                ", closingPrice=" + closingPrice +
                ", Volume=" + Volume +
                '}';
    }

    public Date getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(Date tradingDate) {
        this.tradingDate = tradingDate;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public BigDecimal getVolume() {
        return Volume;
    }

    public void setVolume(BigDecimal volume) {
        Volume = volume;
    }

    public StockPriceHistoryVO(Date tradingDate, String tickerSymbol, BigDecimal openPrice, BigDecimal closingPrice, BigDecimal volume) {
        this.tradingDate = tradingDate;
        this.tickerSymbol = tickerSymbol;
        this.openPrice = openPrice;
        this.closingPrice = closingPrice;
        Volume = volume;
    }

    public StockPriceHistoryVO() {
    }
}
