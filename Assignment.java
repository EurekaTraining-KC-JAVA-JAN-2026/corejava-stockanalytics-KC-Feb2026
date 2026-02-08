public class Assignment {
    public static void main() {


       String sun =  newone();
        System.out.println(sun);

      String result = newone(" manju","Bhargav",55.55f)  ;
        System.out.println(result);

    }

    private static String newone() {
        String s1 = "hanuman";
        String s2 = "chalisa";
        System.out.println(s1+ " "+s2);

        String s3 = "sita";
        String s4 = "ram";
        System.out.println(s3+ " "+s4);

        float f1 = 25.55f;
        float f2 = 68;
        System.out.println(f1+f2);
        return s1;
    }

    private static String newone( String a, String b, float c) {

        return a+b+c;
    }



}
