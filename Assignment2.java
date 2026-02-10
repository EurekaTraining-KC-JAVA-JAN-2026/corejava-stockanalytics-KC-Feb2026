public class Assignment2 {
    public static void main(String[] args){
        //Post increment --- uses the old value first and then increments after evaluation
        int a = 5;
        int b = 5;
        System.out.println("The value of a after post incrementing is :" + a++);
        System.out.println("The value of a is :" + a);

        //Pre increment --- increments first before evaluation and then updates

        System.out.println("The value of b after post incrementing is :" + ++b);
        System.out.println("The value of b is :" + b);

        //Post Decrement --- uses the old value first and then decrements after evaluation

        int x = 10;
        int y = 10;

        System.out.println("The value of x after post decrementing is :" + x--);
        System.out.println("The value of x is :" + x);

        //Pre decrement ---- decrements first before evaluation and then updates

        System.out.println("The value of y after pre decrementing is :" + --y);
        System.out.println("The value of y is :" + y);

        //for loop
        //post increment

        for(int i=0; i<=5; i++){
            System.out.println("The value of i is :" + i );
        }

        //pre increment

        for(int j=0; j<=5; ++j){
            System.out.println("The value of j is :" + j );
        }

        //post decrement
        for(int c=5; c>=0; c-- ){
            System.out.println("The value of c is :" + c );
        }

        //pre decrement

        for(int d=5; d>=0; --d){
            System.out.println("The value of d is :" + d );
        }

    }
}
