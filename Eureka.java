public class Eureka {
    public static void main(String[] args) {
        System.out.println("welcome to Eureka..!");
        String s1="lakshmi Narayana";
        s1.contains("r");

        StaticPlayGround s2 = new StaticPlayGround();
        StaticPlayGround.move();

        // ========== datatypes =========

        //------ int

        int i = 3;
        int k;
        k = 10;
        System.out.println(" value of i " + i);
        System.out.println(k);

        // Using default constructor + setters
        Day2 obj1 = new Day2();
        obj1.setTickerSymbol("AAPL");
        obj1.setMarketCap(5000000000L);
        obj1.setCurrentRatio(1.25);
        obj1.setSectorId(10);
        obj1.setSubsectorId(5);

        System.out.println("=== Using Default Constructor ===");
        System.out.println(obj1.getTickerSymbol());
        System.out.println(obj1.getMarketCap());
        System.out.println(obj1.getCurrentRatio());
        System.out.println(obj1.getSectorId());
        System.out.println(obj1.getSubsectorId());

        // Using parameterized constructor
        Day2 obj2 = new Day2("MSFT", 8000000000L, 2.15, 20, 8);

        System.out.println("\n=== Using Parameterized Constructor ===");
        System.out.println(obj2.getTickerSymbol());
        System.out.println(obj2.getMarketCap());
        System.out.println(obj2.getCurrentRatio());
        System.out.println(obj2.getSectorId());
        System.out.println(obj2.getSubsectorId());
        //----- float
        float f1 = 33.43f;
        float f2 = 44.2f;
        System.out.println(f1);
        System.out.println("sum of f1 and f2 is " + (f1 + f2));


        // -------- double

        double d1 = 1.4;
        double d2 = 40.3;
        System.out.println("mul of d1 and d2 is " + (d1 * d2));

        //----- boolean
        boolean b1 = true;
        b1 = false;
        System.out.println(b1);


        //------- long
        longtype();
        long l6 = longtype(54, 87);
        System.out.println(l6);
        // non primitive

//        String s1 = "hare";
//        String s2 = "krishna radhe radhe";
//        System.out.println(s1 + " " + s2);
//

    }


    private static long longtype(long l1, long l2) {
        return l1 + l2;
    }


    private static void longtype() {
        long l1 = 134778738;
        long l2 = 785271;
        System.out.println(l1 + " and " + l2);

        // pass by value
        // java will not pass the value directly t the other methods it only stores the copy value of it

        int x= 20;
        System.out.println(System.identityHashCode(x));
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        System.out.println(System.identityHashCode(a));
        a=40;
        System.out.println(a);

    }


}

