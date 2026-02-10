public class StringPlayGround {

    static{
        System.out.println("this is a ststic code block");
    }
    public static void main(String[] args){

       String s1 = "Narayana";
       System.out.println(System.identityHashCode(s1));
       s1 = "lakshmi Narayana";
       System.out.println(System.identityHashCode(s1));
       String s11 = "Narayana";
       System.out.println(System.identityHashCode(s11));

       String s2 = new String ("Narayana");
       String s22 = new String ("Narayana");
       System.out.println(System.identityHashCode(s2));
       System.out.println(System.identityHashCode(s22));


       String s3 = "rama";
       String s4 = new String ("sita");
       System.out.println(s3+s4);
       System.out.println(s3.concat(" ").concat(s4));
       System.out.println(s1.charAt(5));
       System.out.println(s1.toUpperCase());
       System.out.println(s1.toLowerCase());
       System.out.println(s1.substring(3));
       System.out.println(s1.substring(0,3));
       System.out.println(s2.equalsIgnoreCase(s22));
       System.out.println(s1.equalsIgnoreCase(s11)); //here s1 referring to updated L..N
       System.out.println(s2.isEmpty());
       s1.contains("r");



       // "," is a delimer
       String tickersString = "AAPL,AMD,PL";
       System.out.println(tickersString);
       String[] tickerArray = tickersString.split(",");
        for (String eachString : tickerArray){
            System.out.println(eachString); // wherever it see the ',' it breaks there and gives it as output
        }



















   }

























}
