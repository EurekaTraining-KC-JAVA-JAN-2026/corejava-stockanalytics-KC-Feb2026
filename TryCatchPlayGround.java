public class TryCatchPlayGround {
    static void main(String[] args) {
        int i = 10;
        try
        {
            System.out.println("The division by 0" + 10/0);
        }
        catch(ArithmeticException e)

        {
            System.out.println(e.getStackTrace());
            System.out.println("Division by 0 is not possible");
        }
        finally
        {
            //connection.close();
            System.out.println("It will print what ever do");
        }
        int j = 20;
        System.out.println("Division by i "+ j/i);
    }
}
