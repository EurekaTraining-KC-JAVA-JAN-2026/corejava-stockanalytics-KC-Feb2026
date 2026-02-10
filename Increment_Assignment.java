public class Increment_Assignment {
    public static void main(String[] args) {

        // PRE INCREMENT (++i)
        System.out.println("PRE INCREMENT (++i)");
        for(int i = 0; i < 5; ++i) {
            System.out.println("Value of i: " + i);
        }
        System.out.println("---------------------");

        // POST INCREMENT (i++)
        System.out.println("POST INCREMENT (i++)");
        for(int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }

        System.out.println("---------------------");

        // PRE DECREMENT (--j)
        System.out.println("PRE DECREMENT (--j)");
        for(int j = 5; j > 0; --j) {
            System.out.println("Value of j: " + j);
        }

        System.out.println("---------------------");

        // POST DECREMENT (j--)
        System.out.println("POST DECREMENT (j--)");
        for(int j = 5; j > 0; j--) {
            System.out.println("Value of j: " + j);
        }

        System.out.println("---------------------");

        // Showing real difference outside loop
        int a = 10;
        int b = 10;

        System.out.println("POST increment a++: " + a++);
        System.out.println("After a++ value: " + a);

        System.out.println("PRE increment ++b: " + ++b);
        System.out.println("After ++b value: " + b);

        int c = 10;
        int d = 10;

        System.out.println("POST decrement c--: " + c--);
        System.out.println("After c-- value: " + c);

        System.out.println("PRE decrement --d: " + --d);
        System.out.println("After --d value: " + d);

    }
}
