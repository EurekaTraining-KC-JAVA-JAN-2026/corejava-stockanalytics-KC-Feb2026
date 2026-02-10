import java.sql.SQLOutput;

public class operators {
     public static void main( String[] args) {
        int a = 20;
        int b = 30;
        // pre-increment
         System.out.println("Pre-increment");
         System.out.println(a +" "+ ++a);
         //post-increment
         System.out.println("post-increment");
         System.out.println(b +" "+ ++b);

         int x = 56;
         int y = 65;
         // pre-decrement
         System.out.println("pre-decrement");
         System.out.println(x + " "+ --x);
         System.out.println(y + " "+ --y);
         // post-decrement
         System.out.println("post-decrement");
         System.out.println(y + " "+ y--);
         System.out.println(x + " "+ x--);


    }
}
