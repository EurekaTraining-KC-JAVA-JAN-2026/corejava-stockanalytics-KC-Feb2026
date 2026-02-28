public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i=10;
        /**
         * Benefits of TRY_CATCH block
         * 1=> user can see what actuall happening
         * 2=> Application don't get intrupted
         * TRY_CATCH has never care about the output it will run
         */
        try{
            System.out.println("Divided by Zero: " +10/0);
        } catch (ArithmeticException e) {
            System.out.println("Divided by Zero is not possible");
        }finally {
            //connection.close();
            System.out.println("I don't care what you are trying, i will run");
        }

        int j=20;
        System.out.println("Divided by i: " +20/i);
    }
}
