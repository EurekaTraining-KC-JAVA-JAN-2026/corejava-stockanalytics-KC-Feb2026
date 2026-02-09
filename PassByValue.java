public class PassByValue {
    /**
     * java is a pass by value by default
     * java will not directly pass the reference  num to the methods
     * it will only pass the copied value of it
     */

    public static void main(String[] args) {
        int x=20;
        System.out.println(System.identityHashCode(x));
        //java will pass value ;: copy 20 and pass it to update()
        update(x);// copying value
        System.out.println("original ref value");
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        /**
         * before if you print asci value its showing
         */
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a=40;
        System.out.println();
        System.out.println(a);
       System.out.println(System.identityHashCode(a));

    }

}
