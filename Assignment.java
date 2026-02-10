public class Assignment {
    public void concatPrint(String s1, String s2, float f1) {
        String result = s1 + " " + s2 + " " + f1;

    }

    public static String concat(String s1, String s2, float f1) {
        return s1 + " " + s2 + " " + f1;
    }

    public static void main(String[] args) {

        String s1 = "lohith";
        String s2 = "eureka";
        float f1 = 23.4f;

        String result = concat(s1, s2, f1);
        System.out.println(result);
        System.out.println(concat(s1,s2,f1));
        Assignment obj = new Assignment();
        obj.concatPrint(s1, s2, f1);
        System.out.println(result);
    }
}
