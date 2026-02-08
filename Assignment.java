public class Assignment {
    public static void main(String[] args) {
        combine("Akshay","Reddy",3.3f);
        System.out.println(combine("Akshay",3.33f,"Reddy"));
        System.out.println(combine(3.333f,"Akshay","Reddy"));
    }

    public static void combine(String a, String b, float c){
        System.out.println(a+b+c);
    }
    public static String combine(String a,float b,String c){
        return a+b+c;
    }
    public static String combine(float a,String b,String c){
        return  a+b+c;
    }
}
