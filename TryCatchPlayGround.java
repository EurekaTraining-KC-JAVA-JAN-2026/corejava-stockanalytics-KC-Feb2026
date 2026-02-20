public class TryCatchPlayGround {
   public static void main(String[] args) {
        //Application won't be interrupted
       int i=10;
       try{
       System.out.println("Division by zero:"+i/0);
       }catch (ArithmeticException e){
           System.out.println(e.getStackTrace());
       }

       finally {
           System.out.println("I dont care what u r doing ,I will run");
       }

       int j=20;
       System.out.println("Division by i :"+ 20/i);

    }
}
