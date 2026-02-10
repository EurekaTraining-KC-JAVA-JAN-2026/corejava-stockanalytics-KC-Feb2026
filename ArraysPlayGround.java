public class ArraysPlayGround {
    public static void main(String[] args) {
        //to hold multiple values we have array
        //array on primitive and non primitive
        //size of array is dynamic
        int[] numArray = new int[]{10,20,30,40,50};//empty
 //     type  array nameOfIt new int[size]{value}
        int[] numArray2= {1,2,3,4,5};
        System.out.println(numArray.length);
        System.out.println(numArray);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);
        //loop
        //basic for loop
        for (int y=0;y<=numArray.length-1;y++){
            System.out.println(numArray[y]);
        }

        //for-each loop
        for (int eachNumber:numArray){
            System.out.println("sq's of nums in numArray : "+eachNumber*eachNumber);
        }
    }
}
