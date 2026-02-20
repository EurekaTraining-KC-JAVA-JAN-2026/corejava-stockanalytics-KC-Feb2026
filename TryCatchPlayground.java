public class TryCatchPlayground {
    public static void main(String[] args) {
        int i =10;
        /**
         * Benefits of TRY_CATCH block
         * 1=> user can see what actually happening
         * 2. application won't get interupted
         */
        try {
            System.out.println("Dividing by Zero: "+10/10);
        }
        catch (ArithmeticException e){
            System.out.println("Division with Zero is not possible");
        }
        finally {
            //connection.close();
            System.out.println("I don't care what you are trying, I will run");
        }
        int j=20;
        System.out.println("Dividing by i: "+20/i);

    }
}
