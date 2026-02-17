import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorId;

    public Stock() {
    }

    public Stock(String tickerSymbol, int sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
    }

    public Stock(double currentRatio, String tickerSymbol, long marketCap, int sectorId, int subSectorId) {
        this.currentRatio = currentRatio;
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if (sectorId >= 0) {
            this.sectorId = sectorId;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerSymbol, sectorId);
    }

    /* @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return sectorId == stock.sectorId && Objects.equals(tickerSymbol, stock.tickerSymbol);
    } */
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
