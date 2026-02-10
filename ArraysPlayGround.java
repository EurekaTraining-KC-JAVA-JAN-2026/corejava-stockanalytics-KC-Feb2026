public class ArraysPlayGround {
    public static void main (String[] args) {


        int i = 10;
        String s1="Eureka";
        // to hold multiple values we have concept of arrays
        //arrays on primitives and non primitives
        //size of an array is dynamic

        int[] numArray = new int[]{10, 20, 30, 40};//empty array
        //type array nameOfIt new int[size] {values}

        int[] numArray2 = {1, 2, 3, 4, 5};
        System.out.println(numArray.length);


        System.out.println(numArray);
        // loop

        //intialization condition updating
        //y++
        //++y
        //--y
        //y--

        //basic for-loop


        for (int y = 0; y <= numArray.length - 1; y = y + 2) {
            System.out.println(numArray[y]);

        }
        //for each
        for (int eachNumber : numArray) {
            System.out.println("Sq's of nums is numArray:" + eachNumber * eachNumber);


        }


    }



}
