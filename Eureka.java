public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka....!");
        System.out.println("Calling Statics from here....");
        String s1 = "Eureka";
        s1.contains("E");                  // Here i am calling method on object level of s1
        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();


        // Primitive Data type
        // Data_Type Name = value;
        int i; i = 10; // Declaring and Assigning
        int j; j = 20;

        // Here we are using an parameterzed
        Stock googleStock = new Stock();
        Stock nvidaStock = new Stock();
        Stock googleStock2 = new Stock();
        Stock nvidaStock2 = new Stock();
        Stock googleStock3 = new Stock("GGL",32,24,25.22,2522);
        System.out.println(googleStock3);


        Stock appleStock = new Stock();
        appleStock.setTickerSymbol("AAPL"); // Setting the ticker symbol
        appleStock.setSectorId(-23);
        appleStock.setSubSectorId(123);
        appleStock.setMarketCap(23345362);
        appleStock.setCurrentRatio(25.51);
        // accessing the appleStock ticker symbol
        System.out.println(appleStock.getTickerSymbol()+" "+appleStock.getSectorId());

        // Comments

        // 1) Single line comments

        /*
           2) Multiple line stocks
        */





        System.out.println("Value of i : " +i );
        System.out.println("Value of j : " +j);

        // Float
        // floatAdd(); // Calling the method

        // Double
        double d1 = 34.22d;
        double d2 = 25.52d;
        System.out.println("Sum of d1 and d2 is : "+(d1+d2));

        // Boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("value of b1 is : "+b1);

        // Long
        long l1 = 12343242;
        long l2 = 32432453;
        System.out.println("Sum of l1 and l2 is : "+(l1+l2));

//        // Non-primitive Data Type
//        String s1 = "Eureka";
//        String s2 = new String("Tech");
//        System.out.println("Concatenation of s1 and s2 is : " +s1+ " " +s2);
//    }
//
//
//
//
//    // class name =>Eureka
//    // variable =>stringName
//    // methods => floatAddition
//    private static void floatAdd() {   // method signature
//        float f1 = 34.22f;
//        float f2 = 25.51f;
//        System.out.println("Sum of f1 and f2 is : "+(f1+f2));
//    }
//
//    private static void booleanType(){
//        System.out.println("Boolean method");
    }



}
