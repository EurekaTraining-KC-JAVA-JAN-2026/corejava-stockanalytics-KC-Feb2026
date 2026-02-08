public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka....!");
        //primitive
        int i; //declaring
        i = 10;//assiging
        int j = 20;
//        System.out.println("Value of i "+i);
//        System.out.println("Value of j "+j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("Output from paramterized method ");
        float v = floatAdd(f1, f2);
        System.out.println(v);

        floatAdd();//calling method
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi of 2 doubles is " + doubleAddition(d1, d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        //System.out.println("Value of boolean is "+b1);
        //long
        long l1 = 123432445;
        long l2 = 32432453;
//        System.out.println("Value of 2 longs is "+l1+" and "+l2);
        char c1 = 'J';
        //non-primitive
        String s1 = "Eureka";
        String s2 = new String("Tech");
//        System.out.println("Concatenation of s1 and s2 is "+s1+" "+s2);
        booleanType();
    }

    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }
    //method overloading
    //same method name diff parameters

    private static float floatAdd(float f1, float f2) {
        return f1 + f2;
    }

    //class name =>Eureka
    //variable =>stringName
    //methods => floatAddition
    private static void floatAdd() {//method signature

        System.out.println("Sum of 2 floats from method with out parameters");
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }
}
