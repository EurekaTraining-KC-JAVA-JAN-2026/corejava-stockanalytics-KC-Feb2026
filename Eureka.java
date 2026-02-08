public class Eureka {
    public static void main(String[] args) {

        System.out.println("Welcome Eureka...!");
        //primitive
        int i;
        i = 10; //assigning
        int j = 20;
        System.out.println("Value of i" + i);
        System.out.println("Value of j" + j);
        //float
        floatAddition();//calling  method
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("multi is " + (d1 * d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("Value of boolean is" + b1);
        //long
        long l1 = 12343242;
        long l2 = 34567891;
        System.out.println(("Value is" + l1 + " and " + l2));
        char c1 = 'J';
        //non-primitives
        String s1 = "Eureka";
        String s2 = new String("Tech");
        System.out.println("concat of is " + s1 + " " + s2);
        //Eureka a=new Eureka();
        System.out.println(concat("Revanth", "Pavan", 3.49f));
        System.out.println(concat(3.49f, "Pavan", "Revanth"));
        System.out.println(concat("Pavan", 98.6f, "Revanth"));
    }

    private static double doubleAddition(double d1, double d2) {
        return d1 * d2;
    }


    //class name => Eureka
    //variable=.StringNmae
    //method => floatAddition
    private static void floatAddition() { //method signature
        float f1 = 34.22f;
        float f2 = 22.34f;

        System.out.println("Sum of 2 floats is " + (f1 + f2));
    }

    private static void booleanType() {
        System.out.println("Boolean method");
    }

    public static String concat(String s1, String s2, float f) {
        return s1 + s2 + f;
    }

    // Order: float, String, String
    public static String concat(float f, String s1, String s2) {
        return f + s1 + s2;
    }

    // Order: String, float, String
    public static String concat(String s1, float f, String s2) {
        return s1 + f + s2;
    }
}



