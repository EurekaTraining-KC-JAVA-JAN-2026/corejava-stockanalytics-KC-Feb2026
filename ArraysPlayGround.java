public class ArraysPlayGround {
    public static void main(String[] args)
    {
        int i =10;
        String s1 = "Eureka";

        int[] numArray = new int[]{10,29,44,53};

        int[] numArray2 = {1,22,55,66,3};
        System.out.println(numArray.length);
        System.out.println(numArray);

        //loop
        for(int x=0; x< numArray.length ; x++){
            System.out.println(numArray[x]);
        }
        for(int eachNumber : numArray){
            System.out.println("Squares of each num in array is :"+eachNumber*eachNumber);
        }
        for(int x=numArray2.length-1;x>=0 ; x--){
            System.out.println(numArray2[x]);
        }
    }
}
