public class ArraysPlayGround {
    static void main(String[] args) {

        int i = 10;
        String s1 = "Eureka";
        //to hold multiple values we have arrays

        int[] numArray0 = new int[]{}; // empty array
        //type array nameOfIt new int[size]{values}
        int[] numArray = new int[]{10,20,30,40,50};

        int[] numArray2 = {1,2,3,4,5};
        System.out.println(numArray.length);
        System.out.println(numArray);
        //loop
        // initialization condition updating
        // y++
        //++y
        //Y--
        //--y
        //basic for-loop
        for (int y=0;y<=numArray.length-1;y++) {
            System.out.println(numArray[y]);
        }
        for (int y = 0; y<=numArray.length-1;y+=2) {
            System.out.println(numArray[y]);
        }
        for (int y=numArray.length-1;y>=0;y--){
            System.out.println(numArray[y]);
        }
        //for-each
        for (int eachNumber:numArray){
            System.out.println("sequence of nums in numArray:"+eachNumber*eachNumber);
        }
    }
}
