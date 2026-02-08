public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka....!");

        // Primitive Data type
        // Data_Type Name = value;
        int i; i = 10; // Declaring and Assigning
        int j; j = 20;
        System.out.println("Value of i : " +i );
        System.out.println("Value of j : " +j);

        // Float
        floatAdd(); // Calling the method

        // Double
        double d1 = 34.22d;
        double d2 = 25.52d;
        System.out.println("Sum of d1 and d2 is : "+(d1+d2));

        // Boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("value of b1 is : "+b1);

        // Long
        long l1 = 12343242;
        long l2 = 32432453;
        System.out.println("Sum of l1 and l2 is : "+(l1+l2));

        // Non-primitive Data Type
        String s1 = "Eureka";
        String s2 = new String("Tech");
        System.out.println("Concatenation of s1 and s2 is : " +s1+ " " +s2);
    }

    // class name =>Eureka
    // variable =>stringName
    // methods => floatAddition
    private static void floatAdd() {   // method signature
        float f1 = 34.22f;
        float f2 = 25.51f;
        System.out.println("Sum of f1 and f2 is : "+(f1+f2));
    }

    private static void booleanType(){
        System.out.println("Boolean method");
    }




}
