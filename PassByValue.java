public class PassByValue {
    public static void main(String[] args){
        int x=20;
        System.out.println(System.identityHashCode(x));
        update(x);
        System.out.println(x);
        System.out.println(System.identityHashCode(x));
    }
    static void update(int a){
        System.out.println(System.identityHashCode(a));
        a=40;
    }
}
