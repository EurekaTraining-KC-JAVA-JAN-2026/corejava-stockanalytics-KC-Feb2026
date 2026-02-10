public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka...!");
        System.out.println("calling static from here...");
        String a1 = "Eureka";
        a1.contains("E");//Here we calling contains at class level
        StaticPlayGround a2 = new StaticPlayGround();
        StaticPlayGround.move();




        int i;
        i = 10;
        int j = 20;

        //its automatically takes from the Stock.java Files as we constructed the five parameters
        Stock googleStock = new Stock("GOOG", 7656776, 13.4, 32, 144);
        System.out.println(googleStock);
        Stock nvdiaStock = new Stock("NVDA", 87543565, 12.3, 33, 188);

        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("APPL");//setting the ticker symbol
        appleStock.setSectorId(23);
        appleStock.setMarketCap(222333);
        appleStock.setSubSectorId(123);
        appleStock.setCurrentRatio(23.55);
        //accessing the application in appleStock tickerSymbol
        System.out.println(appleStock.getTickerSymbol() + " " + appleStock + appleStock.getSectorId());


        //String s1 = new String(original:"lohith");



        /**
         * This will return the double
         * @param d1
         * @param d2
         * @retuen
         */


        System.out.println("value of i" + i);
        System.out.println("value of j" + j);
        //float
        floatAddition();
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 doubles is " + (d1 * d2));

        /**
         * hashMap
         * key and pair's (key is reference pair is actual value)
         * f11134517053   34.33
         * identityHashCode(f1) to get the reference number
         */
        float f1 = 34.33f;
        System.out.println("Hashcode of f1" + System.identityHashCode(f1));

        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("value of boolean is " + b1);
        //long
        long l1 = 123456;
        long l2 = 654321;
        System.out.println("value of 2 longs is " + l1 + " and " + l2);
        //non-primitive
        String s1 = "Eureka";
        String s2 = new String("tech");
        System.out.println("concatenation of s1 and s2 is " + s1 + " " + s2);


    }

    private static void floatAddition() {
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("sum of 2 floats is " + (f1 + f2));

    }

    //pass by value=

}