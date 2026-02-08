public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka....!");
        //primitive
        int i; //declaring
        i = 10; //assigning
        int j = 20;
        System.out.println("Value of i " + i);
        System.out.println("Value of j " + j);
        //float (with example of method overloading:Same method name but diff implementations)
        floatAddition();
        float f1 = 34.22f;
        float f2 = 22.34f;
        float v = floatAddition(f1, f2);
        System.out.println("Output from parameterized method " + v);
        //double
        double d1 = 12.32;
        double d2 = 34.12;
        System.out.println("Multiplication of 2 doubles is " + doubleMulti(d1, d2));
        //boolean
        boolean b1 = true;
        b1 = false;  //reinitialization
        System.out.println("Value of boolean is " + b1);
        booleanType();
        //long
        long l1 = 1234656572;
        long l2 = 325656834;
        System.out.println("Value of longs is " + l1 + " and " + l2);
        //char
        char c1 = 'S';
        //non-primitive
        String s1 = "Eureka";
        String s2 = new String("Tech");
        System.out.println("Concatenation of s1 and s2 is " + s1 + " " + s2);
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }


    private static double doubleMulti(double d1, double d2) {
        return d1 * d2;
    }

    //Method overloading and return type method
    private static float floatAddition(float f1, float f2) {
        return f1 + f2;
    }

    //class name = Eureka
    //variale =>stringName
    //methods =>floatAddition
    private static void floatAddition() { //method signature
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("Sum of 2 floats without parameters is " + (f1 + f2));
    }
}