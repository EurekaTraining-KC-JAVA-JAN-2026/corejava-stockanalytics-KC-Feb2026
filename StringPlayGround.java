public class StringPlayGround {
    static{
        System.out.println("this is a static code block");
    }
    public static void main(String[] args){
        //strings are immutable
        //    String s1 = "Eureka";
        //   s1="EurekaTech";
        //   String s11 = "Eureka";
        //   System.out.println(System.identityHashCode(s1));
        //   System.out.println(System.identityHashCode(s11));
        //this is 1st in SCP(String Constant pool);
        //if not it will create a ref for it
        //if exists it directly use that "Eureka"
        //   String s2 = new String("Eureka");
        //    String s22 = new String("Eureka");
        //   System.out.println(System.identityHashCode(s2));
//        //    System.out.println(System.identityHashCode(s22));
        //this is 1st in SCP(String Constant pool);
        //we explictly  say new key word
        //it will create a new object


        String s1 = "Eureka";
        String s3 = "eureka";
        String s4 = new String();
        String s2 = new String("Tech");
        String s5 = " ";
        String s6 = " ";


        System.out.println("Combination " +s1+" " +s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.equalsIgnoreCase(s4));
    //  char[] charArray = s1.toCharArray();
        String tickersString = "AAPL,TSLA,AMD,JPMC"; // "," IS A DELIMITER
        System.out.println(tickersString);
        String[] tickerArray = tickersString.split(",");
        for(String eachString : tickerArray){
            System.out.println(eachString);
        }
        System.out.println(s5.isEmpty());
        System.out.println(s6.isBlank());
    }
}
