public class Eureka {

    public static void main(String[] args) {

        System.out.println("welcome Eureka");

        int i = 10;
        int j = 20;
        System.out.println("value of i" + i);
        System.out.println("value of j" + j);

        float f1 = 34.22f;
        //System.out.println("hashcode of f1", System.identityHashCode(f1));
        float f2 = 22.34f;
        System.out.println("output from paamterized  method");
        float v = floatvalue(f1, f2);
        System.out.println(v);

        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 doubles is " + (d1 + d2));

        boolean b1 = true;
        b1 = false;
        System.out.println("values of boolean is" + b1);

        long l1 = 123456754;
        long l2 = 1786543213;
        System.out.println("value of 2 longs is" + l1 + " and " + l2);

        String s1 = "Eureka";
        String s2 = new String("tech");
        System.out.println("concatination of s1 and s2 is " + s1 + " " + s2);
          stocks googleStock = new stocks("6006", 22323232, 23.64, 23, 123);
        stocks nvidastock2=new stocks("nvda",234262543,2.2,23,123);
        System.out.println();
        stocks applestock = new stocks();
        applestock.setTickersymbol("AAPL");
        applestock.marketcap = 23435623;
        applestock.subsectorid = 123;
        applestock.currentratio = 23.65;
        applestock.sectorid = 23;
    }

    private static float floatvalue(float f1, float f2) {
        return f1 + f2;
    }

    private static float floatvalue() {
        System.out.println("sum of two floats");
        return 0;
    }

    private static void booleanType() {
    }
    
}
