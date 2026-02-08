public class Assignment1 {

    public static void main(String[] args) {
        String s1 = "Eureka";
        String s2 = "Trainings";
        float f = 2026.02f;
        //System.out.println(s1+s2+f);
        String result = concat(s1, s2, f);
        String result2 = concat2(s1, s2, f);
        Assignment1 obj = new Assignment1();
        String result3 = concat3(obj, s1, s2, f);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static String concat3(Assignment1 obj, String s1, String s2, float f) {
        String result = s1 + s2 + f;
        return result;
    }


    private static String concat(String s1, String s2, float f) {
        String result = s1 + s2 + f;
        return result;

    }

    private static String concat2(String s1, String s2, float f) {
        String result = s1.concat(s2).concat(String.valueOf(f));
        return result;
    }
}