package com.eurekaAccounts.stocks.stocksVO;

import java.math.BigDecimal;
import java.util.Date;

public class StockPriceHistoryVO {
    public String tickerSymbol;
    public Date tradingDate;
    public BigDecimal openRate;
    public BigDecimal closePrice;
    public BigDecimal volume;

    public StockPriceHistoryVO() {
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

    public BigDecimal getOpenRate() {
        return openRate;
    }

    public void setOpenRate(BigDecimal openRate) {
        this.openRate = openRate;
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

    public StockPriceHistoryVO(String tickerSymbol, Date tradingDate, BigDecimal openRate, BigDecimal closePrice, BigDecimal volume) {
        this.tickerSymbol = tickerSymbol;
        this.tradingDate = tradingDate;
        this.openRate = openRate;
        this.closePrice = closePrice;
        this.volume = volume;

    }

    @Override
    public String toString() {
        return "StockPriceHistoryVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", tradingDate=" + tradingDate +
                ", openRate=" + openRate +
                ", closePrice=" + closePrice +
                ", volume=" + volume +
                '}'+'\n';
    }
}
