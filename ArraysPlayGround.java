import java.sql.SQLOutput;

public class ArraysPlayGround {
    public static void main(String[] args){
        //why we have arrays
        //int i = 10,20;
        String s1 = "Eureka";
        //to hold multiple we have arrays
        //arrays on primitives and non-primitives
        int[] numArray = new int[]{10,20,30,40,50};
        //this is empty array
        //size of an array is dynamic
        //type array nameOfIt new int[size]{values}
        int[] numArray2 = {2,3,4,5,6};
        System.out.println(numArray.length);
        System.out.println(numArray);
        //loop
        //for(initialization,condition,update)
        //inc/dec - y++,++y,y--,--y
        //for(int y=numArray.length-1;y=0;y--){
        //            System.out.println(numArray[y]);
        //        }
        for(int y=0;y<=numArray.length-1;y++){
            System.out.println(numArray[y]);
        }
        //for-each
        for(int eachNumber:numArray){
            System.out.println("Sq's of number in numArray'"+eachNumber*eachNumber);

            //delimiter
            String tickerString = "AAPL,AMD,TSLA";//here"," is a delimiter
            String[] tickerArray = tickerString.split(",");
            for(String eachString : tickerArray){
                System.out.println(eachString);
            }
            System.out.println(tickerArray);

            /**
             * (String[] args) = for the output to get printed in command line
             * it only has chars
             */
        }
    }
}
