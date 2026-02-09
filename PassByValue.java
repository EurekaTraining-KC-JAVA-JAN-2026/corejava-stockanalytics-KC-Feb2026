public class PassByValue {
    public static void main(String[] args){
        int x = 20;
        System.out.println(System.identityHashCode(x));
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);

        /**
         * java will not pass the ref no to other methods
         * it will pass copy of the value
         */
    }
    static void update(int a){
        System.out.println(System.identityHashCode(a));
        a = 40;
        System.out.println(System.identityHashCode(a));
    }
}
