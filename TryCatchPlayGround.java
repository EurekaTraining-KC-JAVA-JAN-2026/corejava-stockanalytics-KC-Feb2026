public class TryCatchPlayGround {
     public static void main(String[] args) {
         int i=10;

         //try cache Block. User can see what really Happening.
         try {
             System.out.println("Divide by Zero:" + 10/0);
         }catch (ArithmeticException e){
             System.out.println(e.getStackTrace());
         }finally {
//             connection Close
             System.out.println("I will Still run It");
         }
         int j=20;
         System.out.println("Divide by Zero:" +20/i);


    }
}
