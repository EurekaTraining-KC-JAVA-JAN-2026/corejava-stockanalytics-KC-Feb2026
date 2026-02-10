public class StringPlayGround {
    static { //all static methods will be in the class methos

        System.out.println("this is a static code block");
    }
    public static void main(String[] args){
//        //Strings are immutable
//        String s1 = "Eureka";
//        s1="EurekaTech";
//        // SCP(String Cnstant Pool)
//        // pool char's
//        // s1 = Eureka
//        //E => someLocation...>2
//        //U => someLocation...>4
//        //R => someLocation...>6
//
//
//        /*2065...    ==> Eureka
//
//
//                      Eureka
//         2065....    => EurekaTech
//         */
//        String s11 = "Eureka";
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s11));
//        //this is 1st in the SCP(String Constant pool),
//        //if not it will create a ref for it
//        //if exists it directly use that "Eureaka"
//        String s2 = new String("Eureka");
//        String s22 = new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));
//
//        //this


        String s1 = "Eureka";
        String s3 = "Lewis";
        String s4= new String("eureka");

        String s2 = new String("Tech");
        String s5= "";
        String s6 = " ";
        System.out.println("Combination of Eureka and Tech"+ s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));//1st is inclusive and second number is exclusive case
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s6.isEmpty()); //Space also takes as String
        //char[] charArray = s1.toCharArray("Lewis");
        //delimiter in String
        String tickerString = "AAPL,TSLA,AMD,JMPC";//Here "," is a delimiter
        String[] tickerArray = tickerString.split(",");

        for(String eachString : tickerArray){
            System.out.println(eachString);
        }

        //System.out.println(tickerArray);





        System.out.println(s5.isEmpty());





    }
}
