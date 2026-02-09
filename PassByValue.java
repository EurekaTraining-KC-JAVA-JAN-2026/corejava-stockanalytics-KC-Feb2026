public class PassByValue {

    public static void main(String[] args) {
        int x = 20;
        System.out.println("Hashcode :"+System.identityHashCode(x));
        update(x);
        System.out.println("Hashcode :"+System.identityHashCode(x));
        System.out.println();
    }
    static void update(int a){
        System.out.println("Hashcode :"+System.identityHashCode(a));
        a = 40;
    }
}
