public class Day2 {

    // ===== Fields (Variables of the class) =====
    private String tickerSymbol;
    private long marketCap;
    private double currentRatio;
    private int sectorId;
    private int subsectorId;


    public Day2(String tickerSymbol, int sectorId) {
        this.tickerSymbol = tickerSymbol;
        this.sectorId = sectorId;
    }


    // ===== Default Constructor =====
    public Day2() {
    }

    // ===== Parameterized Constructor =====
    public Day2(String tickerSymbol, long marketCap, double currentRatio, int sectorId, int subsectorId) {
        this.tickerSymbol = tickerSymbol;
        this.marketCap = marketCap;
        this.currentRatio = currentRatio;
        this.sectorId = sectorId;
        this.subsectorId = subsectorId;
    }

    public Day2(String iylly, int i, double v) {

    }

    // ===== Getters =====
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public int getSectorId() {
        return sectorId;
    }

    public int getSubsectorId() {
        return subsectorId;
    };

    // ===== Setters =====
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    // ===== Main Method (Testing the class) =====
    public static void main(String[] args) {

        // Using default constructor + setters
        Day2 obj1 = new Day2();
        obj1.setTickerSymbol("AAPL");
        obj1.setMarketCap(5000000000L);
        obj1.setCurrentRatio(1.25);
        obj1.setSectorId(10);
        obj1.setSubsectorId(5);

        System.out.println("=== Using Default Constructor ===");
        System.out.println(obj1.getTickerSymbol());
        System.out.println(obj1.getMarketCap());
        System.out.println(obj1.getCurrentRatio());
        System.out.println(obj1.getSectorId());
        System.out.println(obj1.getSubsectorId());

        // Using parameterized constructor
        Day2 obj2 = new Day2("MSFT", 8000000000L, 2.15, 20, 8);

        System.out.println("\n=== Using Parameterized Constructor ===");
        System.out.println(obj2.getTickerSymbol());
        System.out.println(obj2.getMarketCap());
        System.out.println(obj2.getCurrentRatio());
        System.out.println(obj2.getSectorId());
        System.out.println(obj2.getSubsectorId());
    }

    @Override
    public String toString() {
        return "Day2{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", marketCap=" + marketCap +
                ", currentRatio=" + currentRatio +
                ", sectorId=" + sectorId +
                ", subsectorId=" + subsectorId +
                '}';
    }
}
