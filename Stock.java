public class Stock {
    //access modifier

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorId;

    public Stock() {
    }

    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }



    private double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }



    public int getSectorId() {
        if(sectorId>=0)
            this.sectorId=sectorId;
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }



    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}