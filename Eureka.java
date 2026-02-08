// variables and functions in camel case -> helloThere
// class - start with caps
// variables and functions in camel case -> helloThere
// class - start with caps
public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka");
        int a = 15;
        int b = 25;
        float f1 = 34.25f;
        float f2 = 22.46f;
        float f = floatAddition(f1, f2);
        System.out.println(f);
        doubleProduct();
        boolean b1 = true;
        b1 = false;

        long l1 = 1234554;
        long l2 = 24534524;
        char c = 't';
        System.out.println("Value of char c is " + c);
        System.out.println("Value of i is " + a);
        System.out.println("Value of j is " + b);
        boolean bool = booleanType();
        System.out.println("Boolean value is " + bool);

        System.out.println("Value of b1 is " + b1);
        System.out.println("sum of l1 and l2 is " + (l1 + l2));
        floatAddition();
        // non primitive
        String s1 = "Eureka";
        System.out.println("Value of S1 is " + s1);
        String s2 = new String("Tech");
        System.out.println("Value of S2 is " + s2);
        System.out.println("Concatenation of strings " + s1 + ' ' + s2);

    }
    private static void doubleProduct() {
        double d1 = 94.85;
        double d2 = 52.16;
        System.out.println("Product of d1 and d2 is " + (d1 * d2));
    }
    private static boolean booleanType() {
        System.out.println("Print");
        return true;
    }
    // method overloading
    private static float floatAddition(float f1, float f2) {
        return f1 + f2;
    }

    private static void floatAddition() { // method signature

        System.out.println(" Addition of f1 and f2 is ");
    }




}