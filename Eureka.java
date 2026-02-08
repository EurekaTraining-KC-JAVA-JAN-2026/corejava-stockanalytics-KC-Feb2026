public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka!");

        int i;
        i = 10;
        int j = 20;
        System.out.println("Value of i is " + i);
        System.out.println("Value of j is " + j);

        // Flloat

        float f1 = 32.86f;
        float f2 = 16.65f;
        System.out.println("Value of f1 is " + f1);

        floatAddition();
        floadAdd(f1, f2);

        double d1 = 32.86d;
        double d2 = 33.53d;

        System.out.println("multi  of 2 doubles  is " + d1 * d2);

        boolean b1 = true;

        b1 = false;
        System.out.println(" value of boolean b1 is " + b1);

        long l1 = 123456789l;
        long l2 = 123456789l;
        System.out.println("value of long l1 is " + l1 + " and l2 is " + l2);

        //non-primitive

        String str1 = "Eurekaa";
        String str2 = new String("Technologies");

        System.out.println("value of str1 is " + str1 + " and str2 is " + str2);

        System.out.println("Concatenation of s1 and s2 is " + str1 + " " + str2);
    }

    private static void floadAdd(float f1, float f2) {
        System.out.println(f1 + f2);
    }

    public static void floatAddition() {
        float f1 = 32.86f;
        float f2 = 23.49f;
        System.out.println("sum of 2 floats is " + f1 + f2);
    }


}