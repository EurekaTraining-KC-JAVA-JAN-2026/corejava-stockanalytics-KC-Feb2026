public class Assignment1 {
    public static void main(String[] args) {
        Assignment1 demo = new Assignment1();
        System.out.println(demo.concat("Good ", "Morning ", 5.56f));
        System.out.println(demo.concat("Callme ", 88.8f, " Back"));
        System.out.println(demo.concat(98.2f, "Happy ", "Holidays"));
    }

    public String concat(String s1, String s2, float f) {
        return s1 + s2 + f;
    }

    public String concat(String a1, float f2, String a2) {
        return a1 + f2 + a2;
    }

    public String concat(float f1, String str1, String str2) {
        return f1 + str1 + str2;
    }

}

