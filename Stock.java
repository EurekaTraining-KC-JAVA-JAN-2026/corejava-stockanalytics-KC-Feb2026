public class Stock {
    //access modifiers
    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorID;
    //constr. with no param's
    public Stock() {
    }
    //constr. with 3 param's
    public Stock(String tickerSymbol, long marketCap, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }
    //constr. with 5 param's
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorID) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorID = subSectorID;
    }
    public Stock(String tickerSymbol,int sectorId){
        this.sectorId = sectorId;
        this.tickerSymbol = tickerSymbol;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public int getSubSectorID() {
        return subSectorID;
    }

    public void setSubSectorID(int subSectorID) {
        this.subSectorID = subSectorID;
    }


    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if(sectorId>=0){
            this.sectorId = sectorId;
        }
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

   @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", subSectorID=" + subSectorID +
                '}'+'\n';
    }
}