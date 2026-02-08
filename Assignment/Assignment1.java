package Assignment;

public class Assignment1 {

    public static void method(String s1, String s2, float f1) {
        System.out.println(s1 +" " + s2 + " "+ f1);
    }

    public static String method(float f1, String s1, String s2) {
        return s1 +" " + s2 + " "+ f1;
    }

    public static String method(String s1,float f1, String s2) {
        return s1 +" " + s2 + " "+ f1;
    }

    public static void main(String args[]) {

        String s1 = "Vishwanath";
        String s2 = "Noothalakanti";
        float f1 = 11.34F;

      method(s1, s2, f1);

      String output = Assignment1.method(2.0F,"Vishwa","Java");
      System.out.println(output);

      String outPut1 = Assignment1.method(s1,f1,s2);
      System.out.println(outPut1);


    }
}
