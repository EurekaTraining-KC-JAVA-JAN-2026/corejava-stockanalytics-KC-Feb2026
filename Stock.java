import java.util.Objects;

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
    public int sectorId;
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

    public Stock(String tickerSymbol, int sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Stock stock = (Stock) o;
//        return sectorId == stock.sectorId && Objects.equals(tickerSymbol, stock.tickerSymbol);
//    }

    @Override
    public boolean equals(Object outsideObj) {

        boolean isEquals = false;

        if (outsideObj != null && outsideObj instanceof Stock) {

            Stock outside = (Stock) outsideObj;

            if (this.getTickerSymbol().equals(outside.getTickerSymbol())
                    && this.sectorId == outside.sectorId) {

                isEquals = true;
            }
        }

        return isEquals;
    }
    @Override
    public int hashCode() {
        return Objects.hash(tickerSymbol, sectorId);
    }

}