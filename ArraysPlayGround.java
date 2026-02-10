public class ArraysPlayGround {
    public static void main(String[] args) {
        //why we have arrays
        int i = 10;
        String s1 = "eureka";
        //to hold the multiple values we have arrays
        //aaray's on primitive and non-primitives
        // size of an array is dynamic
        int[] numArray = new int[]{10,20,44,87}; //empty array
        // type array nameofit new int[size]{values}
        int[] numArray2 = {1,2,3,4,5};
        System.out.println(numArray2.length);
        System.out.println(numArray);
        //loop
        //initilization condition updating
        //incremental operater y++,//++y,//--y//,y--


        //basic for -loop
        for(int c=0;c<=numArray.length-1;c++){
            System.out.println(numArray[c]);

        }

        //for-loop
        for(int eachNumber:numArray){
            System.out.println("sq's of nums in numArray :"+eachNumber*eachNumber);

        }

        //if we need to take only few indexs on for loop
        for(int c=0;c<=numArray.length-1; c+2) {
            System.out.println(numArray[c]);
        }
         // reverse
        for(int y =numArray.length-1;y>=0;y--){
            System.out.println(y);
        }


    }
}
