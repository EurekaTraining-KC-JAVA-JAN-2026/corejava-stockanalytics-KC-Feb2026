public class Assignment1 {
    public static void main(String[] args) {

        String a1= threeConcat("Hello","hi",25.55f);
        System.out.println(a1);
        Type2Concat a2 =new Type2Concat();
        System.out.println(a2.typeConcat());
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
    public static String typeConcat() {
        String str1="Java";
        String str2="class";
        float f=2.0f;
        return str1+str2+f;

    }
}
