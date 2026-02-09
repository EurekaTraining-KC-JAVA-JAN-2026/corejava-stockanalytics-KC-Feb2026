public class Stock {
    private String tickerSymbol;
    private long marketCap;
    private int subsectorID;
    private double currentRatio;
    private int sectorId;

    public Stock(){

    }
    public Stock(String tickerSymbol,long marketCap,double currentRatio){
        this.tickerSymbol=tickerSymbol;
        this.marketCap=marketCap;
        this.currentRatio=currentRatio;

    }

    public Stock(String tickerSymbol, long marketCap, double currentRatio, int subsectorID, int sectorId){
        this.tickerSymbol=tickerSymbol;
        this.marketCap=marketCap;
        this.currentRatio=currentRatio;
        this.subsectorID=subsectorID;
        this.sectorId=sectorId;
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



    public int getSubsectorID() {
        return subsectorID;
    }

    public void setSubsectorID(int subsectorID) {
        this.subsectorID = subsectorID;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", subsectorID=" + subsectorID +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                '}';
    }
}
