public class Stock {
// 1 st of constructor using the Generate with all the parameters
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    // 2 nd type with a construtor with NO parameters
    public Stock(){

    }

    // 3 rd type can with using only 1 parameter

    public Stock(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }



    // i don't want to see the ref symbol so that we can use the generate in the to string we just call like print(honda)
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


    //----------------------

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorId;

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

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if (sectorId >= 0) {
            this.sectorId = sectorId;
        }
    }



    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
        this.currentRatio= currentRatio;
    }
}
