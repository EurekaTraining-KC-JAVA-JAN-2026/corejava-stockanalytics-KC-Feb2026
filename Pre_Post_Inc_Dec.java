public class Pre_Post_Inc_Dec {
    public static void main(String[] args){
        int x=5;

        System.out.println(x++); //post-increment
        System.out.println(++x); //pre-increment
        System.out.println(x--); //post-decrement
        System.out.println(--x); //pre-decrement
        System.out.println("This is post increment");
        int a=2;
        int b=a++;
        System.out.println(a);
        System.out.println(b); //post-increment
        System.out.println("This is pre increment");
        int c=2;
        int d=++c;
        System.out.println(c);
        System.out.println(d); //pre-increment
        System.out.println("This is post decrement");
        int e=2;
        int f=e--;
        System.out.println(e);
        System.out.println(f); //post-decrement
        System.out.println("This is pre increment");
        int g=2;
        int h=--g;
        System.out.println(g);
        System.out.println(h); //pre-decrement
        System.out.println("In for loops");
        for(int i=1;i<=3;i++){
            System.out.println(i);
        } //works the same with pre-increment

        for(int j=3;j<=1;j--){
            System.out.println(j);
        } //works the same with pre-decrement












    }
}
