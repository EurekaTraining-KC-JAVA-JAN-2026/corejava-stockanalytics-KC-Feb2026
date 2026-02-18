public class Stock {

    public Stock(double current_ratio, long market_cap, int sectorId, int sub_sectorId, String ticker_symbol) {
        this.current_ratio = current_ratio;
        this.market_cap = market_cap;
        this.sectorId = sectorId;
        this.sub_sectorId = sub_sectorId;
        this.ticker_symbol = ticker_symbol;
    }

    public Stock(int sub_sectorId, String ticker_symbol) {
        this.sub_sectorId = sub_sectorId;
        this.ticker_symbol = ticker_symbol;
    }

    public Stock() {

    }

    //access modifiers(public,private)
    private String ticker_symbol;
    public long market_cap;
    public double current_ratio;
    private int sectorId;

    @Override
    public String toString() {
        return "Stock{" +
                "current_ratio=" + current_ratio +
                ", ticker_symbol='" + ticker_symbol + '\'' +
                ", market_cap=" + market_cap +
                ", sectorId=" + sectorId +
                ", sub_sectorId=" + sub_sectorId +
                '}' + "\n";
    }

    public Stock(double current_ratio, long market_cap, int sectorId) {
        this.current_ratio = current_ratio;
        this.market_cap = market_cap;
        this.sectorId = sectorId;
    }


    public int sub_sectorId;

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        if (sectorId > 0) {
            this.sectorId = sectorId;
        }
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    //getter and setter are  to add extra validation
    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }


//   public boolean equals(Object outSideObj){
//        if(outSideObj !=null && (outSideObj instanceof Stock)){
//            Stock outside=(Stock) outSideObj;
//            if(this.getTicker_symbol().equals(outside.getTicker_symbol() );
//        }

}
