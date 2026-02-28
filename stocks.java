public class stocks{
    String tickersymbol;
    long marketcap;
    double currentratio;
     int sectorid;
     int subsectorid;

    public stocks(String aapl, int i, int i1) {
    }

//    public stocks(String aapl, int i, int i1) {
//    }


    @Override
    public String toString() {
        return "stocks{" +
                "tickersymbol='" + tickersymbol + '\'' +
                ", marketcap=" + marketcap +
                ", currentratio=" + currentratio +
                ", sectorid=" + sectorid +
                ", subsectorid=" + subsectorid +
                '}';
    }

    public stocks(String tickersymbol, int sectorid) {
        this.tickersymbol = tickersymbol;
        this.sectorid = sectorid;
    }
    public stocks(String tickersymbol, long marketcap, double currentratio, int sectorid, int subsectorid) {
        this.tickersymbol = tickersymbol;
        this.marketcap = marketcap;
        this.currentratio = currentratio;
        this.sectorid = sectorid;
        this.subsectorid = subsectorid;
    }

    public stocks() {
    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }



    public long getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(long marketcap) {
        this.marketcap = marketcap;
    }




}
