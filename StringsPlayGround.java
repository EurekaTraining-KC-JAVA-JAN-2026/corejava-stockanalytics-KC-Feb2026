public class StringsPlayGround {
    public static void main(String[] args){
        String s1 = "Eureka"; //092
        System.out.println(System.identityHashCode(s1));
        s1 = "Eureka_tech";//006
        System.out.println(System.identityHashCode(s1));
        String s11 = "Eureka"; //092
        System.out.println(System.identityHashCode(s11));

        String s3 = "Eureka";
        String s2 = new String("Tech");
        String s4 = new String("Tech");
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s4));
        System.out.println(s3.concat(s2));
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.charAt(2));
        System.out.println(s3.substring(3));
        System.out.println(s3.isEmpty());
        System.out.println(s2.contains("T"));

        String tickerString = "AAPL,TSLA,AMD,JPMC";
        String[] tickerArray = tickerString.split(",");
        for(String eachString: tickerArray){
            System.out.println(eachString);
        }
    }
}
