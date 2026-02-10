public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka....!");
        //primitive
        int i; //declaring
        i = 10; //assigning
        int j = 20;
       // System.out.println("value of i " + i);
       // System.out.println("value of j " + j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        /**
         * hashMAp
         * key          and      pair's
         * 1791741888            34.22
         */

        System.out.println(("HashCode of f1: "+System.identityHashCode(f1)));
        float v = floatAddition(f1, f2);
        //System.out.println(v);
        floatAddition();//calling method
        // double
        double d1 = 12.34;
        double d2 = 34.12;
       // System.out.println("multi of 2 doubles " + doubleAddition(d1, d2));
        //boolean
        boolean b1 = true;
        b1 = false;
       // System.out.println("value of boolean is " + b1);
       // booleanType();
        //long
        long l1 = 12342345;
        long l2 = 34678621;
        //System.out.println("value of of longs is " + l1 + " and " + l2);
        //Char
        char c1 = 'J';
        //System.out.println("Character is " + c1);
        //Non-primitive
        String s1 = "Eureka";
        String s2 = new String("Tech");
        //System.out.println("Concatenation of s1 and s2 is " + s1 + " " + s2);


        Stock googleStock =new Stock("GOOG",23146587,54.36,14,132);
        Stock nvideaStock = new Stock();
        Stock jpmcStock = new Stock("JPMC",23561589,65.21,26,145);

        Stock appleStock = new Stock();//created using the default
        appleStock.setTickerSymbol("APPL");//setting ticker symbol
        appleStock.setSectorId(23);
        appleStock.setMarketCap(23345362);
        appleStock.setSubSectorID(123);
        appleStock.setCurrentRatio(23.65);
        System.out.println(appleStock);

        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());
        System.out.println("calling statics from here..");
        String s4="Eureka";
        s1.contains("E");
        StaticPlayGround s5 = new StaticPlayGround();
        StaticPlayGround.move();



    }

    /**
     * This will return double
     * @param d1
     * @param d2
     * @return
     */
    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }

    //method overloading
    //same method different parameters
    private static float floatAddition(float f1, float f2) {
        return (f1 + f2);
    }

    //class name => Eureka
    //variable => stringName
    //methods=> floatAddition
    private static void floatAddition() {//method signature
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("sum of 2 floats is " + (f1 + f2));
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }

    // pass by value=> by default java is pass by value







}
