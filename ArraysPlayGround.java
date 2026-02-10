public class ArraysPlayGround {
    public static void main(String[] args) {
        //y arrays
        int i = 10;
        String s1 = "Eureka";
        //arrays are to hold multiple values
        //arrays on primitive and non-primitive
        int [] numArray1 = new int[]{10,20,30,40,50};
        //array sizw is dynamic
        //it is empty array
        //type array name of it nd new int[size]{values}
        int[] numArray2 ={1,2,3,4,5};
        System.out.println(numArray1.length);
        System.out.println(numArray1);
        //loop initialization ,y is iterator need to intialize first,point to index 0
        for(int y = 0;y<=numArray1.length-1;y++){// it will throe array out of bound index
            System.out.println(numArray1[y]);
        }
        //y=4,y=3,y=2,y=1,y=0 --
        for(int x = 0;x<=numArray1.length-1;x++){// it will throe array out of bound index
            System.out.println(numArray1[x]);
        }
        // initializeation condition updating
        // y++,--yy,y--,++y
        //for each loop
        //for(datatype name:array){}
        for(int eachnumber:numArray1){
            System.out.println("squares of nums in array : "+eachnumber*eachnumber);
        }




    }
}
