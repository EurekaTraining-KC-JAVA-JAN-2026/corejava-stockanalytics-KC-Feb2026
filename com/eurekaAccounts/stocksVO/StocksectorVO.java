package com.eurekaAccounts.stocksVO;

public class StocksectorVO {
    public StocksectorVO(String tickersymbol, int sectorid, int marketcap, int subsectorid, double pricetobookratio, float currentratio) {
        this.tickersymbol = tickersymbol;
        this.sectorid = sectorid;
        //this.marketcap = marketcap;
        this.subsectorid = subsectorid;
        this.pricetobookratio = pricetobookratio;
        this.currentratio = currentratio;
    }

    public StocksectorVO(String tickerSymbol, int sectorId, int subsectorId, float currentRatio, double priceToBookRatio) {
    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
    }

    public int getSubsectorid() {
        return subsectorid;
    }

    public void setSubsectorid(int subsectorid) {
        this.subsectorid = subsectorid;
    }

   // public int getMarketcap() {
     //   return (int) marketcap;
    //}

    //public void setMarketcap(int marketcap) {
       // this.marketcap = marketcap;
   // }

    public float getCurrentratio() {
        return currentratio;
    }

    public void setCurrentratio(float currentratio) {
        this.currentratio = currentratio;
    }

    public double getPricetobookratio() {
        return pricetobookratio;
    }

    public void setPricetobookratio(double pricetobookratio) {
        this.pricetobookratio = pricetobookratio;
    }

    public String  tickersymbol;
    public int sectorid;
    public int subsectorid;
    public long marketcap;
    public float currentratio;
    public double pricetobookratio;

    @Override
    public String toString() {
        return "StocksectorVO{" +
                "tickersymbol='" + tickersymbol + '\'' +
                ", sectorid=" + sectorid +
                ", subsectorid=" + subsectorid +
                //", marketcap=" + marketcap +
                ", currentratio=" + currentratio +
                ", pricetobookratio=" + pricetobookratio +
                '}';
    }
}
