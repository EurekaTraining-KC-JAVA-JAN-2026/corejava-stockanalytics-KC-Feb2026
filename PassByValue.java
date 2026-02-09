public class PassByValue {
    public static void main(String[] args) {
        int x=20;
        System.out.println(System.identityHashCode(x));
        //here java will pass the value;copy 20 pass it to update()
        int y=update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
        System.out.println(y);
        System.out.println(System.identityHashCode(y));
    }
    static int update(int a){
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a=40;
        System.out.println(a);
        return a;
    }
}
