public class TryCatchPlayGround {
    public static void main(String[] args) {

        int i=10;
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e.getStackTrace() );
        }finally {
            // connection.close();
            System.out.println("i dont care wt u r trying, i  will run");
        }

        int j =20;
        System.out.println(20/i);







    }
}
