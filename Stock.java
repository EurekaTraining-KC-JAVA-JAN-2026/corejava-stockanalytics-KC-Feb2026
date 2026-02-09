public class Stock {
    String tickerSymbol;
    int sectorId;
    long marketCap;
    int subSectorID;
    double currentRatio;

    // default constructor with 0 parameters
    public Stock() {
        System.out.println("Default constructor called");
    }
    // Parameterized constructor with 5 parameters
    public Stock(String tickerSymbol, int sectorId, long marketCap, int subSectorID, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.marketCap = marketCap;
        this.subSectorID = subSectorID;
        this.currentRatio = currentRatio;
        System.out.println("Parameterized constructor called");

    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}