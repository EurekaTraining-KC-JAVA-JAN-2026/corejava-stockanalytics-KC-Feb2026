public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome to Eureka");
        //primitive
        int i;//declaring
        i = 10;//assigning
        int j = 20;
        System.out.println("Value of i :" + i + " Value of j :" + j);
        //float
        float f1 = 34.22f;
        float f2 = 22.34f;
        extracted(f1, f2);//calling the method
        float f3 = extracted(); // saving the return in new variable
        //double
        double d1 = 12.34;
        double d2 = 34.12;
        System.out.println("Multi of two doubles " + (d1 * d2));
        //boolean
        boolean b1 = true;
        b1 = false;
        System.out.println("Value of boolean is :" + b1);
        //long
        long l1 = 1234556677;
        long l2 = 11234565434567776L;
        //char
        char ch = 'J';
        System.out.println("character is :" + ch);
        //NON-PRIMITIVE
        String str = "Eureka";
        String str2 = new String("Tech");
        System.out.println("Concatenation of str1 and str2 is " + str + " " + str2);
    }

    //method overloading - same method name different parameters
    private static float extracted() {//method overloading
        float f1 = 34.22f;
        float f2 = 22.34f;
        System.out.println("Sum of two floats is :" + (f1 + f2));
        return (f1 + f2);
    }


    private static void extracted(float f1, float f2) {
        System.out.println("Sum of two floats is :" + (f1 + f2));
    }
}
