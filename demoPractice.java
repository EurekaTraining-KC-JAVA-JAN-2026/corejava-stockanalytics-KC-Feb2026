public class demoPractice {

//     static int x =10;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(System.identityHashCode(a));
        a=20;
        System.out.println(System.identityHashCode(a));

    }
}
