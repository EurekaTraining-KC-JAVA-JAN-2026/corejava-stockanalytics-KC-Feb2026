public class Eureka {
    public static void main(String[] args) {
        System.out.println("Eureka Java Training :(");
        //primitive
        int i;
        i = 10; //assigning
        int j = 20;
        System.out.println("Value of i :" + i);
        System.out.println("Value of j :" + j);
        //float

        float f1 = 13.21f;
        float f2 = 26.12f;
        System.out.println("Parameterized method");
        float v = floatAdd(f1, f2);
        System.out.println(v);

        floatAdd(f1, f2); //calling  method
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi is " + doubleAddition(d1, d2));
        double d = doubleAddition(12.01, 12.01);
        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("Value of boolean is" + b1);
        //long
        long l1 = 12367842;
        long l2 = 24938341;
        System.out.println(("Value is" + l1 + " and " + l2));
        char c1 = 'V';
        //non-primitive types
        String s1 = "Eureka";
        String s2 = new String("Tech");
        System.out.println("concat of is " + s1 + " " + s2);
        booleanType();

        Stock appleStock = new Stock();
        appleStock.tickerSymbol = "AAPL";
        appleStock.sectorId = 23;
        appleStock.marketCap = 2354362;
        appleStock.subSectorID = 123;
        appleStock.currentRatio = 23.65;
        System.out.println(appleStock.tickerSymbol + " " + appleStock.sectorId);

        // with parameterized constructor
        Stock googleStock = new Stock("GOOG", 45, 9876543L, 321, 19.87);
        System.out.println(googleStock.tickerSymbol + " " + googleStock.sectorId);

        Stock JMPCStock = new Stock("JPMC", 67, 763722L, 212, 15.45);
        System.out.println(JMPCStock.tickerSymbol + " " + JMPCStock.sectorId);


        float f6 = 34.22f;
        System.out.println("Value of f1: " + f1);
        System.out.println("HashCode of f1: " + System.identityHashCode(f1));

        // example of pass-by-value
        int x = 20;
        updateValue(x);
        System.out.println("After updateValue(x): " + x); // remains 20

        // example of pass-by-value for objects (reference copied)
        updateStock(googleStock);
        System.out.println("After updateStock(googleStock): " + googleStock);

    }
    private static void updateValue(int a) {
        a = 40;
    }

    private static void updateStock(Stock s) {
        s.setTickerSymbol("TSLA");
    }

    private static double doubleAddition ( double d1,double d2) {
        return d1 * d2;
    }

    private static float floatAdd(float f1,float f2){
        return f1+f2;
    }
    //class name => Eureka
    //variable=.StringName
    //method => floatAddition
//    private static void floatAdd() { //method signature
//        float f1 = 34.22f;
//        float f2 = 22.34f;
//
//        System.out.println("Sum of 2 floats is " + (f1 + f2));
//    }

    private static void doubleAddition(int a, int b) {
        System.out.println("Sum of two integers is " + (a + b));
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }
}

