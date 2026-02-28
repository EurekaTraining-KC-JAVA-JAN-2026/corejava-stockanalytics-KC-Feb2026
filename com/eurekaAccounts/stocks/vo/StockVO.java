package com.eurekaAccounts.stocks.vo;

public class StockVO {
    
    private long market_cap;
    private int sector_id;
    private int sub_sector_id;
    private String ticker_name;

    private String ticker_symbol;

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public String getTicker_name() {
        return ticker_name;
    }

    public void setTicker_name(String ticker_name) {
        this.ticker_name = ticker_name;
    }

    public StockVO() {
    }

    public long getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(long market_cap) {
        this.market_cap = market_cap;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public int getSub_sector_id() {
        return sub_sector_id;
    }

    public StockVO(long market_cap, int sector_id, int sub_sector_id, String ticker_name, String ticker_symbol) {
        this.market_cap = market_cap;
        this.sector_id = sector_id;
        this.sub_sector_id = sub_sector_id;
        this.ticker_name = ticker_name;
        this.ticker_symbol = ticker_symbol;
    }

    @Override
    public String toString() {
        return "StockVO{" +
                "market_cap=" + market_cap +
                ", sector_id=" + sector_id +
                ", sub_sector_id=" + sub_sector_id +
                ", ticker_name='" + ticker_name + '\'' +
                ", ticker_symbol='" + ticker_symbol + '\'' +
                '}';
    }

    public void setSub_sector_id(int sub_sector_id) {
        this.sub_sector_id = sub_sector_id;
    }


}
