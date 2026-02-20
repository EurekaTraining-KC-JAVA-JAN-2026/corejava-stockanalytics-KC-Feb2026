public class TryCatchPlayGround {
    public static void main(String[] args)
    {
        int i=10;
        try{
            System.out.println("divide by zero" +i/0);

        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
            System.out.println(e);
        }
        finally{
            System.out.println("I dont care what you are trying to do, I will run");
        }
        int j=20;
        System.out.println("Divide by i: "+20/i);
    }
}
