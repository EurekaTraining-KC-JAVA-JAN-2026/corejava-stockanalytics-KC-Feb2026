public class Methods {
    public static void main(String[] args) {
        String name = "Nikhitha";
        String course = "java";
        float score = 9.5f;
        System.out.println("concatenation is :" + (name + " " + course + " " + score));
        concatenation();
        String result = concatenation(name,course,score);
        System.out.println("concatenation is :" + result);

    }

    private static String concatenation(String name, String course, float score) {
        return name + " " + course + " " + score;
    }

    private static void concatenation() {
        String name = "Navya";
        String course = "Java";
        float score = 10.5f;
        System.out.println("concatenation is :" + (name + " " + course + " " + score));
    }
}
