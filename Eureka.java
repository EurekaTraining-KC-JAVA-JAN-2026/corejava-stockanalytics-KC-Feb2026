// variables and functions in camel case -> helloThere
// class - start with caps
public class Eureka {
    public static void main(String[] args) {

        System.out.println("Welcome to Eureka.....!");
        System.out.println("Calling statics from here...");
        String s1 = "Eureka";
        s1.contains("E");//here in calling cointains method on object
        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();


        // primitives
        // int a = 45;
//        int b = 65;
        float f1 = 94.35f;
        System.out.println("HashCode of f1 " + System.identityHashCode(f1));
        float f2 = 42.46f;
//        float f = floatAddition(f1, f2);
//        System.out.println(f);
//        doubleProduct();
//        boolean b1 = true;
//        b1 = false;

//        long l1 = 1634554;
//        long l2 = 2453227;
//        char c = 'k';
        //System.out.println("Value of char c is " + c);
        //System.out.println("Value of a is " + a);
        //System.out.println("Value of b is " + b);
        // System.out.println("The Boolean value is " + booleanValue());

        // System.out.println("Value of b1 is " + b1);
        //System.out.println("sum of l1 and l2 is " + (l1 + l2));
        // floatAddition();
        // non primitives
//String s1 = "Eureka";
        //System.out.println("Value of S1 is " + s1);
        //String s2 = new String("Tech");
        //System.out.println("Value of S2 is " + s2);
        //System.out.println("Concatenation of strings " + s1 + ' ' + s2);
        Stock kmpcStocks = new Stock("JPMC", 2345667, 23.56, 43, 123);
        Stock googleStock = new Stock("GOOGL", 2344567, 23.56, 43, 123);
        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL");//setting the ticker symbol
        appleStock.setSectorId(23);
        appleStock.setMarketCap(23456756);
        appleStock.setSubSectorId(123);
        appleStock.setCurrentRatio(23.54);
//accesing the applestock tickerSymbol
        System.out.println(appleStock.getTickerSymbol() + " " + appleStock.getSectorId());
        System.out.println(googleStock);
    }
}

/**
//hashmap
//key and pairs
*/