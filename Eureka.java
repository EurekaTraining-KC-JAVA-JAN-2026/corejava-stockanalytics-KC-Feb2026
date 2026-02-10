public class Eureka {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka");
        System.out.println("Calling statics from here");
        String s1 = "Eureka";
        s1.concat("E");
        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();
        //primitive
        int i;//declaring
        i = 10;//assigning
        int j = 20;
        //System.out.println("Value of i :" + i + " Value of j :" + j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        extracted(f1, f2);//calling the method
        float f3 = extracted(); // saving the return in new variable
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("Hashcode of :"+System.identityHashCode(d1));
        //System.out.println("Multi of two doubles " + (d1 * d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        //System.out.println("Value of boolean is :" + b1);
        //long
        long l1 = 1234556677;
        long l2 = 11234565434567776L;
        //char
        char ch = 'J';
        //System.out.println("character is :" + ch);
        //NON-PRIMITIVE
        String str = "Eureka";
        // String str2 = new String("Tech");
        //System.out.println("Concatenation of str1 and str2 is " + str + " " + str2);
        Stock googleStock = new Stock("GOOG",32,233454,321,56);
        Stock teslaStock = new Stock("TSLA",42,233456,323,50);
        Stock nvidiaStock = new Stock("NVDA",233456666,55.57);
        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL");
        appleStock.setSectorId(23);
        appleStock.setMarketCap(23345363);
        appleStock.setSubSectorId(123);
        appleStock.setCurrentRatio(23.65);

        System.out.println(appleStock.getTickerSymbol()+" "+ appleStock.getMarketCap());


    }

    //method overloading - same method name different parameters
    private static float extracted() {//method overloading
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("Sum of two floats is :" + (f1 + f2));
        return (f1 + f2);
    }


    private static void extracted(float f1, float f2) {
        System.out.println("Sum of two floats is :" + (f1 + f2));
    }
}
