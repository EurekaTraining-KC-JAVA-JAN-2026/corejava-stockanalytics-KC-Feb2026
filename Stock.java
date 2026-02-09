public class Stock {
          private String tickerSymbol;
          private long marketCap;

    public long getMarketCap() {
        return marketCap;
    }

    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    public Stock(String tickerSymbol, long marketCap, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    private double currentRatio;
          private int sectorId;
          private int subSectorId;

    public Stock(String goog, long i, int i1, int i2, double v) {
        this.tickerSymbol = goog;
        this.marketCap = i;
        this.currentRatio = v;
        this.sectorId = i1 ;
        this.subSectorId = i2;
    }

    public Stock() {

    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

}
