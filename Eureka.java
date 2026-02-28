

public class Eureka {
    public static void main(String[] args) {
        // java is pass by value by default
        System.out.println("Welcome to Eureka.....!");
        System.out.println("calling statics from here");

        String s1="Eureka";
        s1.contains("E");
        StaticPlayGround s2= new StaticPlayGround();





        //here im calling contains method on object level
        // primitives
        int a = 45;
        int b = 65;
        float f1 = getAFloat();
        System.out.println(System.identityHashCode(f1)); // Get reference number
        // In memory everything is stored as a hashmap with kv pairs where k is reference no and v is the value

        float f2 = 42.46f;
        float f = floatAddition(f1, f2);
        //System.out.println(f);
        doubleProduct();
        boolean b1 = true;
        b1 = false;

        long l1 = 1634554;
        long l2 = 2453227;
        char c = 'k';
        //System.out.println("Value of char c is " + c);
        //System.out.println("Value of a is " + a);
        //System.out.println("Value of b is " + b);
        // System.out.println("The Boolean value is " + booleanValue());

        // System.out.println("Value of b1 is " + b1);
        //System.out.println("sum of l1 and l2 is " + (l1 + l2));
        floatAddition();
        // non primitives
        String s8 = "Eureka";
        //System.out.println("Value of S1 is " + s1);
        //String s2 = new String("Tech");
        //System.out.println("Value of S2 is " + s2);
        //System.out.println("Concatenation of strings " + s1 + ' ' + s2);

        Stock googleStock = new Stock("GOOGL",1243355,4.89,145,45);
        Stock nvdiaStock  = new Stock();
        Stock nflxStock  =  new Stock("NFLX",12132433,4.65);
        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL");
        appleStock.setSectorId(23);
        appleStock.setMarketCap(23456756);
        appleStock.setSubsectorId(123);
        appleStock.setCurrentRatio(23.54);
        System.out.println(googleStock);
        System.out.println(appleStock.getTickerSymbol() + " " + appleStock.getSectorId());
    }

    private static float getAFloat() {
        float f1 = 94.35f;
        return f1;
    }

    private static void doubleProduct() {
        double d1 = 114.85;
        double d2 = 92.16;
        //System.out.println("Product of d1 and d2 is " + (d1 * d2));
    }
    private static boolean booleanValue() {

        return true;
    }
    // method overloading
    private static float floatAddition(float f1, float f2) {
        return f1 + f2;
    }

    private static void floatAddition() { // method signature

        //System.out.println(" Addition of f1 and f2 is ");
    }
}
/**
 * Documentation- click /**
 *
 *
 *
 *
 *
 */

// comments - click //