public class Assignment2 {
    public static void main(String[] args) {
        /*
        pre increment ,post increment ,pre decrement post decrement
        pre - the value will change first(++a,--a)
        post - it will use the value  (a++,a--) and changes value after performing
         */
        //just printing values to understand
        int a=5;
        //post incre
        System.out.println("printing  strting value of a"+ " "+a);//5
        System.out.println("printing by pre-increment:"+" "+ (++a));//6
        System.out.println("printing after pre-increment value of a"+a);//6
        //post incre
        System.out.println("printing  value before post incr "+ " "  +a);//6
        System.out.println("printing by post-increment:"+" "+ (a++));//6
        System.out.println("print after post increment value"+a);//7
        //pre decrement so first it will change the value before printing by
        System.out.println("printing  value before pre-decre of a"+ " "+a);//7
        System.out.println("printing by pre-decrement:"+" "+ (--a));//6
        System.out.println("printing after pre decrement value of a"+a);//6
        //post dec it will frst take a value and after printing it will  change
        System.out.println("printing  value before post decr of a"+ " "+a);//6
        System.out.println("printing by post-decrement:"+" "+ (a--));//6
        System.out.println("print after post decrement value of a"+" "+a);//5

//        //using loops
//        int[] arr ={10,30,50,20,40};
//        //post increment of y (vlue will change frst and use)
//        for(int y=0;y<arr.length;y++){
//            System.out.println(arr[y]);
//        }
//


    }
}
