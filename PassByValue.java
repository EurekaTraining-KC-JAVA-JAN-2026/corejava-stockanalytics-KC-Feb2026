public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        update(x);
        System.out.println(System.identityHashCode(x));
        //java uses only pass by value : a copied value is passed
    }

    static void update(int a) {
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a = 50;
        System.out.println(a);
        System.out.println(System.identityHashCode(a));

    }
}
