import java.util.Objects;

public class Stock {

    //access modifiers
    private String tickerSymbol;
    public long marketCap;
    public double currentRatio;
    public int sectorId;
    public int subSectorID;

    public Stock(String tickerSymbol, int i){
        this.sectorId = SectorId();
        this.tickerSymbol = tickerSymbol;
    }

    private int SectorId() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return sectorId == stock.sectorId && Objects.equals(tickerSymbol, stock.tickerSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerSymbol, sectorId);
    }

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


/*
public class Stock {
    //access modifier
    //class having class Stock()
    //constructor having only Stock()

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subSectorId;
    //constr. with no parameters
    public Stock() {
    }
    //constructor with five parameters
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }





    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }



    private double getCurrentRatio() {
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
        if(sectorId>=0)
            this.sectorId=sectorId;
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }



    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
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

*/