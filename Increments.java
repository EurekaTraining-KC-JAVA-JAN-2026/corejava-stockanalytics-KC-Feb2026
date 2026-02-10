public class Increments {
    public static void main(String[] args) {
        
                //Post Increment (Loop)
                for(int i=0; i< 5; i++){
                    System.out.println(i);
                }

                int a = 1;
                System.out.println(a++);//use First & then Increment
                System.out.println(a);

                //PreIncrement(Loop)
                for(int i=0; i< 5 ; ++i){
                    System.out.println(i);
                }

                int b = 2;
                System.out.println(++b);//Increment First & Then Use
                System.out.println(b);

                //PostDecrement(Loop)
                for(int i=5; i> 0; i--){
                    System.out.println(i);
                }

                int c= 3;
                System.out.println(c--);//use First & then Decrement
                System.out.println(c);

                //PreDecrement(Loop)
                for(int i=5; i>0 ; --i){
                    System.out.println(i);
                }

                int d= 4;
                System.out.println(--d);//Decrement First & Then Use
                System.out.println(d);
            }
        }
