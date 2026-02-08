// variables and functions in camel case -> helloThere
// class - start with caps
public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka.....!");
        // primitives
        int a = 45;
        int b = 65;
        float f1 = 94.35f;
        float f2 = 42.46f;
        float f = floatAddition(f1, f2);
        System.out.println(f);
        doubleProduct();
        boolean b1 = true;
        b1 = false;

        long l1 = 1634554;
        long l2 = 2453227;
        char c = 'k';
        System.out.println("Value of char c is " + c);
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        System.out.println("The Boolean value is " + booleanValue());

        System.out.println("Value of b1 is " + b1);
        System.out.println("sum of l1 and l2 is " + (l1 + l2));
        floatAddition();
        // non primitives
        String s1 = "Eureka";
        System.out.println("Value of S1 is " + s1);
        String s2 = new String("Tech");
        System.out.println("Value of S2 is " + s2);
        System.out.println("Concatenation of strings " + s1 + ' ' + s2);

    }
    private static void doubleProduct() {
        double d1 = 114.85;
        double d2 = 92.16;
        System.out.println("Product of d1 and d2 is " + (d1 * d2));
    }
    private static boolean booleanValue() {

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
