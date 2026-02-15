import java.sql.SQLOutput;

public class StringsPlayGround {
    //always static block static variables static methods should be at class level
    static{
        System.out.println("this is static code block");
    }
    public static void main(String[] args) {
        // strings are immutable

        String s1 = "Eureka";
        String s11 = "Eureka";
        s1 = "EurekaTech";
        /*
        // SCP- String constant pool
        // It will have pool of characters
        // s1= Eureka-- it will store each char in diff location
         // E==>some loaction , u====>some location,r==>some location

        /*
        1765.. >>>> Eureka
          //it will not replace with eureka-- Eureka
          now the reference changes to eurekatech
         */
        System.out.println(System.identityHashCode(s1));
        // here value will change but reference will not change
        System.out.println(System.identityHashCode(s11));

        //this will first check the scp(string constant pool).
        //if its not there it will create a reference for it
        //if its exit it directly use that reference
        //E u r e k a
        //0 1 2 3 4 5

        String s2 = new String("Eureka");
        String s22 = new String("Eureka");
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s22));
        //this will also check in scp

        //operations on Strings---
        String x1 ="Sneha";
        String x3 = "Sneha";
        String x4 = " ";
        String x5 ="";
        String x2 =new String("Kancharla");
        System.out.println("combination of firstname and last name" +x1+"  "+x2);
        System.out.println(x1.concat(x2));
        System.out.println(x1.concat(" ".concat(x2)));
        System.out.println(x1.charAt(4));
        System.out.println(x1.toUpperCase());
        System.out.println(x1.toLowerCase());
        System.out.println(x1.substring(2));
        System.out.println(x1.substring(2,5));//1st index inclusive 2nd index  is exclusive
        System.out.println(x1.equalsIgnoreCase(x3));
        System.out.println(x4.isEmpty());
        System.out.println(x5.isEmpty());
         x1.contains("i");



        //******delimeter in string******
        String tickerString ="AAPL,AMD,TSLA,JPMC";// "," is a delimeter here
        System.out.println(tickerString);
        String[] tickerArray = tickerString.split(",");
        for(String eachString : tickerArray){
            System.out.println(eachString);
        }

        System.out.println(tickerArray);
        System.out.println("");
       // Assignment //print char in a string

        //static // at class level static is constant

/*
String[] args)=> "1
,"3)
 */



    }
}
