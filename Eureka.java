public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka....!");
        //primitive
        int i; //declaring
        i = 10; //assigning
        int j = 20;
        System.out.println("value of i " + i);
        System.out.println("value of j " + j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        float v = floatAddition(f1, f2);
        System.out.println(v);
        floatAddition();//calling method
        // double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 doubles " + doubleAddition(d1, d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("value of boolean is " + b1);
        booleanType();
        //long
        long l1 = 12342345;
        long l2 = 34678621;
        System.out.println("value of of longs is " + l1 + " and " + l2);
        //Char
        char c1 = 'J';
        System.out.println("Character is " + c1);
        //Non-primitive
        String s1 = "Eureka";
        String s2 = new String("Tech");
        System.out.println("Concatenation of s1 and s2 is " + s1 + " " + s2);
    }

    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }

    //method overloading
    //same method different parameters
    private static float floatAddition(float f1, float f2) {
        return (f1 + f2);
    }

    //class name => Eureka
    //variable => stringName
    //methods=> floatAddition
    private static void floatAddition() {//method signature
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("sum of 2 floats is " + (f1 + f2));
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }
}
