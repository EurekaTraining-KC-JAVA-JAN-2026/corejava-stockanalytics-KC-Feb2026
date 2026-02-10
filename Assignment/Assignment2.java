package Assignment;

public class Assignment2 {
    /**
     * Intialization condition updating
     * y++
     * ++y
     * --y
     * y--
     */
    public static void main(String args[]) {
        int a = 2;
        int b = 3;

        //Post increment
        System.out.println("Post increment");
        for (int i = 2; i <  6; i++) {
        System.out.println(i);
        }
        //pre increment
        System.out.println("pre increment");
        for (int i = 2; i <  6; ++i) {
            System.out.println(i);
        }

        System.out.println("-----------");

        //post deccrement
        System.out.println("Post decrement");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        //pre decrement
        System.out.println("Pre decrement");
        for(int i = 5; i > 0; --i) {
            System.out.println(i);
        }

        System.out.println("Before post increment :" + a);
        System.out.println(a++);
        System.out.println("After Post increment :" + a);

        System.out.println("----------------------------");

        System.out.println("Before pre increment: " + b);
        System.out.println("After pre increment: " + ++b);

        System.out.println("----------------------");

        System.out.println("Before post decrement : " + a);
        System.out.println(a--);
        System.out.println("After post decrement : " + a);

        System.out.println("----------------------");

        System.out.println("Before pre decrement : " + b);
        System.out.println("After pre decrement : " + --b);
    }
}

