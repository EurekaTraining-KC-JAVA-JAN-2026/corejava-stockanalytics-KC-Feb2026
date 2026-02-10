import java.sql.SQLOutput;

public class ArraysPlayGround {
     public static void main(String[] args) {
         int i =10;
         String s1 = "Eureka";
         // size of array is dynamic
         int[] numArray = new int[]{10,20,30,40,50}; // it is empty array
         // type array nameofIt new int[size]{value}
         int[] numArray2 = {1,2,3,4,5};
         System.out.println(numArray.length);
         System.out.println(numArray);
         //loop
         //y++ , ++y, --y, y--
         for (int y=0;y<=numArray.length-1;y++){
             System.out.println(numArray[y]);
         }
         //for-each
         for (int eachNumber:numArray){
             System.out.println("sq's of num is numArray :"+eachNumber*eachNumber);
         }


    }
}
