public class ArraysPlayGround {
    public static void main(String[] args){
    int i=10;
    String s1="Eureka"; ///to hold multiple values we have arrays
        int[] numArray=new int[]{10,20,30,40,50};//it is empty//size of array is dynamic
        //type array name of it new int[size]{value}
        int[] numarray2={1,2,3,4,5};
        System.out.println(numArray.length);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);
       // System.out.println(numArray[5]);


        //length starts from 1
        for(int y=numArray.length-1;y>=0;y--){
            System.out.println(numArray[y]);
        }
//for each
        for(int eachNumber:numArray){
           System.out.println ("sq of num in numarray"+eachNumber+eachNumber);
        }
}
}
