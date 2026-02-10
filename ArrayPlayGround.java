public class ArrayPlayGround {
    public static void main(String[] args) {
        int i=10;
        String s1="Eureka";
        //to hold multiple values we have Arrays
        //Arrays on primitive and non-primitive
        //size of an array is dynamic
        int[] numArray=new int[]{10,20,30,40,50};
        //type arrayname = new int[size]{Values};
        int[] numArray2={1,2,3,4,5};
        System.out.println(numArray.length);
        System.out.println(numArray);
        //loop
        for(int y=0;y<=numArray.length-1;y++){
            System.out.println(numArray[y]);
        }
        //for each loop

    }
}
