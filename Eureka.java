public class Eureka {
    public static void main(String[] args) {
        System.out.println(("Welcome Eureka.....!"));
        int i;
        i = 10;
        int j = 20;
        System.out.println("value of i: " + i);
        System.out.println("value of j: " + j);
        float f1 = 34.22f;
        float f2 = 22.34f;
        floatAddition(f1,f2);

        doubleMultiplication();

        booleanFunc();

        long l1 = 123454;
        long l2 = 3665464;
        System.out.println("value of 2 longs: " + (l1 + l2));

        String s1 = "Eureka";
        String s2 = new String("tech");
        System.out.println("Concat of 2 strings is "+s1 + " " + s2);


    }

    private static float floatAddition(float f1,float f2) {
//        float f1 = 34.22f;
//        float f2 = 22.34f;
        return f1+f2;
    }

    private static void doubleMultiplication() {
//        double d1 = 12.34;
//        double d2 = 34.12;
//        System.out.println("multiplication of 2 doubles is: " + (d1 * d2));
    }

    private static void booleanFunc() {
//        boolean b1 = true;
//        b1 = false;
//        System.out.println("value of b1: " + b1);
    }
}
