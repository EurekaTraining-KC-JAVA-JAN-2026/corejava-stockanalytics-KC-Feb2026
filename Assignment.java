public class Assignment {
    public static void main(String[] args) {
        con("Rajan", "Bhargav", 31.31F);
        con("Rajan",31.31F, "Souda");
        String s = con(31.31F,"Souda ", "Rajan");
        System.out.println(s);
    }
    public static void con(String s1, String s2, float fl )
    {
        System.out.println(s1 + " " + s2  + " " + fl);
    }

    public static String con(float fl ,String s1, String s2)
    {
        String conversion = String.valueOf(fl);
        String addn = s2.concat(s1);
        String fin = addn.concat(conversion);
        return fin;

    }
    public static void con(String s1, float fl , String s2)
    {
        String conc = s1 + " " + s2 + " " + fl;
        System.out.println(conc);

    }
}