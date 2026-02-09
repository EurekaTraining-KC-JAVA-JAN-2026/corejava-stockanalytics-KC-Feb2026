public class PassByValue {
    static void main(String[] args) {
        int x=20;
        update(x);
        System.out.println(x);
    }

    static void update(int a){
        a=40;
    }

}
