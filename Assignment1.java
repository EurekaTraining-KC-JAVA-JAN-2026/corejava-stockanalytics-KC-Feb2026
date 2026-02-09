public class Assignment1 {
    //Method 1
    private static String concat(String s1, String s2, float f) {
        String s = s1 + s2 + f;
        return s;
    }

    //Method 2
    private static void concatType(String s1, String s2) {
        System.out.println(s1 + s2);
    }
//Method 3

    private static String concat() {
        String s = "Method3";
        return s;
    }

    // Main method
    public static void main(String[] args) {
        String s1 = concat("Welcome", " Method1 ", 4.546f);
        System.out.println(s1);
        concatType("Welcome", " Method2");
        String s2 = concat();
        System.out.println(s2);
    }
}

