public class ArraysPlayGround {
    public static void main(String[] args) {
        //why we have array's
        int i = 10;
        String s1 = "Eureka";
        //to hold mutlipe values we have arrays
        //array's on primitive and non-primitives
        //size of an array is dynamic
        int[] numArray = new int[]{10,20,30,40,50};// it is an empty
//      type array nameOfIt new int[size]{values}
        int[] numArray2 = {1,2,3,4,5};
        System.out.println(numArray.length);
        //
//        System.out.println(numArray);
//        System.out.println(numArray[0]);
//        System.out.println(numArray[1]);
//        System.out.println(numArray[2]);
//        System.out.println(numArray[3]);
//        System.out.println(numArray[4]);

        //loop
        //  10   20   30   40   50   a
//          0   1   2   3   4   5 => indexing starts from ZEro
//          1   2   3   4    5  6 => this length
//        initilzation condition updating
        // y++
//        ++y
//        --y
//        y--
        //basic for-loop
        for (int y=numArray.length-1;y>=0;y--){
            System.out.println(numArray[y]);
        }
        //for-each
        for (int eachNumber:numArray){
            System.out.println("Sq's of nums in numArray :"+eachNumber*eachNumber);
        }

    }
}