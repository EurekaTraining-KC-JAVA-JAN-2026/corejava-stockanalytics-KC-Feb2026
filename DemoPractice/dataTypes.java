package DemoPractice;

public class dataTypes {
    public static void main(String[] args) {
        addInt();
        float a = 10.20f;
        float b= 30.30f;
        float v = floatMultiplication(a, b);
        System.out.println(v);
        floatMultiplication();


    }

    private static float floatMultiplication(float a, float b) {
        System.out.println("Method overloading");
        return a*b;

    }

    private static void floatMultiplication() {
        System.out.println("Multiplication");
    }

    private static void addInt() {
        int x=10;
        int y=20;
        System.out.println("Addition" +(x+y));
    }


}
