public class StringPlayGround {

    public static void main(String[] args) {
        String s1 = "Eureka";
//        System.out.println("S1 :"+ System.identityHashCode(s1));
//        String s11 = "Eureka";
//        s1 = "EurekaTech";
//        System.out.println("S1 After Update :"+System.identityHashCode(s1));
//        //System.out.println(System.identityHashCode(s1));
//        System.out.println("S11 :" +System.identityHashCode(s11));
        String s2 = new String ("Tech");
        String s3 = "";
        String s4 = " ";
//        String s22 = new String ("Eureka");
//        System.out.println("S2 :" +System.identityHashCode(s2));
//        System.out.println("S22 :" +System.identityHashCode(s22));

//        System.out.println("Combination of Eureka and Tech is :"+s1 +" "+s2);
//        System.out.println(s1.concat(" ").concat(s2));
//        System.out.println(s1.charAt(3));
//        System.out.println(s1.contains("e"));
//        System.out.println(s1.substring(2,3));
//        System.out.println(s1.toUpperCase());
//        System.out.println(s3.isBlank());
//        System.out.println(s4.isEmpty());
        //Delimiter in String **********
        String tickerString = "AAPL,TSLA,AMD,JPMC";
        System.out.println(tickerString);
        String[] tickerArray = tickerString.split(",");
        for(String v : tickerArray){
            System.out.println(v);
        }
    }
}
