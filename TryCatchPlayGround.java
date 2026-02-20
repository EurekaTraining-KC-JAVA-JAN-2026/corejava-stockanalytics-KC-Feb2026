public class TryCatchPlayGround {
    public static void main(String[] args) {
        /**
         * benifits of try catch
         * 1) user can see what actually happening
         * 2) application wont get interupted
         */
        //if we know any errors then we need to keeep them in try catch block

        int i =10;
        try {
            System.out.println("dividing by zero:" + 10 / 0);//get excemtion  / by 0
        }catch (ArithmeticException e){
            System.out.println("Division by zero not possible");
        }finally{
            System.out.println("I don't care what you are trying,i will run");
            //we connected database and we didnot close connection  in those cases we need to keep this in finally block then it will close connection
            //connection.close();
        }
        //here our program got inturrept so we are taking try
        int j=20;
        System.out.println("dividing by i:"+20/i);
        //without try it will not run
    }
}
