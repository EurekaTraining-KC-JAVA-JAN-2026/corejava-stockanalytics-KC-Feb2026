public class pre_post_increment {
    public static void main(String[] args){
        //post increment
        for(int i=0; i< 3; i++){
            System.out.println(i);
        }

        int a = 10;
        System.out.println(a++);
        System.out.println(a);

        // pre increment
        for(int i=0; i<3 ; ++i){
            System.out.println(i);
        }

        int b = 10;
        System.out.println(++b);
        System.out.println(b);

        //post decrement
        for(int i=3; i>0; i--){
            System.out.println(i);
        }

        int c= 10;
        System.out.println(c--);
        System.out.println(c);

        //pre decrement
        for(int i=3; i>0; --i){
            System.out.println(i);
        }

        int d=10;
        System.out.println(--d);
        System.out.println(d);
    }
}
