public class Operators {
    public static void main(String[] args){


        //pre-increment:first it will increment the value and then it will assign the value
         int x=5;
         int y=++x;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        //post-increment:first it will assign the value and then it will increment
        x=5;
        y=x++;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        //pre-decrement: first it will decrement the value and then assign the value
        x=5;
        y=--x;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        //post-decrement: first it will assign the value and then decrement the value
        x=5;
        y=x--;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
    }
}
