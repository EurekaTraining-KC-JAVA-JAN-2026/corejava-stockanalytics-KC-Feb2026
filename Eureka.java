public class Eureka {
    public static void main(String[] args) {
        System.out.println("welcome Eureka");
        int i;
        i = 10;
        int j = 20;
        System.out.println("value of i" + i);
        System.out.println("value of j" + j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("output from paamterized  method");
        float v = floatvalue(f1, f2);
        System.out.println(v);

        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 doubles is " + (d1 + d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("values of boolean is" + b1);
        //long
        long l1 = 123456754;
        long l2 = 1786543213;
        System.out.println("value of 2 longs is" + l1 + " and " + l2);
        //non-primitive
        String s1 = "Eureka";
        String s2 = new String("tech");
        System.out.println("concatination of s1 and s2 is " + s1 + " " + s2);

    }

    private static float floatvalue(float f1, float f2) {
        return f1 + f2;
        //System.out.println("sum of 2 floats is "+(f1 + f2));
    }

    private static float floatvalue() {
        System.out.println("sum of two floats");
        return 0;
    }

    private static void booleanType() {

    }

}
