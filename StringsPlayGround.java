public class StringsPlayGround {

    static {
        System.out.println("static prints first.");
    }

    public static void main(String args[]) {
        //this is 1st in the SCP(String constant poll
        //If not it will create a ref for it.
        //if exists it directly use that particular string i.e "Eureka"
        String s1 = "Eureka";
        System.out.println(System.identityHashCode(s1));
        String s2 = "Eureka";
        s1 = "EurekaInfo";
        /**
         * SCP(String constant Pool
         * pool char's
         * if EUREKA is a String : every character will be stored at specifc location
         * E -> AT one location,
         * U -> at one location,
         * R -> at one location.
         */
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        //this will also check in SCP
        //we explictly say new keyword.
        //it will create a new obj.
        String s11 = new String("Eureka");
        String s12 = new String("Eureka");
        System.out.println(System.identityHashCode(s11));
        System.out.println(System.identityHashCode(s12));

        /**
         * Indeex starts from 0,
         * Array length starts from 1.
         */

        String string = "Eureka";
        String newString = new String("Tech");
        String s21 = " ";
        String s22 = " ";

        System.out.println( "String " + string + " " + newString);
        System.out.println("2 :" + string.concat(" ").concat(newString));
        System.out.println("3" + string.charAt(0));
        System.out.println("4" + string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(2));
        System.out.println(string.contains("E"));
        System.out.println("To char array " + string.toCharArray());
        System.out.println("S21" + s21.isEmpty());
        System.out.println(s22.isBlank());

        //Delimitor
        String tickerString = "AAPL,TSLA,AMD"; //here "," is a delimitor
        System.out.println(tickerString);
        String[] tickerArray = tickerString.split(",");
        System.out.println("Ticker Array : " + tickerArray);
        for(String ticker : tickerArray) {
            System.out.println(ticker);
        }

        //Delimitor
        String tickerString1 = "AAPL-TSLA-AMD"; //here "," is a delimitor
        System.out.println(tickerString1);
        String[] tickerArray1 = tickerString.split("-");
        for(String ticker : tickerArray1) {
            System.out.println(ticker);
        }



    }
}
