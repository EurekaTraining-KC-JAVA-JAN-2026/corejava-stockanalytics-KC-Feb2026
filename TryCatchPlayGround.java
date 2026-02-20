public class TryCatchPlayGround {
    public static void main() {
        int i=10;
        /**
         * benefits of try catch block
         * 1=>user can see what actually happening
         * 2=> application wont get interrupted
         */

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }finally {
            System.out.println("I dont care what you are trying, I will run");
        }
        int j=20;
        System.out.println("Dividing by i: " + 20 / i);
    }
}
