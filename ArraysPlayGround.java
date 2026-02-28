import java.sql.SQLOutput;

public class ArraysPlayGround {
    public static void main(String[] args) {


    int i = 10;
    String s1 = "Parvthi";

    int[] numArray= new int[] {10,20,30,40,50}; // an empty array [size] { value}

    int[] numArray2 = {1,2,3,4,5,}; // we can specify array like this too and if value is given without the size it can be added itself.

        System.out.println(numArray.length);
        System.out.println(numArray);


        System.out.println("basic loop");
        for (int y=0; y<= numArray.length-1; y++){
            System.out.println(numArray[y]);
        }

        System.out.println("skipping values");

        for (int y=0; y<= numArray.length-1; y=y+2){
            System.out.println(numArray[y]);
        }

        System.out.println(" for each ");

        for (int eachNumber:numArray){
            System.out.println(eachNumber);
            System.out.println(eachNumber*eachNumber);
        }


















    }

    }
