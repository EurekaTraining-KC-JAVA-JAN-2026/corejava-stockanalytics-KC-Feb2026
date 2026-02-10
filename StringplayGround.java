import java.sql.SQLOutput;

public class StringplayGround {
    public static void main(String[] args) {
        //strings are immutable
        //String s1 = "Eureka";
        //s1="EurekaTech";
       // String s11 = "Eureka";
       // System.out.println(System.identityHashCode(s1));
       // System.out.println(System.identityHashCode(s11));
        // this is 1st in the SCP(String Constant Pool)
        // if not it will create a ref for it
        // if exists it directory use that "Eureka"
       // String s2 = new String("Eureka");
       // String s22 = new String("Eureka");
       // System.out.println(System.identityHashCode(s2));
       // System.out.println(System.identityHashCode(s22));

            String s1 = "Eureka";
            String s3 = "eureka";
            String s4 = new String("Eureka");
            String s2 = new String("Tech");
            String s5 ="";
            String s6 = " ";


        System.out.println("Combination of Eureka and Tech "+s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String tickerString = "AAPL-TSLA-AMD-JMPC";
        // here "," is a delimiter
        System.out.println(tickerString);
        String[] tickerArray = tickerString.split(",");
        for( String eachString : tickerArray){
            System.out.println(tickerArray);
        }



        System.out.println(s5.isEmpty());
        s1.contains("r");

    }
}
