public class Eureka {
    public static void main(String[] j) {
        System.out.println("Welcome Eureka....!");
        System.out.println("calling statics from here...");
        String s1 = "Eureka";
        s1.contains("E");//here im calling contains method on object level of s1
        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();

        //primitive
        int i; //declaring
        i = 10;//assiging
        //int j = 20;
        //here we are using an paramterzed
        Stock googleStock = new Stock("GOOG",22323232,2.2,132,17);
        Stock nvidaStock = new Stock();
        //printing
        System.out.println(googleStock);

        Stock kmpcStokc = new Stock("JPMC",2323423,3.4,23,342);
       Stock appleStock = new Stock();//created using the deafult
       appleStock.setTickerSymbol("APPL");//setting the ticker symbol
       appleStock.setSectorId(-23);
       appleStock.setMarketCap(234234);
       appleStock.setSubSectorID(231);
       appleStock.setCurrentRatio(23.45);
        //accessing the appleStokc tickerSymbol
       // System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());

//        System.out.println("Value of i "+i);
//        System.out.println("Value of j "+j);
        //float
        float f1 = 34.22f;
        /**
         * hashMap
         * key and pair's
         * 933699219   34.22
         */

       // System.out.println("HashCode of f1 " +System.identityHashCode(f1));
        float f2 = 22.34f;
       // System.out.println("Output from paramterized method ");
      //  float v = floatAdd(f1, f2);
       // System.out.println(v);
        //
//
        /*
        fnekjvn
        njvn
         */


       // floatAdd();//calling method
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        //System.out.println("multi of 2 doubles is " + doubleAddition(d1, d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        //System.out.println("Value of boolean is "+b1);
        //long
        long l1 = 123432445;
        long l2 = 32432453;
        //        System.out.println("Value of 2 longs is "+l1+" and "+l2);
        char c1 = 'J';
        //non-primitive
//        String s1 = "Eureka";
//        String s2 = new String("Tech");
//        System.out.println("Concatenation of s1 and s2 is "+s1+" "+s2);
       // booleanType();
    }

    /**
     * This will return the double
     * @param d1
     * @param d2
     * @return
     */
    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }
    //method overloading
    //same method name diff parameters

    private static float floatAdd(float f1, float f2) {
        return f1 + f2;
    }

    //class name =>Eureka
    //variable =>stringName
    //methods => floatAddition
    private static void floatAdd() {//method signature

      //  System.out.println("Sum of 2 floats from method with out parameters");
    }

    private static void booleanType() {
       // System.out.println("Boolean method");
    }

//    pass by value=>by default java is pass by value




}
