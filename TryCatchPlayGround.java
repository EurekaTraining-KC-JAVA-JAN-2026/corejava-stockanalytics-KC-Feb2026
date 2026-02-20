public class TryCatchPlayGround {
    public static void main(String[] args){
        int i =10;
        try{
            System.out.println("dividing by zero:" + 10/0);

        }catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
        }finally{
            System.out.println("I dont care what you are trying, i will run");
            //connection.close();
        }

        int j=20;
        System.out.println("dividing by i:" +20/i);
    }
}

/** benifits of try and catch is user can see what actually happening
 * it will excute normally , if error it will pass it to catch block
 * application  won't get interrupted, it simply
 * if we are expecting an error put it in try catch block
 *
 */





