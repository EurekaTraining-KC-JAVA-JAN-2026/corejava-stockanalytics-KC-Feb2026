package com.eurekaAccounts.stocks.MVC;

import java.time.LocalDate;
import java.util.Date;

public class SPHVO {
    public String tickerSymbol;
//    public LocalDate tradingDate;
    public Date tradingDate;
    public double openPrice;
    public double closePrice;

    public SPHVO() {
    }

    public SPHVO(String tickerSymbol, Date tradingDate, double openPrice, double closePrice) {
        this.tickerSymbol = tickerSymbol;
        this.tradingDate = tradingDate;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public Date getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(Date tradingDate) {
        this.tradingDate = tradingDate;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    @Override
    public String toString() {
        return "SPHVO{" +
                "tickerSymbol='" + tickerSymbol  +
                ", tradingDate=" + tradingDate +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                '}'+ '\n';
    }
}
