import java.util.Objects;

public class Stock {
    //access modifiers
    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorID;

    //constructor with no parameters
    public Stock() {
    }
    //constructor with 3 parameters

    public Stock(String tickerSymbol, long marketCap, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }

    //constructor with 5 parameters
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorID) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorID = subSectorID;
    }
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public long getMarketCap() {
        return marketCap;
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

    public int getSubSectorID() {
        return subSectorID;
    }

    public void setSubSectorID(int subSectorID) {
        this.subSectorID = subSectorID;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if(sectorId>=0) {
            this.sectorId = sectorId;
        }
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return marketCap == stock.marketCap && Double.compare(currentRatio, stock.currentRatio) == 0 && sectorId == stock.sectorId && subSectorID == stock.subSectorID && Objects.equals(tickerSymbol, stock.tickerSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerSymbol, marketCap, currentRatio, sectorId, subSectorID);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", subSectorID=" + subSectorID +
                '}';
    }
}
