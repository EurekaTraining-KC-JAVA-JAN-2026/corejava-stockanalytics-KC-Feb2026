public class ArraysPlayGround {
    public static void main(String[] args) {

        // Why we have array's
        int i = 10;
        String s1 = "Eureka";

        // To hold multiple values , we have arrays
        // Array's on primitive and non-primitives
        // Size of an array is dynamic
        int[] numArray = new int[]{10,20,30,40,50};   // It is an Empty array          // One way to create an Array

        // type array nameOfIt new int[size]{values}
        int[] numArray2 = {1,2,3,4,5};                                                 // Another way to create an Array
        System.out.println(numArray.length);
        //
        System.out.println(numArray);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);                                     // Reducing the time to print the lines
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);


        // Loop
        // 10 20 30 40 50 a
        // 0 1 2 3 4 5 => Index starts from Zero
        // 1 2 3 4 5 6 => Length
        //Init condition updating
         // y++
        // ++y
        // --y
        // y--

        // Basic for-loop
        for (int y=numArray.length-1;y>=0;y--){                               //  We are having Initialize the condition
            System.out.println(numArray[y]);
        }

        // for-each loop
        for (int eachNumber:numArray){
            System.out.println("Sq's of nums in numArray : "+eachNumber*eachNumber);
        }
    }
}
