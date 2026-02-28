public class TryCatchPlayGround {
    public static void main(String[] args){
        int i=20;
        //first try it if not possible then catch it
        // application wont get get interrupted when we r using try catch



        try{
            System.out.println("diving by zero"+10/0);
        }catch (ArithmeticException e){
            System.out.println("division with zero is not possible");
//            System.out.println(e.getStackTrace());//we will know exctly whats the error
        }finally {
            System.out.println("i dont care what you r trying, i will run");

        } ///hireracy shoul be meanigful
        //

        int j= 30;
        System.out.println("dividing by i: "+30/i);


    }
}
