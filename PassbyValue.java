public class PassbyValue {
    public static void main(String[] args){
        int a = 10;
        update(a);
        System.out.println(a);

    }

    static void update(int x) {
        x = 20;
        System.out.println(x);
    }
}


//if you update the int(using Update())java will not pass reference Number it will only pass the Copied Value of it

