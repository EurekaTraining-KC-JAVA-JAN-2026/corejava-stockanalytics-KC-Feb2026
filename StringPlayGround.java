import java.util.Arrays;

public class StringPlayGround {
    public static void main(String[] args) {
        //
        String s1="Eureka";
        String s4="eureka";
        String b1=new String("Tech");

        System.out.println("Combination of Eureka and Tech: "+s1+" "+b1);
        System.out.println(s1.concat(" ").concat(b1));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
        //equalsignore
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println();

        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        s1="EurekaTech";
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        String s11="Eureka";
        // this is 1st in SCP (String Constant Pool,
        System.out.println(s11);
        System.out.println(System.identityHashCode(s11));
        //delimiter in String **
        String tickerString= "AAPL,TSLA,JPMC,NVDA";
        //here , is a delimiter
        System.out.println(tickerString);
        String[] tickerArray=tickerString.split(",");
        System.out.println(Arrays.toString(tickerArray));

        String s2= new String("Eureka");
        String s22=new String("Eureka");
        System.out.println(s2);

        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s22));
    }
}
