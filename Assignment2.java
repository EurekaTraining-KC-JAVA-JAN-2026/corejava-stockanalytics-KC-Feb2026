public class Assignment2 {
    public static void main (String[] args){
        int i = 5;
        int j = ++i;
        //pre increment
        System.out.println("Pre increment");
        System.out.println("The value of i is " +i); //pre increment
        System.out.println("The value of j is " +j); //the value of i will be assigned to j
       //post increment
        int a = 5;
        int b= a++;
        System.out.println("post increment ");
        System.out.println("The value of a is " +a);
        System.out.println("the value of b is " +b);
        //pre decrement
        int c = 5;
        int d = --c;
        System.out.println("pre decrement");
        System.out.println("The value of c is " +c);
        System.out.println("The value of d is " +d);

        //post decrement
        int e = 5;
        int f = e--;
        System.out.println("post decrement");
        System.out.println("The value of e is " +e);
        System.out.println("The value of is " +f);

        }
    }

