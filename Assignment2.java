public class Assignment2 {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};

        //post increment
        for (int y = 0; y <= numArray.length - 1; y++) {
            System.out.println(numArray[y]);

        }
        //pre increment
        for (int y = 0; y <= numArray.length - 1; ++y) {
            System.out.println(numArray[y]);

        }
        //post decrement
        for (int y = numArray.length - 1;y>=0; y--)
        {
            System.out.println(numArray[y]);
        }
        //pre decrement
        for (int y = numArray.length - 1;y>=0; --y)
        {
            System.out.println(numArray[y]);
        }
    }
}
