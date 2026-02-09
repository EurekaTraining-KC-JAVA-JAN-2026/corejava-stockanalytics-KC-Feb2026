public class PassByValue {
    //java is an pass by value
    public static void main(String[] args){
        int x=20;
        /**
         * java will not directly pass the reference number to other methods,
         * it will only pass copied value of it
         * 2065951873     20
         */
        System.out.println(System.identityHashCode(x));
        //Here java will pass the value, :: copy 20 pass it update()
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);

    }
    static void update(int a){
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a=40;
    }
}
