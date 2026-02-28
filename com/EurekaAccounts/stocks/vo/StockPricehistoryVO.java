package com.EurekaAccounts.stocks.vo;


import java.math.BigDecimal;
import java.util.Date;

public class StockPricehistoryVO {
    public String tickerSymbol;
    public Date tradigDate;
    public BigDecimal openPrice;

    public BigDecimal closePrice;

    public BigDecimal  volume;

    public StockPricehistoryVO() {

    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public Date getTradigDate() {
        return tradigDate;
    }

    public void setTradigDate(Date tradigDate) {
        this.tradigDate = tradigDate;
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

    @Override
    public String toString() {
        return "StockPricehistoryVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", tradigDate=" + tradigDate +
                ", openPrice=" + openPrice +
                ", closePrice=" + closePrice +
                ", volume=" + volume +
                '}'+'\n';
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public StockPricehistoryVO(String tickerSymbol, Date tradigDate, BigDecimal openPrice, BigDecimal closePrice, BigDecimal volume) {
        this.tickerSymbol = tickerSymbol;
        this.tradigDate = tradigDate;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.volume = volume;
    }
}
