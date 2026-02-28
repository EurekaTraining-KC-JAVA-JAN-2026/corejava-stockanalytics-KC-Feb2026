public class PassByValue {
    //java is an pass by value
    public static void main(String[] args) {
        int x ;
        x= 20;

        /**
         * x = 20
         * 179...    20
         */
        System.out.println(System.identityHashCode(x));
        //here java will pass the value,;; copy 20 pass it update()
        /**
         * java will not directly pass the ref. no. to other methods,
         * it will only pass the copied value of it.
         */
        update(x);
        System.out.println("Original Ref Value ");
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        /**
         * before if you print acsi value its showing the same ref,..
         */
        System.out.println("Before getting the updated");
        System.out.println(System.identityHashCode(a));
        a=40;
        System.out.println(a);
        System.out.println("After getting updated");
        System.out.println(System.identityHashCode(a));

    }
}