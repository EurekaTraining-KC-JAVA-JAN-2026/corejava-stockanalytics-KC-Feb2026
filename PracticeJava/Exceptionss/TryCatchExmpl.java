package PracticeJava.Exceptionss;

public class TryCatchExmpl {

    public static void main(String[] args) {
        //int a  = 10/0;
        try{
            int a  = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally Executed");
        }
    }
}
