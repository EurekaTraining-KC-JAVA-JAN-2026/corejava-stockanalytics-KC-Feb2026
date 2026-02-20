public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i = 10;
        /**
         * Benefits of TRY-CATCH Block
         * 1 => User can see what actually happening
         * 2 => Application won't get interupted
         */
        try{
            System.out.println("Dividing by Zero: "+10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }
        finally{
            //connection.close();
            System.out.println("I don't care what you are trying, I will run");
        }
        int j =20;
        System.out.println("Dividing by i: "+20/i);
    }
}
