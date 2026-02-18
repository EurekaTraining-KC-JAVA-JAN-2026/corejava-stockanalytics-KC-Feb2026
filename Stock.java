import java.util.Objects;

public class Stock {
    //these will define stock (properties)
 //to create an object from class we need constructor and also
    // default constructor
    //public Stock() {
   // }


    //parameterized constructor
// jav awill create a constructor with parameters

    // access modifier ,
    /*
    public:- evryone can acess
    private
    protected
     */

    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;

    public Stock(String tickerSymbol, int sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
    }

    private int sectorId;

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Stock stock = (Stock) o;//type casting (whatever value we sends it will change obj  to stock obj)
//        return sectorId == stock.sectorId && Objects.equals(tickerSymbol, stock.tickerSymbol);//
//    }


    @Override
    public boolean equals(Object outSideObj) {
        boolean isEquals = false;
      if(outSideObj !=null && (outSideObj instanceof Stock)){
          Stock outSide = (Stock) outSideObj;//typecasted the outsideobj to outside
          if(this.getTickerSymbol().equals(outSide.getTickerSymbol())&& this.sectorId==outSide.sectorId)
              isEquals=true;
      }
      else{
          isEquals=false;
      }
      return isEquals;
    }

    @Override
    public int hashCode() {// will discuss in collections
        return Objects.hash(tickerSymbol, sectorId);
    }

    public int subSectorId;
// default constructor
    public Stock() {

    }
    //with parameters
    public Stock(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subSectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
    }

    public Stock(String g) {
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
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if (sectorId > 0) {
            this.sectorId = sectorId;
        }
    }


    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

// this to string is for printing all values
    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                '}'+ "\n";
    }

// Stock appleStock = new Stock();


}
