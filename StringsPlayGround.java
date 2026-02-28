public class StringsPlayGround {
        static{
                System.out.println("this is static code block");
        }
    public static void main(){
////        String s1="Eureka";
//        System.out.println(System.identityHashCode(s1));
//        //s1="Eurekatech";
//        System.out.println(System.identityHashCode(s1));
//        String s11="Eureka";
//        System.out.println(s1);
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s11));
//        /// 1st in scp
//        //if not it will create ref
//       /// if exists it directly
//        String s2=new String("Eureka");
//        String s22=new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));
String s1="Eureka";
String s3="Eurekatech";
String s4=new String("eureka");
String s5="";
String s6="";
String s2=new String("tech");
        System.out.println("combination of eurek and tech "+s1+""+s2);
        System.out.println(s1.concat("").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
       // System.out.println(s1.equalsIgnoreCase());
//        char[] charArray =s1.toCharArray();
//        System.out.println(s5.isEmpty());
        s1.contains("r");
        String tickerString="AAPL,TSLA,AMD,JMPC";// "," IS A DELIMITER
            String[] tickerArray = tickerString.split(",");
            for(String eachString : tickerArray){
                    System.out.println(eachString);
            }
            System.out.println(tickerArray);
    }
}
