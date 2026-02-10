import java.sql.SQLOutput;

public class StringsPlayGround {
    static{
        System.out.println("This is a static code block");
    }
    public static void main(String[] args){
        //
      //   String s1 = "Eureka";
    //    s1 = "EurekaTech";
        /*

        1765 ... Eureka
                 Eureka
                 Euretech
         */
       // System.out.println(System.identityHashCode(s1));
       // String s11 = "Eureka";
       // System.out.println(System.identityHashCode(s11));
        //this is 1st in the SCP(String constant pool)
        //if not it will create a ref for it
        //if exists it directly use that "Euraka"
       // String s2 = new String("Eureka");
       // String s22 = new String("Eureka");
       // System.out.println((System.identityHashCode(s2)));
       // System.out.println(System.identityHashCode(s22));
     String s1 ="Eureka";
     String s3 = "eureka";
     String s4 = new String ("eureka");
     String s2 = new String("Tech");
     String s5 = "";
     String s6 = " ";
        System.out.println("Combination of Eureka and Tech "+s1+" "+s2);
        System.out.println(s1.concat( " ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4)); //1st inclusive 2nd exclusive
        System.out.println(s1.substring(2,4));
        System.out.println(s1.equalsIgnoreCase(s4));
        //delimiter in string
        String tickerString = "AAPL,TSLA.AMD,JPMC"; //HERE "", is a delimiter
        String[] tickerArray = tickerString.split( ",");
        System.out.println(tickerArray);
        for(String eachString : tickerArray){

        }

        System.out.println(s5.isEmpty());
        s1.contains("r");

    }
}
