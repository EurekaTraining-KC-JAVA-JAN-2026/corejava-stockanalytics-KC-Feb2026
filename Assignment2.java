public class Assignment2 {

    public static void main(String[] args) {

        // ---------------- PRE INCREMENT (++i) ----------------
        // Value is incremented first, then used
        for (int i = 0; i < 5; ++i ) {
            System.out.println("Pre Increment (++i): " +i);
        }

        System.out.println("---------------");

        // ---------------- POST INCREMENT (i++) ----------------
        // Value is used first, then incremented
        for (int i = 0; i < 5; i++ ) {
            System.out.println("Post Increment (i++): " +i);
        }

        System.out.println("---------------");

        // ---------------- PRE DECREMENT (--j) ----------------
        // Value is decremented first, then used
        for (int j = 5; j > 0; --j ) {
            System.out.println("Pre Decrement (--j): " +j);
        }

        System.out.println("---------------");

        // ---------------- POST DECREMENT (j--) ----------------
        // Value is used first, then decremented
        for (int j = 5; j > 0; j--) {
            System.out.println("Post Decrement (j--): " +j);
        }
    }
}
