

public class StringsPlayGround {
   public static void main(String[] args){
//        //strings are immutable
//        String s1="Nikhitha";
//        //it will check the scp(string contsant pool)
//        System.out.println(s1);
//        System.out.println(System.identityHashCode(s1));
//        s1="NikhithaMysolla";
//        //here the pointer is pinting to NikhithaMysolla
//        System.out.println(s1);
//        System.out.println(System.identityHashCode(s1));
//
//        String s2=new String("Nikhitha");
//        System.out.println(System.identityHashCode(s2));

          String  s1= "Nikhitha";
          String s2=new String("Mysolla");
          String s3="";
          System.out.println(s1.concat("").concat(s2));
          System.out.println(s1.charAt(3));
          System.out.println(s1.toUpperCase());
          System.out.println(s1.toLowerCase());
          System.out.println(s1.substring(2));
          System.out.println(s1.substring(2,4));
          System.out.println(s1.equalsIgnoreCase(s2));
          System.out.println(s3.isEmpty());
          System.out.println(s1.toCharArray());






    }


}
