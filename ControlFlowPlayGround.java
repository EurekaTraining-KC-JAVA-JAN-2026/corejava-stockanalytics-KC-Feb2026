import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
//        int x = 10;//assignment
//        int y = 10;//assignment
//        boolean b = (x == y);
//        System.out.println(b);
//        //control flow statements
//        //if -else
//        if(b){
//            System.out.println("X anD Y are Equal");
//        }else{
//            System.out.println("X anf Y are NOT Equal");
//        }
//        //else if
//        int a = 11;//assignment
//        int c = 20;//assignment
//        int d = 30;//assignment
//        if((a+c)==d){
//            System.out.println("from if block");
//        } else if ((a+c)>d) {
//            System.out.println("from 2nd else-if statement");
//        }else
//        {
//            System.out.println("from the default block");
//        }
//
//        //terenary operator
////        double randomDouble = Math.random();//range of 0-10
//        if(randomDouble>0.5){
//            System.out.println("Random number is greater than 0.5 :" + randomDouble);
//        }else{
//            System.out.println("Random number is less than 0.5:"+randomDouble);
//        }
//        String someString = (randomDouble>0.5? "greater than 0.5" :"less than 0.5") ;
//        System.out.println(someString);
//        while(x>8){
//            System.out.println("X value is :"+x);
//            x--;
//        }
        //switch
        Stock randomStock = new Stock("AAPL", 34);
        Stock randomStock2 = new Stock("AAPL", 34);
        //randomStockAdvice(randomStock);
        randomStockAdvice1(randomStock);   // switch version
        randomStockAdvice(randomStock);    // if-else version


        int num1 = 10;
        int num2 = 20;
        // == only work on primitives
        // non - primitives we have an .equals method
        System.out.println(num1 == num2);//here 2 primitives
        System.out.println(randomStock.equals(randomStock2));

        BigDecimal BD1 = new BigDecimal(35.4);
        BigDecimal BD2 = new BigDecimal(35.4);
        System.out.println(BD1.equals(BD2));
    }

    private static void randomStockAdvice1(Stock randomStock) {

        switch (randomStock.getTickerSymbol()) {
            case "TSLA":
                System.out.println("SELL IT...");
                break;
            case "NVDIA":
                System.out.println("BUYL IT...");
                break;
            case "AAPL":
                System.out.println("HOLD IT...");
                break;
            default:
                System.out.println("Do whatever you want");
        }
    }


    private static void randomStockAdvice(Stock randomStock) {

        if (randomStock.getTickerSymbol().equals("TSLA")) {

            System.out.println("SELL IT...");

        } else if (randomStock.getTickerSymbol().equals("NVDIA")) {

            System.out.println("BUY IT...");

        } else if (randomStock.getTickerSymbol().equals("AAPL")) {

            System.out.println("HOLD IT...");

        } else {

            System.out.println("Do whatever you want");

        }
    }
}

