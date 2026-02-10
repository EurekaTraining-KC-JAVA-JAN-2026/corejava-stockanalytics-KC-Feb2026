import java.security.spec.RSAOtherPrimeInfo;

public class StringsPlayGround {
    static {
        System.out.println("this is a static codeblock ");
    }
    public static void main(String[] args){
        //Strings are immutable
        //String s1 = "Eureka";
        //s1 = "EurekaTech";
        //SCP(String Constant pool)
        //Pool of characters
        //if s1=Eureka
        //it will place e at a location u at a location r at another
        //String s11 = "Eureka";
        //System.out.println(System.identityHashCode(s1));
        //System.out.println(System.identityHashCode(s11));
        //this is 1st in the SCP(String Constant Pool)
        //if not it will create a ref for it
        //if exists it directly use that "Eureka"
        //String s2 = new String("Eureka");
        //String s22 = new String("Eureka");
        //System.out.println(System.identityHashCode(s2));
        //System.out.println(System.identityHashCode(s22));
        //this will also check in SCP
        //We explicitly say new keyword
        //it will create a new obj

        String s1 = "Eureka";
        String s2 = new String("tech");
        String s3 = "Eureka";
        String s4 = new String("eureka");
        String s5 = "";
        String s6 = " ";
        System.out.println("Combination of Eureka and Tech"+s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(5));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
        //1st is inclusive, 2nd is exclusive
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.isEmpty());
        //char
        s1.contains("r");

        
    }
}
