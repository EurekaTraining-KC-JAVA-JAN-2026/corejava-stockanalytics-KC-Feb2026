public class Eureka {
    public static void main(String[] args) {
        System.out.println(("Welcome Eureka.....!"));
        int i;
        i = 10;
        int j = 20;

        System.out.println(System.identityHashCode(i));
        Stock appleStock = new Stock();
        Stock netflixStock = new Stock(22.5,"NFLX",55000000,34,111);
        appleStock.setTickerSymbol("AAPL");
        appleStock.setSectorId(-22);
//        appleStock.subSectorId = 123;
//        appleStock.marketCap = 2536415;
//        appleStock.currentRatio = 23.5;
        System.out.println(netflixStock);
        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());}}

        /**
         * this will return the double
         * @param d1
         * @param d2
         *
         */





