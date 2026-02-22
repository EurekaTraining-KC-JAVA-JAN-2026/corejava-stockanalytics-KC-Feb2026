public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i =0;
        /**
         * Benefit of try-catch block
         * 1=> User can see whats actually happening
         * 2 =>Application wont get interupted
         */
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
        }finally {
            System.out.println("I dont care if you are trying , i will execute");
        }
        int j=20;
        System.out.println("Diving by i" + 20/i);
    }
}
