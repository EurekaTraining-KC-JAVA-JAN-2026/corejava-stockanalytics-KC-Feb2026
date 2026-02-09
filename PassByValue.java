public class PassByValue {
    // java is a pass by value
    public static void main(String[] args){
        int x =20;
        System.out.println(System.identityHashCode(x));

        // here java will pass the value    ;;; copy 20 pass it to update


        // java will not directly pass  the ref
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
    }
    static void update(int a){
        System.out.println(System.identityHashCode(a));
        a=40;
        System.out.println(System.identityHashCode(a));


    }

}
