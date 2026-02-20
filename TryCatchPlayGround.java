public class TryCatchPlayGround {
    static void main(String[] args) {
        int i=10;
        /*
       benefitd of TRY-CATCH Block
       1=> user can see what actually happening
       2=> Application won't get interrupted
         */

        try{
            System.out.println("divided by zero:"+10/0);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero is not possible");
            System.out.println(e.getStackTrace());

        }finally{
            System.out.println("I don't care what you are trying ,i will run ");
        }


        int j=20;
        System.out.println("divided by i:"+20/i);
    }
}
