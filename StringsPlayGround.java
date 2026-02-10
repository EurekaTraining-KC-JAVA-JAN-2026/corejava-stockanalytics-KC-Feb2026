

public class StringsPlayGround {
    static {
        System.out.println("Static Block"); //Static is class Level
    }
    public static void main(String[] args) {
//        String s1 = "Eureka";
//        //s1="EurekaTech";
//        //Strings are immutable.SCP(String Constant Pool)
//        String s11 = "Eureka";
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s11));
//
//        String s2 = new String("Eureka");
//        String s22 = new String("Eureka");
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s22));

        String s1 = "Eureka";
        String s2= new String("Tech");
        String s5="";
        String s6=" ";

        System.out.println("Combination of Eureka and Tech" + s1+" "+s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s6.isEmpty());//for s5 it is true Since it is Empty

        String tickerString = "AAPL,AMD,TSLA,JPM";//',' is delimiter
        String[] tickerArrray = tickerString.split(",");
        for (String eachString : tickerArrray); {
            System.out.println(tickerArrray);
        }

        //Instances Object level
        //Class Level is Statics level-Can't be Changed.





    }
}
