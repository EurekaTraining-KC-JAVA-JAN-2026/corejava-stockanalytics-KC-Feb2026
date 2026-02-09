import java.util.Objects;

public class Stock {
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    //access modifiers
    public Stock() {

    }

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorId;

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
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

    public int getSectorId() {
            return sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public void  setSectorId(int sectorId) {
        if (sectorId >= 0) {
            this.sectorId = sectorId;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return marketCap == stock.marketCap && Double.compare(currentRatio, stock.currentRatio) == 0 && sectorId == stock.sectorId && subSectorId == stock.subSectorId && Objects.equals(tickerSymbol, stock.tickerSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerSymbol, marketCap, currentRatio, sectorId, subSectorId);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                '}';
    }
}