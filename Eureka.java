public class Eureka {
    public static void main(String[] args){
        //System.out.println("Welcome to Eureka...!");
        //primitive
        int i; //declaring
        i=10;//assigning
        int j=20;
        //here we are using a parameterized
        Stock googleStock = new Stock("GOOG",24,23456765,132,17);
        Stock jpmcStock = new Stock("JPM",23,234675432,442,18);
        Stock nvdiaStock = new Stock("NVD",26,2398765);
        System.out.println(nvdiaStock);
        //String s1 = new String( :Ramya)
        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL");
        //appleStock.tickerSymbol = "AAPL";
        appleStock.setSectorId(-23);
        appleStock.setMarketCap(2345676);
        appleStock.setSubsectorId(123);
        appleStock.setCurrentRatio(11.11);

        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());



        //System.out.println("Value of i "+i);
        //System.out.println("Value of j "+j);
        //float
        float f1 = 34.12f;
        /**
         * hashMap
         * key and pairs
         * f1 key=1896277646 pair =34.12
         */
        System.out.println("Hashcode of f1:"+System.identityHashCode(f1));
        float f2 = 44.44f;
        //System.out.println("Output from parameterized method");
        float v = floatAdd(f1, f2);
        //System.out.println(v);
        floatAdd();
        //double
        double d1 = 11.11;
        double d2 = 22.22;
        //System.out.println("Multiplication of 2 doubles "+doubleAddition(d1,d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        //System.out.println("Value of boolean is "+b1);
        //long
        long l1 = 23456786;
        long l2 = 67854323;
        //System.out.println("Value of 2 longs is " +l1+ " and " +l2);
        //non-primitive
        char c1 = 'j';
        String s1 = "Eureka";
        String s2 = new String("Tech");
        //System.out.println("Concatenation of s1 and s2"+s1+" "+s2);
        booleanType();

    }

    /**
     *
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
        //System.out.println(f1+f2);
        return f1 + f2;
    }

    //class name = Eureka
    //variable = stringName
    //methods = floatAddition
    private static void floatAdd() {//method signature

        //System.out.println("Sum of two floats from method without parameters");
    }
    private static void booleanType(){
        //System.out.println("Boolean method");
    }

    //by default java is pass by value

}
