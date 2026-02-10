public class IncDec {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};


        System.out.println("Post Increment");
        for (int y = 0; y <= a.length - 1; y++) {

            System.out.println(a[y]);

        }

        System.out.println("Pre Increment");
        for (int y = 0; y <= a.length - 1; ++y) {
            System.out.println(a[y]);


        }
        System.out.println("Post Decrement");
        for (int y = a.length - 1;y>=0; y--) {

            System.out.println(a[y]);

        }
        System.out.println("Pre Decrement");
        for (int y = a.length - 1;y>=0; --y)
        {
            System.out.println(a[y]);
        }

        //Example
        int b= 3;
        System.out.println(--b + 5);

    }
}