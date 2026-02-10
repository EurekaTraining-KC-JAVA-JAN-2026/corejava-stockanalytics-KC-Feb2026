import java.util.Locale;

public class StringsPlayGround {
    static {
        System.out.println("this is a static code block");
    }
    public static void main (String [] args){
        //strings are immutable

        String s1="Eureka";
        s1="EurekaTech";
        //SCP is pool of chars
        //s1=Eureka
        //

        /*
        1765 .......>>>>Eureka

        1756------>>EurekaTech
         */
        System.out.println(System.identityHashCode(s1));
        String s11="Eureka";
        System.out.println(System.identityHashCode(s11));
        //this is 1st in the string constant pool
        //if not it will create a ref for it
        //if exists it directly use that Eureka
        String s2= new String("Eureka");
        String s22= new String("Eureka");
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s22));

        //this also check scp but we are saying new , so it wont refer to existing
        //it will create a new object for string s2

        String s8="Eureka";
        String s3="eureka";
        String s4= new String("eureka");
        String s9= new String("Tech");
        String s5= "";
        String s6= " ";



        System.out.println("Combination of Eureka and Tech "+s1+ "  " +s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));// 1st index is inclusive and second is exclusive
        System.out.println(s1.equalsIgnoreCase(s4));
        //char[] charArray = (s1.toCharArray());

        //
        String tickerString= "AAPL,AMD,TSLA,JPMC,NVDA";//here "," is a delimiter
        String[] tickerArray=tickerString.split(",");
        //System.out.println(tickerArray);
        for (String eachString : tickerArray){
            System.out.println(eachString);
        }



        System.out.println(s5.isEmpty());
        s1.contains("r");
        // string[] args , args can be anything












    }
}
