public class Stock {

    /**
     * properties
     */
    private String tickerSymbol;
    private int sectorId;
    private int marketCap;
    private String currentRatio;
    private int subsectorId;

    public Stock() {
    }

    public Stock(String tickerSymbol, int sectorId, int marketCap, String currentRatio, int subsectorId) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.subsectorId = subsectorId;
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

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    public String getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(String currentRatio) {
        this.currentRatio = currentRatio;
    }

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public void setSectorId(int sectorId) {

        if (sectorId > 0) {
            this.sectorId = sectorId;
        } else {
            throw (new RuntimeException("SectorID shoudl be greater than 0"));
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", marketCap=" + marketCap +
                ", currentRatio='" + currentRatio + '\'' +
                ", subsectorId=" + subsectorId +
                '}';
    }
}
