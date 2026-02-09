public class PassByValue {
    public static void main(String[] args){
        //java is pass by value
        int x=20;
        /**
         * x=20
         *java will not directly pass the refnum to other methods
         * it will only pass the copied value of it
         * before assignment if you print ASCII value its showing the same ref.
         *
         */
        System.out.println(System.identityHashCode(x));
        //here java will pass the value;
        // copy value of 20 and pass it to update()
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        //System.out.println("Before getting updated");
        a=40;
        System.out.println(a);

    }

}
