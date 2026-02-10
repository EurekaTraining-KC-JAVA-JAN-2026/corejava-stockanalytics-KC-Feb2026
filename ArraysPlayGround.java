public class ArraysPlayGround {
    public static void main(String[] args) {
        //why we have arrays
        int i =0;
        //to hold multiple values we have arrays
        //arrays on primitive and non-primitive
        //size of an array is dynamic
        int[] numArray = new int[]{10,20,30,40,50};
        //type arrays nameof it new[size]{values}
        int[] numArray2 = {1,2,3,4,5};
        System.out.println(numArray.length);
        //loop
        for(int j=0;j<=numArray.length-1;j=j+2){
            System.out.println(numArray[j]);
        }
        for(int a = numArray.length - 1; a >= 0; a--){
            System.out.println(numArray[a]);
        }
        //for-each
        for(int eachNumber : numArray){
            System.out.println("Each Number : "+ eachNumber);
        }
    }
}
