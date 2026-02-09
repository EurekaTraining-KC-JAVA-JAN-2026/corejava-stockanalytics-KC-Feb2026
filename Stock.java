public class Stock {
    // Access modifiers (public, private)

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int SectorId;
    private int SubSectorId;

    public Stock() {

    }

    public Stock(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public Stock(String tickerSymbol, int subSectorId, int sectorId, double currentRatio, long marketCap) {
        this.tickerSymbol = tickerSymbol;
        SubSectorId = subSectorId;
        SectorId = sectorId;
        this.currentRatio = currentRatio;
        this.marketCap = marketCap;
    }



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
        return SectorId;
    }

    public void setSectorId(int sectorId) {
        SectorId = sectorId;
    }

    public int getSubSectorId() {
        return SubSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        SubSectorId = subSectorId;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", SectorId=" + SectorId +
                ", SubSectorId=" + SubSectorId +
                '}';
    }
}
