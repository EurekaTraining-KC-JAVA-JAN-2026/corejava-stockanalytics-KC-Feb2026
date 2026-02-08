public class Assignment1 {
    public static void main(String[] args) {

        String a1= threeConcat("Hello","hi",25.55f);
        System.out.println(a1);
        Type2Concat a2 =new Type2Concat();
        System.out.println(a2.typeConcat("Java","Class",2.0f));
        System.out.println(threeAppend("how are ","you?",3.25f));
    }

    private static String threeConcat(String a,String b,float f) {
        return a+b+f;
    }
    private static String threeAppend(String a,String b,float f) {
        String str1=a.concat(b).concat(String.valueOf(f));
        return str1;
    }

}
class Type2Concat {
    public static String typeConcat(String a, String b, float f) {
        return a+b+f;
    }
}
