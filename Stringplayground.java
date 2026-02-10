import java.sql.SQLOutput;

public class Stringplayground {
    public static void main(String[] args) {
        // String s1 = "eureka";
      //  System.out.println(System.identityHashCode(s1));
       //  s1= "eureka_tech";
       // System.out.println(System.identityHashCode(s1));
       // String s11 = "eureka";
        //System.out.println(System.identityHashCode(s1));
       // System.out.println(System.identityHashCode(s11));
        // this is 1st in the scp(string constant pool)
        // if not it will create  a ref for it
        // if exists it directly use that "eureka"
       // String s2 =new String("eureka");
        //String s3 =new String("eurekatech");
       // System.out.println(System.identityHashCode(s2));
        //System.out.println(System.identityHashCode(s3));
        //this will also check is scp
        //we explictly say new key-word
        //it will create a new object



        String s1 = "eureka";
        String s3 = "eureka";
        String s4 = new String("eureka");
        String s2 = new String("tech");
        String s5 = "";
        String s6 = " ";
        System.out.println("combination of eureka and tech " +s1+" " +s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring( 2 ));
        System.out.println(s1.substring(2,4));// 1st index is inclusive and 2nd index is exclusive
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s5.isEmpty());
        char[] charArray = s1.toCharArray();
        // string delimiter is;

        String tickerString = "AAPL-TSLA-AMD-JPMC" ;   //HERE "," IS a delimeter
        System.out.println(tickerString);
        String[] tickerArray = tickerString.split(" ,");
        System.out.println(tickerArray);
        for(String eachString : tickerArray){
            System.out.println(eachString);
        }








    }

}
