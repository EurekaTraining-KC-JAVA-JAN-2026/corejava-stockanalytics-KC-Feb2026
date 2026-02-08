public class Assignment {
    public static void main(String[] args) {
        paramConcat("Avengers", "Assemble", 20.19F);
        String str = paramConcat("Assemble",20.19F, "Avengers");
        System.out.println(str);
        String str2 = paramConcat(20.19F,"Avengers ", "Assemble ");
        System.out.println(str2);
    }
    public static void paramConcat(String s, String t, float f )
    {
        System.out.println(s + " " + t  + " " + f);
    }
    public static String paramConcat(String t, float f , String s)
    {
        String conc = s + " " + t + " " + f;
        return conc;

    }
    public static String paramConcat(float f ,String t, String s)
    {
        String addn = t.concat(s).concat(String.valueOf(f));
        return addn;

    }
}
