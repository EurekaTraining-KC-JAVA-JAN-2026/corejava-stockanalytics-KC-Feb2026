// if its text editor then we need to import java

public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka.....!");
        //primitives:-
        int i;//declaring
        i = 10;//assigning
        int j = 20;

//class objname = new classname(parameters)
        Stock abnbStock = new Stock("ABNB",34567,45.66,54,34);
        //from to string we re getting this
        System.out.println(abnbStock);

        System.out.println(abnbStock.getTickerSymbol()+" "+abnbStock.getMarketCap());
        Stock googleStock = new Stock();

        Stock appleStock = new Stock();// no prameters so we need to set by using setters
        appleStock.setTickerSymbol("AApl");
        appleStock.setSectorId(-23);
        appleStock.subSectorId = 123;
        appleStock.setCurrentRatio(23.65);
        appleStock.setMarketCap(234456);
        //accessing
        System.out.println(appleStock.getTickerSymbol() + " "+ appleStock.getSectorId());

        /*

         */


        System.out.println("value of i" + i);
        System.out.println("value of j" + j);
        //float
        float f1 = 34.22f;//always end float with f
        /**
         *hashmap
         * key and pairs
         * 2345674 34.22
         */
        float f2 = 22.34f;
        System.out.println("Hashcode of number is " +System.identityHashCode(f1));
        floatAdd(f1, f2);
        floatAdd();

        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 double is " + (d1 * d2));
        //boolean
        boolean b1 = true;
        b1 = false;// reassigning  value as it comes from up to down
        System.out.println("value of boolean is " + b1);
        //long
        long l1 = 12343242;
        long l2 = 32454321;
        System.out.println("value of 2 long is " + l1 + " and " + l2);
        //char 
        char c1 = 'J';
        //non-primitive
        String s1 = "Eureka";
        String s2 = new String("Tech");//string is class and string will have own objects
        System.out.println("concatenation of s1 and s2 is " + s1 + " " + s2);
        booleanType();
        ;


    }

    /**
     *
     * @param f1
     * @param f2
     */
    //method overloading same method name and diff parameters
    private static void floatAdd(float f1, float f2) {
        System.out.println(f1 + f2);
    }

    // it does nothing
    private static void floatAdd() {//method signature
        float f1 = 34.22f;//always end float with f
        float f2 = 22.34f;
        System.out.println("sum of 2 floats is " + (f1 + f2));//string concatination adding
    }

    private static void booleanType() {
        System.out.println("Boolean method");//we cannot see this because method nor called
    }
    // pass by value =>default java is a pass by value
    /**
     * to value some value from hock to moveforward
     */





}
