public class Eureka {
    public static void main(String[] args){
        System.out.println("Welcome Eureka...!");
       //primitive
        int i; //declaration
        i = 10; //assigning
        int j = 20;
        System.out.println("Value of i" +i);
        System.out.println("Value of j" +j);
        //float
        float f1 = 34.22f;
        float f2 = 32.34f;
        System.out.println("Output from paramterized method");
        float v = floatAdd(f1, f2);
        System.out.println(v);

        floatAdd(); //calling method
        //double
        double d1 = 62.44;
        double d2 = 24.53;
        System.out.println("Multi of 2 doubles" +doubleAddition(d1,d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        //System.out.println("Value of boolean is " + b1);
        //long
        long l1 = 123456;
        long l2 = 3726526;
        System.out.println("Value of 2 longs is " + l1 + " and " + l2);
        //char
        char c1 = 'J';
        //Non primitive
        //String
        String s1 = "Eureka";
        String s2 = new String( "Tech");
        System.out.println("Concatenation of s1 and s2 is" + s1 + " " + s2);
        booleanType();
    }

    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }
    //method overloading
    //same method name diff parameters
    private static float floatAdd(float f1, float f2) { //method signature
        return f1 + f2;
    }
    //class name = Eureka
    //variable = stringName
    //methods = floatAddiction
    private static void floatAdd() { //method signature
        System.out.println("Sum of 2 floats from method without parameters");
    }
    private static void booleanType() {
        System.out.println("Boolean method");
    }

}
