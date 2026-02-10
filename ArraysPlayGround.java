public class ArraysPlayGround {
    public static void main(String[] args) {
        int i =10;
        String s1 = "Eureka";

        int[] numArray = new int[]{10,20,30,40,50};//Empty
        //Type Name      new Int Size Values
        int[] numArray2 = {1,2,3,4,5};
        System.out.println(numArray.length);
        System.out.println(numArray);

//        System.out.println(numArray[1]);
//        System.out.println(numArray[2]);
//        System.out.println(numArray[3]);
//        System.out.println(numArray[4]);
        //System.out.println(numArray[y]);//GiveRefernce Number

        //intialize iterator

        //pre-post Incre/Decre Operators Assignment.


        //Regular For loop
        for (int y =0; y<=numArray.length-1;y++){ //y=y+2 Skips two Nums
            System.out.println(numArray[y]);
        }


        //for each Loop
        for (int eachNumber:numArray){
            System.out.println("Sq's of nums in       numArray: " +eachNumber);


        }
    }
}
