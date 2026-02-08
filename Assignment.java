public class Assignment {

    public static void main(String[] args) {

        String str = "hi";
        String str2 = "hello";
        float f = 2.22f;

        String r1 = concat();
        String r2 = concat(str, str2, f);
        String r3 = concatOfTwo(str, str2, f);

        System.out.println("First return is : " + r1);
        System.out.println("Second return is: " + r2);
        System.out.println("Third return  is : " + r3);
    }

    // 1 First way
    private static String concat() {
        String str = "hi";
        String str2 = "hello";
        float f = 2.22f;
        return str + str2 + f;
    }

    // 2 Second way
    private static String concat(String str, String str2, float f) {
        return str + str2 + f;
    }

    // 3 Third way
    public static String concatOfTwo(String str1, String str2, float f) {
        return str1 + str2 + f;
    }
}