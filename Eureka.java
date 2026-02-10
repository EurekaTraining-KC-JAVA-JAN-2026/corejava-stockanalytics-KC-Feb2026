public class Eureka {
    public static void main(String[] args) {
        System.out.println("welcome Eureka...!");
        //primitive
        int i;//declaring
        i = 10; //assigning
        int j = 20;

        Stock googlestock = new Stock();
        Stock nvidiastock = new Stock();
        Stock googlestock2 = new Stock();
        Stock nvidiastock2 = new Stock();

        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("APPL");//seting
        appleStock.sectorId = 23;
        appleStock.marketCap = 23345362;
        appleStock.subSectorID = 123;
        appleStock.currentRatio = 23.65;
        //accesing applestock tickersymbol
        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.sectorId);

        /**
        * hashmap
         * key and pairs
         */
        float f1 = 34.45f;
        System.out.println(System.identityHashCode(f1));


        // pass by value=> by default java pass by value



    }
}