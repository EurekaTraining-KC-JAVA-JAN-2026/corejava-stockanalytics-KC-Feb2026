public class PassByValue {
// Java is a pass by value
    public static void main(String[] args){
        int x =20; //Memory is not created if a variable is not initialized
        update(20);// It passes the value only, not the ref
        //if it passes the ref then the x value gets updated
        //Java will not pass the ref value to other methods directly
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
        System.out.println(System.identityHashCode(x));
    }
    static void update(int a) {
        //before assigning thr new 'a' value
        System.out.println(System.identityHashCode(a));
        System.out.println(a);
        a =40;
        //After assigning
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
    }
}
