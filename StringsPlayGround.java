public class StringsPlayGround {
    static{
        System.out.println("this is a static code block");
    }
    public static void main(String[] args) {
//        //Strings are immutable
//        String s1 = "Eureka";
//        s1="EurekaTech";
////        SCP(String constant pool)
////        pool char's
////        s1 = Eureka
////        E==>someLocation ..->4
////        u===>someLocation ...->6
////        r===>someLocation ..->7
////        T===>somelOcation  ...9
//        /*
//        1765...  =>>>> Eureka
//
//                        Eureka
//          1765....  ==>>EurekaTech
//         */
//        System.out.println(System.identityHashCode(s1));
//        String s11 = "Eureka";
//
//        System.out.println(System.identityHashCode(s11));
//        //this is 1st in the SCP(String constant pool),
//        //if not it will create a ref for it
//        //if exists it directly use that "Eureka"
//        String s2 =  new String("Eureka");
//        String s22 =  new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));
//        //this will also check in SCP
//        // we explictly say new key-word,
//        //it will create a new Object
//
//
 //         E   u   r   e   k   a
//          0   1   2   3   4   5 => indexing starts from ZEro
//          1   2   3   4    5  6 => this length
        String s1 = "Eureka";
        String s3 = "eureka";
        String s4 = new String("eureka");
        String s2 = new String("Tech");
        String s5 = "";
        String s6 = " ";
        System.out.println("Combination of Eureka and Tech "+s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));//1st is inclusive 2nd is exculsive
        System.out.println(s1.equalsIgnoreCase(s4));
//        char[] charArray = s1.toCharArray();
            //delimiter in String ***********
            String tickersString = "AAPL-TSLA-JPMC-NVDA";
                     // here "," is a delimiter
            System.out.println(tickersString);
            String[] tickerArray = tickersString.split("-");
            for(String eachString : tickerArray){
                    System.out.println(eachString);
            }


        System.out.println(s5.isEmpty());
        s1.contains("r");
/*
(String[]  args) => "5","50","40",......""
 */
    }
}
