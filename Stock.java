public class Stock {
    //access modifiers
    private String tickerSymbol;
    public long marketCap;
    public double currentRatio;
    public int sectorId;
    public int subSectorID;

    public void stock(){
        return;

    }


    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public Stock(){

    }
    public double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public Stock(String getTickerSymbol){

    }
    public String getTickerSymbol(){
        return tickerSymbol;
    }
    public void setTickerSymbol(String tickerSymbol){
        this.tickerSymbol = tickerSymbol;
    }
}
