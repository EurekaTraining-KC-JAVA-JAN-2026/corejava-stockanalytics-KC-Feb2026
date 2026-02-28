package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;
import java.util.Date;

public class StockPirceHistoryVO {

    public String tickersymbol;
    public Date tradingdate;
    public BigDecimal openprice;
    public BigDecimal closeprice;

    public StockPirceHistoryVO(String tickersymbol, BigDecimal closeprice, BigDecimal openprice, Date tradingdate) {
        this.tickersymbol = tickersymbol;
        this.closeprice = closeprice;
        this.openprice = openprice;
        this.tradingdate = tradingdate;
    }

    public StockPirceHistoryVO() {

    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public Date getTradingdate() {
        return tradingdate;
    }

    public void setTradingdate(Date tradingdate) {
        this.tradingdate = tradingdate;
    }

    public BigDecimal getOpenprice() {
        return openprice;
    }

    public void setOpenprice(BigDecimal openprice) {
        this.openprice = openprice;
    }

    public BigDecimal getCloseprice() {
        return closeprice;
    }

    public void setCloseprice(BigDecimal closeprice) {
        this.closeprice = closeprice;
    }

    @Override
    public String toString() {
        return "StockPirceHistoryVO{" +
                "tickersymbol='" + tickersymbol + '\'' +
                ", tradingdate=" + tradingdate +
                ", openprice=" + openprice +
                ", closeprice=" + closeprice +
                '}' + '\n';
    }


}
