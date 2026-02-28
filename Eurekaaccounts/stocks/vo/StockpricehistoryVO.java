package Eurekaaccounts.stocks.vo;

import java.math.BigDecimal;
import java.util.Date;

public class StockpricehistoryVO {
    public String ticker_symbol;
    public Date trading_date;
    public BigDecimal openprice;
    public BigDecimal closeprice;
    public BigDecimal volume;

    public StockpricehistoryVO() {
    }

    public StockpricehistoryVO(String ticker_symbol, Date trading_date, BigDecimal openprice, BigDecimal closeprice, BigDecimal volume) {
        this.ticker_symbol = ticker_symbol;
        this.trading_date = trading_date;
        this.openprice = openprice;
        this.closeprice = closeprice;
        this.volume = volume;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public Date getTrading_date() {
        return trading_date;
    }

    public void setTrading_date(Date trading_date) {
        this.trading_date = trading_date;
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

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "StockpricehistoryVO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", trading_date=" + trading_date +
                ", openprice=" + openprice +
                ", closeprice=" + closeprice +
                ", volume=" + volume +
                '}'+"\n";
    }
}
