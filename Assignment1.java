

public class Assignment1 {

    // Method 1: (String, String, float)
    public static String method(String s1, String s2, float f1) {
        return s1 + " " + s2 + " " + f1;
    }

    // Method 2: (float, String, String)
    public static String method(float f1, String s1, String s2) {
        return s1 + " " + s2 + " " + f1;
    }

    // Method 3: (String, float, String)
    public static String method(String s1, float f1, String s2) {
        return s1 + " " + s2 + " " + f1;
    }

    public static void main(String[] args) {

        String s1 = "First";
        String s2 = "Assignment";
        float f1 = 8.26f;

        // Call 1
        System.out.println(method(s1, s2, f1));

        // Call 2
        String output = Assignment1.method(8.26f, "First", "Assignment");
        System.out.println(output);

        // Call 3
        String output1 = Assignment1.method(s1, f1, s2);
        System.out.println(output1);
    }
}
