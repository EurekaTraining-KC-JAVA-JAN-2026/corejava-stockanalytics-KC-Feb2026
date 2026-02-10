public class StringsPlayGround {
    static{
        System.out.println("This is static code block");
    }
    public static void main(String[] args) {

//        //
//        String s1 = "Eureka";
//        s1 = "EurekaTech";
////          SCP(String constant pool)
////          pool char's
////          s1 = Eureka
////          E==>someLocation ..-> 4
////          u===>someLocation ...-> 6
//        /*
//        1765... => Eureka
//
//                   Eureka
//         1765....(Reference_Number remains same for s1) =>> EurekaTech (Only the Value gets Updated). Strings are immutable
//         */
//        String s11 = "Eureka";
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s11));
//        //This is 1st in the SCP(String constant pool).
//        //if not, it will create a ref for it
//        //if exists it directly use that "Eureka"
//
//        String s2 = new String("Eureka");
//        String s22 = new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));
//        // This will also check in SCP
//        // we explicitly say new key-word
//        // It will create a new object


        // E u r e k a
        // 0 1 2 3 4 5 => Indexing starts from Zero
        // 1 2 3 4 5 6 => Length of an Array
        String s1 = "Eureka";
        String s2 = new String("Tech");
        String s3 = "eureka";
        String s4 = new String("eureka");
        String s5 = "";
        String s6 = " ";

        System.out.println("Combination of Eureka and Tech is :  " +s1+" "+s2);    // 1st Con Method
        System.out.println(s1.concat(" ").concat( s2));                        // 2nd Con Method
        System.out.println(s1.charAt(3));                                          // To print a particular char in string
        System.out.println(s1.toLowerCase());                                      // To print lower cases of the given string
        System.out.println(s1.toUpperCase());                                      // To print upper cases of the given string
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.equalsIgnoreCase(s4));

      //  char[] charArray =s1.toCharArray();
            // Delimiter in string ********
            String tickersString = "APPL-TSLA-AMD-JMPC";    // Here "," is a Delimiter
            System.out.println((tickersString));

            String[]tickerArray =tickersString.split(",");
            for(String eachString : tickerArray){
                    System.out.println(eachString);
            }
            System.out.println(tickerArray);


        System.out.println(s5.isEmpty());
        s1.contains("r");

/*
(String[] args) => "5","50","40",.......""
 */
    }
}
