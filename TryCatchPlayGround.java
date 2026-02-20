public class TryCatchPlayGround {
    public static void main(String[] args) {
        int i =10;
        try{
            System.out.println("Dividing by zero"+ 10/0);
        }catch(ArithmeticException e){
            System.out.println("Dividing by zero is not possible"+ e.getMessage());
        }
        finally {
            System.out.println("this will print on the screen irrespective of the exception");
        }
        int j=20;

    }
}
