public class Eureka {
    static void main(String[] args) {
        System.out.println("welcome to Eureka...!");
        // primitives

        //1.int
        int i; // declaring
        i=10; // assigning
        int j=20;
        System.out.println("value of i "+i);
        System.out.println("value of j "+j);

        //2.float
        float f1= 34.22f;
        float f2= 22.34f;
        System.out.println("sum of 2 floats is "+(f1+f2));


        // double
        doubleMul();
        doubleMul( 12.34,34.12);
        System.out.println(doubleMul2( 322.34,34.12));

        //boolean
        boolean b1= true;
        b1 = false;
        System.out.println("value of boolean is"+b1);

        //long
        long l1= 123456787;
        long l2= 7654321;
        System.out.println("value of 2 longs is "+l1+"add"+l2);


        //non-primitives

        //strings
        //1
        String s1= "Eureka";
        String s2= new String("Tech");
        System.out.println(("concat of two strings is "+s1+" "+s2));

    }

    private static void doubleMul() { // a method not using return is called method signature
        double d1= 12.34;
        double d2= 34.12;
        System.out.println("mul of 2 doubles is "+(d1*d2));
    }
    // class name => Eureka
    // variable => stringName
    // methods => floatAddition


    // method overloading
    // same method but using diff parameters like one paramter for one and two for other
    private static void doubleMul(double d1,double d2) { // a method not using return is called method signature
        System.out.println("mul of 2 doubles is "+(d1*d2));
    }
    private static double doubleMul2(double d1,double d2) { // a method not using return is called method signature
        return(d1*d2);
    }




}
