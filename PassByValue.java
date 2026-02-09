public class PassByValue {
    // java is an pass by value
    public static void main(String[] args){
        int x = 20;
        /**
         * * x =20
         * 179... 20
         */
        System.out.println(System.identityHashCode(x));
        //here java will pass the value; copy 20 pass it update()
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        a = 40;
        System.out.println(a);
    }
}