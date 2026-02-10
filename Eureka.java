public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka...");
        System.out.println("calling statics from here");
        String s1= "Eureka";
        s1.contains("E");
        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();




        int i; //declare
        i=20;//assign
        int j =20;
        System.out.println("value of i" +  i);
        Stock googleStock = new Stock();


        Stock appleStock = new Stock();


        appleStock.setTickerSymbol("AAPL");
        appleStock.setSectorId(23);
        appleStock.setMarketCap(23345362);
        appleStock.setSubSectorId(123);
        appleStock.setCurrentRatio(23.65);

        System.out.println(appleStock.getTickerSymbol()+ ""+appleStock.sectorId);


        //double//
        //boolean//
        //long//
        //use camelCasefor methods
        //methodOverloading-Same method name but differentParameters
    //
         /*
        class will have properties

          */
//
            float f1= 34.22f;
    }
}
