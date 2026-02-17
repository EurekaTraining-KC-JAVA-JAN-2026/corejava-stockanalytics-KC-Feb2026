import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x=10;// = -> assigning the value
        int y=20;// = -> assigning the value
        // if equals return true, if not-equals return false
        boolean b = (x == y); // == -> comparing the values of x and y using ==;
        System.out.println("Comparing x and y using '==' " +b);
        //control - flow statements
        //if - else
        System.out.println("FROM IF-ELSE BLOCK");
        //! will always inverse what we having
        if(!b){//wheather it is true or false, if true it will jumps into that code block
            System.out.println("X and Y are equal :" +b);
        }//if its is false
        else {
            System.out.println("X and Y are not Equal : "+b);
        }

        System.out.println("FROM ELSE-IF // nested else-if BLOCK");
        int a=10;
        int c=20;
        int d=30;
        //! will always inverse what we having
        if((a+c)>d){
            System.out.println("from 1st IF statement");
        }//if its is false
        else if ((a+c)>d) {
            System.out.println("from 2nd ELS_IF statemenmt");
        } else {
            System.out.println("from the default block which is else");
        }

        //ternary operators
        System.out.println("FROM TERNARY OPERATORS");
        double randomDouble = Math.random();//range of 0-1
        if(randomDouble>0.5){
           // System.out.println("Random number is greater than 0.5 :" +randomDouble);
        }else {
           // System.out.println("Random number is less than 0.5 :" +randomDouble);
        }

        String someString = (randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        //? -> if ,,, : -> else
       // System.out.println(someString);
        /**
         * while loop, it is kind of an infinite loop,
         * if you how long u need run the loop use for or for-each
         * if not then go for while,
         * mobile-notifictaion --> while
         */
        while (x>8){
            //System.out.println("From while loop : "+x);
            x--;
        }

        //switch
        Stock sampleStock = new Stock("APPL",34);//custom class
        Stock sampleStock2 = new Stock("APPL",34);
        randomStockAdvice(sampleStock);
        randomStockAdvice2(sampleStock);
        BigDecimal bd1 = new BigDecimal(35.5); //predefind class
        BigDecimal bd2 = new BigDecimal(35.5);

        int num1 = 10;
        int num2 = 10;
        // ==  primitives
        // non-primitives we have .equals...
        System.out.println(num1==num2);//here 2 primitives
        System.out.println(sampleStock.equals(sampleStock2));//here  non-primitives
        System.out.println(bd1.equals(bd1));//here also on non-primitives
    }

    private static void randomStockAdvice2(Stock sampleStock) {
        if (sampleStock.getTickerSymbol().equalsIgnoreCase("tsla"))System.out.println("SELL..IT");
        else if(sampleStock.getTickerSymbol().equalsIgnoreCase("nvda")){
            System.out.println("BUY...IT");
        } else if (sampleStock.getTickerSymbol().equalsIgnoreCase("appl")) {
            System.out.println("HOLD..IT");
        }else System.out.println("market is not stable");
    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch (sampleStock.getTickerSymbol()){
            case "TSLA" :
                System.out.println("SELL...IT");break;
            case "NVDA" :
                System.out.println("BUY...IT");break;
            case "APPL" :
                System.out.println("HOLD...IT");break;
            default:
                System.out.println("MARKET is not stable hold your horses...");
        }
    }



}
