public class ArraysPlayGround {

    public static void main(String args[]) {
        //To hold multiple ways we have array.
        //1. Arrays on primitive and non-primitives.
        int[] numArray = new int[]{10,20,30,40}; //Here, the size of the array is dynamic.

        //type array nameOfIt new int[size]{value}
        int[] numArray2 = {1,2,3,4};

        int[] nums;

        nums = new int[]{2,3,4,5};

        System.out.println(numArray2.length);
        //System.out.println(numArray2);

        System.out.println("Printing the array");
        for(int i = 0 ; i < numArray2.length; i++) {
            System.out.println(numArray2[i]);
        }

        System.out.println("Skipping the index 1");
        for(int i = 0 ; i < numArray2.length; i = i + 2) {
            System.out.println(numArray2[i]);
        }

        for (int i = numArray2.length; i >= 0 ; i++) {
            System.out.println(numArray2[i]);
        }

        System.out.println("printing the array in reverse");
        for(int i = numArray2.length - 1 ; i >= 0; i--) {
            System.out.println(numArray2[i]);
        }
        /**
         * Intialization condition updating
         * y++
         * ++y
         * --y
         * y--
         */

        //for-each
        for (int num : numArray2) {
            System.out.println(num*num);
        }
    }

}
