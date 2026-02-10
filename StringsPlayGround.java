public class StringsPlayGround {
    static{
        System.out.println("this is a static code block");
    }
    public static void main(String[] args) {
        //Strings are immutable
//
//        String s1="Eureka";
//        s1="eurekatech";
//        String s11="Eureka";
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s11));
//        //this 1st check in scp(string constant pool),
//        //if not it will create a ref for it
//        //if exist it directly use that Eureka
//        String s2 = new String("Eureka");
//        String s22 = new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));
//        //we explicitly say new keyword
//        //it will create a new object

        String s1="Eureka";
        String s3=new String("eureka");
        String s2 = new String("Tech");
        String s5="";
        String s6=" ";
        System.out.println("concat is "+s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));//1st is inclusive and 2nd is exclusive
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.toCharArray());
        System.out.println(s5.isEmpty());
        System.out.println(s6.isBlank());

        String tickerString = "APPL,TSLA,AMD,JMPC";// here  "," is a delimiter
        System.out.println(tickerString);
        String[] tickerArray= tickerString.split(",");
        for(String eachString : tickerArray){
            System.out.println(eachString);
        }



    }
}
