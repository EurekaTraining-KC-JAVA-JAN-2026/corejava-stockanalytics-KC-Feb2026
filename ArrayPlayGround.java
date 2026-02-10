public class ArrayPlayGround {
    static void main(String[] args) {
        // why we have array's
        int i=10;
        String s1 ="Eureka";
        //

        // size of an array is dynamic
        int[] numArray= new int[]{10,20,30,40,50};  // it is an empty arr
        //type array nameOfIt new int[size]{values}
        int[] numArray2={1,2,3,4,5};

        System.out.println(numArray.length);
        System.out.println(numArray);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);
        System.out.println(numArray[4]);


        //loop
        // initalization, condition, updating
        //y++
        // ++y
        //y--
        //--y
        // for loop
        System.out.println("_-----------------------------");
     for(int y=0;y<(numArray.length-1);y++){
            System.out.println(numArray[y]);
        }



        // for-each
        for(int eachNumber:numArray){
            System.out.println(("sq's of nums in numArray "+eachNumber*eachNumber));
        }


    }
}
