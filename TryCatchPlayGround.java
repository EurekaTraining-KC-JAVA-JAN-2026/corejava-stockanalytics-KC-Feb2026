public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i = 10;
        /**
         * Benefits of try-catch block
         * 1-User can see what actually happening
         * 2- Application won't get interrupted
         */
        try{
            System.out.println("Dividing by zero: "+i/0);
        }catch (ArithmeticException e){
            System.out.println("Division with zero is not possible");
        }finally {

            System.out.println("I don't care what you are trying, I will run");
        }
        int j=20;
        System.out.println("Dividing by i: "+j/i);
    }
}
