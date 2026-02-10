public class ArrayPlayGround {
    public static void main(String[] args) {
        //why we have array's
        int i = 40;
        String s1 = "Eureka";
        //multiple arrays can be stored in array
        //Array's on primitives and non-primitives
        //Size of an array is dynamics
        int[] numArray = new int[]{10, 20, 30, 40, 50};
        //Type array name of it new int[size] {values}
        int[] numArray2 = {1, 2, 3, 4, 5};

        {
            System.out.println(numArray.length);
            System.out.println(numArray);

            //loop
            for (int y = numArray.length - 1; y >= 0; y--) {
                System.out.println(numArray[y]);
            }
            for (int eachNumber:numArray){
                System.out.println("sq's of num is numArray :"+eachNumber*eachNumber);
            }
        }
    }

}
