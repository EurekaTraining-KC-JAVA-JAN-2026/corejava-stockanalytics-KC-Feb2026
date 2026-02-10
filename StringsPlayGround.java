public class StringsPlayGround {
    static  {
        System.out.println("Hello there!");
    }
    public static void main(String[] args) {
//        String s1 = "Eureka";
//        System.out.println(System.identityHashCode(s1));
//        s1 = "EurekaTech";
//        System.out.println(System.identityHashCode(s1));
//        String s3 = "Eureka";
//        // first check in the scp - string constant pool else create reference else use "Eureka"
//
//        System.out.println(System.identityHashCode(s3));
//        String s2 = new String("Eureka");
//        String s4 = new String("Eureka");
//         also check in scp but explicitly as we are using new and create a new object
//         System.out.println(System.identityHashCode(s2));
//         System.out.println(System.identityHashCode(s4));
//        // Strings are immutable
//        // if s1 is hello it will have reference but if s1 is changed to hellothere
//        // the reference will be different, the reference of hello will stay in memory itself

        String s5 = "Eureka";
        String s7 = "eureka";
        String s6 = new String("Tech");
        String s8 = "";
        String s9 = " ";
        System.out.println("Combination of Eureka and Tech is "+ s5 + " "+ s6);
        System.out.println(s5.concat(" ").concat(s6));
        System.out.println(s5.charAt(1));
        System.out.println(s5.toUpperCase());
        System.out.println(s6.toLowerCase());
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(2,5));
        System.out.println(s5.equalsIgnoreCase(s7));
        System.out.println(s8.isBlank());
        System.out.println(s8.isEmpty());
        System.out.println(s9.isEmpty());
        System.out.println(s9.isBlank());
        System.out.println(s5.contains("re"));
        System.out.println(s5.length());
        String tickerString = "AAPL-AMD-NFLX-NVDA";
        System.out.println(tickerString);// , is a delimiter
        String[] tickerArray = tickerString.split("-");
        for(String tickerValue: tickerArray)
        {
            System.out.println(tickerValue);
        }




    }

}
