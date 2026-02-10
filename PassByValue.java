//PassByBalue -> By default Java is Pass by value,
public class PassByValue {
    public static void main(String args[]) {
        int x = 20;
        //X-reference value
        System.out.println(System.identityHashCode(x));
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }

    static void update(int a) {
        System.out.println("Before initialization");
        //a is not initialized, so still has x reference value
        System.out.println(System.identityHashCode(a));
        a = 40;
        //a is initialized, so here the reference value changes.
        System.out.println(System.identityHashCode(a));
    }
}

/**
 * pass by value in java means arg values are copied and are passed to the parameters of the mtd.
 * this changes being done in the called method is not affected in the method calling.
 */