public class Eureka {
    public static void main(String[] args) {
        //System.out.println("Welcome Eureka!");
        //primitives
        //1. int
        intAddition();
        //2.float
        float f1 = 23.45f;
        float f2 = 12.15f;
        //System.out.println("sum of 2 floats is : " + (f1 + f2));

        //3.double
        double d1 = 12.36;
        double d2 = 9.80;
        addingDoubleNumbers(d1, d2);

        //4. boolean
        boolean b1 = true;
        boolean b2 = false;
        //System.out.println("types of boolean :" + b1);
        //System.out.println("types of boolean :" + b2);

        //5. Long
        long l1 = 22L;
        long l2 = 23L;
        //System.out.println(l1 + l2);

        //6. Char
        char c1 = 'V';
        char c2 = 'N';
       // System.out.println(c1 + c2);

        //non-primitives

        //1. String
        String name = "Vishwanath";
        String s1 = new String("ABC");
        System.out.println(name + " " + s1);

        Stock stock = new Stock();
        stock.setTickerSymbol("AAPL");
        stock.setSectorId(12);
        stock.setSubsectorId(200);

        System.out.println(stock.getTickerSymbol() + " " + stock.getSectorId());

        Stock newStock = new Stock("AAPL", 23, 345672, "22.3", 12);
        System.out.println(newStock);

    }

    private static double addingDoubleNumbers(double d1, double d2) {
        //System.out.println("multi of d1 and d2 is : " + (d1 * d2));
        return d1 + d2;
    }

    private static void intAddition() {
        int i;
        i = 2;
        int j = 23;
        //System.out.println("value of I is : " + i);
        //System.out.println("Value of J is : " + j);
    }

}
