import java.util.Arrays;
public class ArraysPlayGround {
    public static void main(String[] args) {
        int[] numArray = {10, 20, 30, 40, 50};

        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);

        // loop
        //  E  u  r  e  k  a
        //  0  1  2  3  4  5  => indexing starts from Zero
        //  length = 6
        // initialization   condition   updating
        for (int y = 0; y < numArray.length; y++) {
            System.out.println(numArray[y]);
        }

        // Basic for-loop (printing in reverse order)
        for (int y = numArray.length - 1; y >= 0; y--) {
            System.out.println(numArray[y]);
        }

        // For-each loop (printing squares of numbers)
        for (int eachNumber : numArray) {
            System.out.println("Sq's of nums in numArray: " + eachNumber * eachNumber);
        }

        int[] arr={15,30,45,60,75,90};
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            System.out.println("Pre increment" + (++arr[i]));
            System.out.println("Postincrement " + (arr[i]++));
            System.out.println("Predecrement " + (--arr[i]));
            System.out.println("Postdecrement " + (arr[i]--));
            System.out.println("Final value" + arr[i]);
        }
        System.out.println("\n"+ Arrays.toString((arr)));
    }
}