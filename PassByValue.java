public class PassByValue {
    public static void main(String[] args) {
        int x =20;
        update(x);
        System.out.println(x);
    }
    public static void  update(int a){
        a =100;
    }

}
