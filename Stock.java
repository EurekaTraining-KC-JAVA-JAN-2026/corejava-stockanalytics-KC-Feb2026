public class Stock {
    //access modifiers

    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subsectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        SubsectorId = subsectorId;
    }

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int SubsectorId;

    public Stock(String tickerSymbol, long marketCap, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
    }

    public Stock() {

    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public int getSectorId() {
        if(sectorId<=0){
            this.sectorId = sectorId;

        }

        return sectorId;
    }

    public void setSectorId(int sectorId) {

        //this.sectorId = sectorId;
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

    public int getSubsectorId() {
        return SubsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        SubsectorId = subsectorId;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", SubsectorId=" + SubsectorId +
                '}';
    }

}
