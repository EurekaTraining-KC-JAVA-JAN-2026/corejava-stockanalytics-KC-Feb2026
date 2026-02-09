public class Stock {
    //Access modifiers
    private String tickerSymbol; //As this is private, it can only be set and get through getters and setters
    private int sectorId;
    private long marketCap;
    private int subSectorId;
    private double currentRatio;

    //Getter for private variable
    public String getTickerSymbol() {
        return tickerSymbol;
    }
   //Setter for private variable
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    //Restricting a public variable to be assigned only based on a condition,
    //if any other value is assigned ,it prints 0
    public int getSectorId() {
        return sectorId;
    }
    public void setSectorId(int sectorId) {
        if(sectorId>=0) {
            this.sectorId = sectorId;
        }
    }

    //Getter and setter for marketCap
    public long getMarketCap() {
        return marketCap;
    }
    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    //Getter and setter for subSectorId
    public int getSubSectorId() {
        return subSectorId;
    }
    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    //Getter and setter for currentRatio
    public double getCurrentRatio() {
        return currentRatio;
    }
    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

//    Constructor with no parameters(If there is no another constructor
//    other than this then this will be created by default)
    public Stock() {
    }

    //Constructor with parameters
    public Stock(String tickerSymbol, int sectorId, long marketCap, int subSectorId, double currentRatio) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
        this.marketCap = marketCap;
        this.subSectorId = subSectorId;
        this.currentRatio = currentRatio;
    }

    //Another constructor with parameters but different order of argument
    public Stock(int sectorId, long marketCap, String tickerSymbol, int subSectorId, double currentRatio) {
        this.sectorId = sectorId;
        this.marketCap = marketCap;
        this.tickerSymbol = tickerSymbol;
        this.subSectorId = subSectorId;
        this.currentRatio = currentRatio;
    }
//It is responsible for showing the actual value of the object
    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sectorId=" + sectorId +
                ", marketCap=" + marketCap +
                ", subSectorId=" + subSectorId +
                ", currentRatio=" + currentRatio +
                '}';
    }
}
