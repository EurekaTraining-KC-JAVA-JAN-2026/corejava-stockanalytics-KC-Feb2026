public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i =10;
        /**
         *the benfits of try catch
         * 1-user can see what actually happening
         * 2-Application won't get interrputed
         */
        try {
            System.out.println("Divded by Zero:" +10/0);
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getStackTrace());
            System.out.println("divison with zero is not possible");
        }finally {
            System.out.println("I don't care what you are trying , I will run");
        }
        int j =20;
        System.out.println("Divided by i:" +20/i);
    }
}
