public class Assignment2 {
    public static void main(String[] args) {


      /*
    === Post and Pre increment
    - i++ → use the number first, then add 1
    - ++i → add 1 first, then use the number

    === Post and Pre decrement
    - i-- → use the number first, then subtract 1
    - --i → subtract 1 first, then use the number
      */


        // Post Increment
        int a=10;
        System.out.println(a);
        a++;
        System.out.println(a);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside loop: " + i);
        }

        // Pre Increment

        int b=10;
        System.out.println(b);
        ++b;
        System.out.println(b);
        System.out.println(b);

        for (int i = 1; i <= 5; ++i) {
            System.out.println("Inside loop: " + i);
        }

        // Post decrement

        int c=10;
        System.out.println(c);
        c--;
        System.out.println(c);

        for (int i = 5; i >= 1; i--) {
            System.out.println("i--: " + i);
        }

         // Pre‑decrement

        int d=10;
        System.out.println(d);
        --d;
        System.out.println(d);
        System.out.println(d);

       for (int i = 5; i >= 1; --i) {
          System.out.println("--i: " + i);
       }









        }

}
