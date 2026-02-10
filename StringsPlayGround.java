public class StringsPlayGround {
    static void main(String[] args) {


        /*
        // strings are immutatble
        String s1 ="Eureka";  // ref=41359092
          //ref=41359092
        System.out.println(System.identityHashCode(s1));
        s1 ="EurekaTech"; // s1 addrress cannot be changed but it will create a diff address


        // SCP(String constant pool)
        // pool char's
        // s1= Eureka
        // E=>someLocation..->4
        // U=>someLocation..->6
        //r=>somelocation..->7
        // T-> somelocation ..->9

        String s11="Eureka";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s11));
        // this is 1 st check in the SCP(string constant pool)
        //if not it will create a ref for it
        // if exists it directly use that "Eureka"
        String s2 =new String("Eureka"); //149928006
        String s22 =new String("Eureka"); //713338599
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s22));
        // it will also chcek in the SCP
        //we explicitly say new key-word
        // it will create a new object


        */


        String s1 = "Eureka";
        String s3 = "eureka";
        String s2 = new String("tech");

        String s5 = "";
        String s6 = " ";
        System.out.println("Combination of Eureka and Tech" + s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2, 4)); // first is inclusive and second is exclusive
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println((s5.isEmpty()));
        System.out.println((s6.isEmpty()));

        // char[] charArray= s1.toCharArray()    ///later

        // delimiter in strings
        String tickerString= "AAPL,TSLA,AMD,JMPC";  //Here"," is a delimiter
        System.out.println(tickerString);
        String[] tickerArray =tickerString.split(",");
        for(String eachString:tickerArray) {
            System.out.println(eachString);
        }

    }
}



