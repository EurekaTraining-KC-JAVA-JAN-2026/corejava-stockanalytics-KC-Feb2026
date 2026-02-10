import java.sql.Array;

public class Iterators {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        System.out.println("printing an array by incrementing:");
        for(int i=0;i<arr1.length;i++){
            System.out.println(i+ " element "+arr1[i]);
        }
        System.out.println("printing an array by Decrementing:");
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(i+ " element "+arr1[i]);
        }

        //showing incrementing example;
        int a=1,b=1;
        int c=a+b;
        System.out.println("sum of a and b is:"+c);
        c=++a + b;
        System.out.println("a value pre increment: " +a);
        System.out.println(c);
        c= a++ +b;
        System.out.println("sum of a and b is: "+c);
        System.out.println("a value post increment " +a);
        a=1;
        b=1;
        c=a+b;
        System.out.println("sum of a and b is:"+c);
        c=--a + b;
        System.out.println("a value pre decement is: " +a);
        System.out.println(c);
        c= a-- +b;
        System.out.println("sum of a and b is: "+c);
        System.out.println("a value post decrement " +a);

    }

}
