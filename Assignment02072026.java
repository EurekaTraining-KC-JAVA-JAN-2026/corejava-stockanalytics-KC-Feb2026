public class Assignment02072026 {
    public static void main(String[] args) {
    //write a method, in three ways, it should take 3 arug's (string,string,float)
        // it should return the concatenation of those argus
        String str="hi";
        String str2="hello";
        float f=2.22f;
        concat();
        concat(str,str2,f);
        String str4=concatOfTwo(str,str2,f);
        System.out.println("Concatenation using manually declared method "+str4);

    }

    private static void concat(String str, String str2, float f) {
        System.out.println("Concatenation using method creation feature "+str+str2+String.valueOf(f));

    }

    private static void concat() {
        String str="hi";
        String str2="hello";
        float f=2.22f;
        System.out.println("Concatenation using extract method feature "+str+str2+String.valueOf(f));
    }

    public static String concatOfTwo(String str1, String str2,float f ){
        return str1+str2+f;
    }
}
