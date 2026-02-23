public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i = 10;
        /**
         * Benefits of TRY-CATCH block
         * 1=> User can see what actually is happening
         * 2=>Application wont get interrupted even if its throwing errors
         */
        try{
            System.out.println("Dividing by zero : "+ 10/0);
        } catch (ArithmeticException e){
            System.out.println(e.getStackTrace());

        } finally{
            //connection.close();
            System.out.println("I dont care what you'ree trying, Ill run");
        }
        //System.out.println("Dividing by zero : "+ 10/0);
        int j=20;
        System.out.println("Dividing by i " +20/i);
    }
}