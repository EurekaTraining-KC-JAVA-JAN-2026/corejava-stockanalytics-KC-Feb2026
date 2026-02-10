public class ArraysPlayGround {
    public static void main (String[] args){
        int i = 10;
        String s1 = "Eureka";
        //it hold multiple values we have arrays
        //array on primitive and non primitives
        //size of an array is dynamic
        int[] numArray = new int[]{10,20,30,40,50};//empty array
        //type array nameOfIt new int[size]{values}
        int[] numArray2 = {1,2,3,4,5};
        System.out.println((numArray.length));
        System.out.println(numArray);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);
        //loops
        //initialization condition updating
        //basic for loop

        for (int y = numArray.length - 2; y >= 0; y -= 2) {
            System.out.println(numArray[y]);
        }
        //for -each
        for (int eachNumber:numArray){
            System.out.println("Sq's of nums in numArray: " +eachNumber*eachNumber);

        }
    }
}
