package com.eurekaAccounts.stocks.vo;

public class StockFundamentalVO implements Comparable<StockFundamentalVO>{
    public String tickerSymbol;
    public int sector_id;
    public int subsector_id;
    public long marketCap;
    public float current_ratio;

//    public StockFundamentalVO(String tickerSymbol) {
//        this.tickerSymbol = tickerSymbol;
//    }

    public StockFundamentalVO(String tickerSymbol, int sector_id, int subsector_id, long marketCap, float current_ratio) {
        this.tickerSymbol = tickerSymbol;
        this.sector_id = sector_id;
        this.subsector_id = subsector_id;
        this.marketCap = marketCap;
        this.current_ratio = current_ratio;
    }

    public StockFundamentalVO() {
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
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

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public float getCurrent_ratio() {
        return current_ratio;
    }

    public void setCurrent_ratio(float current_ratio) {
        this.current_ratio = current_ratio;
    }

//    @Override
//    public String toString() {
//        return "StockFundamentalVO{" +
//                "tickerSymbol=" + tickerSymbol  +
//                ", sector_id=" + sector_id +
//                ", subsector_id=" + subsector_id +
//                ", marketCap=" + marketCap +
//                ", current_ratio=" + current_ratio +
//                '}' + '\n';
//    }


    @Override
    public String toString() {
        return "StockFundamentalVO{" +
                "tickerSymbol='" + tickerSymbol  +
                '}' + '\n';
    }

    @Override
    public int compareTo(StockFundamentalVO o) {
        if(this.marketCap>o.marketCap){
            return 1;
        } else if (this.marketCap < o.marketCap) {
            return -1;
        }
        else{
            return 0;
        }
//        return this.tickerSymbol.compareToIgnoreCase(o.tickerSymbol);
    }
}
