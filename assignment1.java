import java.sql.SQLOutput;

public class assignment1 {
    public static void main(String[] args)
    {
        threeArgmethod("Pavan","Kumar",33.34f);
        String returnedVal = threeArgmethod("Uppu",45.45f,"Pavan");
        System.out.println(returnedVal);
        String concatedString = threeArgmethod(45.42f, " Kumar", "Pavan");
        System.out.println(concatedString);
    }
    public static void threeArgmethod(String s1, String s2, float f1)
    {
        System.out.println("The concatenation of the 3 arguments is " +s1 + " "+ s2+ " " + f1);;
    }
    public static String threeArgmethod(String s1, float f1, String s2)
    {
        String added = s1 +" "+ s2 +" "+ f1;
        return added;
    }
    public static String threeArgmethod( float f1, String s1, String s2)
    {
        String conv = String.valueOf(f1);
        String added = s2.concat(s1).concat(conv);
        return added;
    }
}
