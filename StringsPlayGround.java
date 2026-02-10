public class StringsPlayGround {
    static void main(String[] args) {
        /*
        String s1 = "Eureka";
        System.out.println(System.identityHashCode(s1));
        String s11 = "Eureka";
        s1 = "EurekaTech";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s11));
        //strings are immutable, SCP ( String constant pool)

        String s2 = new String("Eureka");
        String s22 = new String("Eureka");
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s22));
        */

        String s1 = "Eureka";
        String s2 = new String("Tech");
        String s5 = "";
        String s6 = " ";

        System.out.println("combo of of Eureka and Tech: "+s1+" "+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
        //delimiter in string
            String tickersString = "AAPL,TSLA,AMD,JMPC";
            String[] tickerArray = tickersString.split(",");
            for(String eachString : tickerArray){
                System.out.println(eachString);
            }

        System.out.println(s5.isEmpty());

    }
}
