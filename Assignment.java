public class Assignment {

    public static void main(String[] args) {
        concat("Hari","Java",2.0f);
        System.out.println(concat("Hari",3.0f,"SQL"));
        System.out.println(concat(4.0F,"Hari","JavaScript"));
    }

    public static void concat(String a, String b, float c){
        System.out.println(a+b+c);
    }
    public static String concat(String a,float b,String c){
        return a+b+c;
    }
    public static String concat(float a,String b,String c){
        return  a+b+c;
    }
}
