public class Eureka {
    static void main(String[] args) {  // it is a array of strings
       // System.out.println("welcome to Eureka...!");
        // primitives

        //1.int
        int i; // declaring
        i=10; // assigning
        int j=20;



        //
        System.out.println("calling statics from here");
        String s1="eureka";
        s1.contains("E");    //here
        StaticPlayGround s2 =new StaticPlayGround();


// -------------------------------------------------------------------------------------------

        //2 type
        // it will take our constructor with the parameters
        Stock googleStock = new Stock("GOOG",233322,23.6,31,125);

        // 1 type
        // it will take our constructor with No parameters

        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL");  // setting the ticker symbol
        appleStock.setSectorId(30);
        appleStock.setMarketCap(23334552);
        appleStock.setSubSectorId(123);
        appleStock.setCurrentRatio(23.65);

// accessing the apple stock tickersymbol
        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());



        Stock nvidia = new Stock("NVDA",455363,32.6,24,342);
        System.out.println(nvidia.getTickerSymbol()+" "+nvidia.getSectorId());


        Stock tayota= new Stock("TAYO");
        System.out.println(tayota.getTickerSymbol());
        Stock honda=new Stock("HNDA",244325,3.4,5,124);

        // so to print everything

        System.out.println(honda);

        // to get the hashmap or ref we use  System.identityHashCode(f1)
        // to get the what is the value for ref will be override and use toString by right clicking and hit generate button and toString


// pass by value => by default java is pass by value



        //---------------------------------------------------------------------------------------------------------
     //   System.out.println("value of i "+i);
    //    System.out.println("value of j "+j);

        //2.float
        float f1= 34.22f;
        float f2= 22.34f;
    // System.out.println("sum of 2 floats is "+(f1+f2));
        System.out.println("Hash code of f1 is "+System.identityHashCode(f1));


        // double
        doubleMul();
        doubleMul( 12.34,34.12);
   //    System.out.println(doubleMul2( 322.34,34.12));

        //boolean
        boolean b1= true;
        b1 = false;
   //     System.out.println("value of boolean is"+b1);

        //long
        long l1= 123456787;
        long l2= 7654321;
    //    System.out.println("value of 2 longs is "+l1+"add"+l2);


        //non-primitives

        //strings
        //1
        String s1= "Eureka";
        String s2= new String("Tech");
    //    System.out.println(("concat of two strings is "+s1+" "+s2));

    }
//comments
    //
     /*

      */

    // and for documentation

    /**
     *
     */
    private static void doubleMul() { // a method not using return is called method signature
        double d1= 12.34;
        double d2= 34.12;
    //    System.out.println("mul of 2 doubles is "+(d1*d2));
    }
    // class name => Eureka
    // variable => stringName
    // methods => floatAddition


    // method overloading
    // same method but using diff parameters like one paramter for one and two for other
    private static void doubleMul(double d1,double d2) { // a method not using return is called method signature
    //    System.out.println("mul of 2 doubles is "+(d1*d2));
    }
    private static double doubleMul2(double d1,double d2) { // a method not using return is called method signature
        return(d1*d2);
    }




}
