import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String args[]) {
        int x = 10;  // = -> assigning value.
        int y = 20; // = -. assigning value.

        //if equals return true, if not-equals return false.
        boolean b = (x == y); // -> comparing the values of x and y using ==
        System.out.println("Comparing x and y using ==" + b);

        Stock sampleStock1 = new Stock("APPL", 34); //custom class
        Stock sampleStock2 = new Stock("APPL", 34);

        BigDecimal bd1 = new BigDecimal(35.5); //pre-defined class
        BigDecimal bd2 = new BigDecimal(35.5);



        int num1 = 10;
        int num2 = 20;

        //== always works with primitives.
        //non-primitives we have .equals method.
        System.out.println(num1==num2);
        System.out.println(sampleStock1 == sampleStock2);
        System.out.println(bd1 == bd2);

        System.out.println("//using .equal");
        System.out.println(bd1.equals(bd2));
        System.out.println(sampleStock1.equals(sampleStock2));


        //control - flow statements
        //! always inverse what we are having
        if(!b) {  //whether it is trye or false, if true it will jumps into that code.
            System.out.println("x and y are equal :" +b);
        } else {//if it is false
            System.out.println("x and y are not equal :" +b);
        }

        System.out.println("From else-if");
        int a = 10;
        int c = 20;
        int d = 30;

        if ((a + c) == d) {
            System.out.println("from 1st if stateement");
        } else if((a+c)>d) {
            System.out.println("from 2nd else_if statement");
        } else {
            System.out.println("from the defualt block which is else");
        }

        //ternary operator
        double randomDouble = Math.random(); // range 0-1
        if(randomDouble > 0.5) {
            System.out.println("Random number is greater than 0.5:" + randomDouble);
        } else {
            System.out.println("Random number is less than 0.5:" + randomDouble);
        }

        String someString = (randomDouble > 0.5) ? "Greater than 0.5" : "Less than 0.5";
        System.out.println(someString);


        /**
         * While loop, it is a kind of infinite loop\
         * used we dont know how many.
         *
         * If you know how long the itration goes then better use for and for each
         */
        while (x>8) {
            System.out.println("TRue will always be true" + x);
            x--;
        }


        //Switch
        Stock sampleStock = new Stock("APPL", 34);
        randomStockAdvice(sampleStock);
        randomStockAdvice2(sampleStock);
        
    }

    private static void randomStockAdvice2(Stock sampleStock) {
        if(sampleStock.getTickerSymbol().equalsIgnoreCase("tsla")) {
            System.out.println("SELL..IT");
        } else if(sampleStock.getTickerSymbol().equalsIgnoreCase("nvda")) {
            System.out.println("BUY..IT");
        } else if(sampleStock.getTickerSymbol().equalsIgnoreCase("APPL")) {
            System.out.println("HOLD--IT");
        } else {
            System.out.println("Market is not stable");
        }

    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch (sampleStock.getTickerSymbol()) {
            case "TSLA" : System.out.println("SELL..IT"); break;
            case "NVDA" : System.out.println("BUY..IT"); break;
            case "APPL" : System.out.println("HOLD--IT"); break;
            default:
                System.out.println("Market is not stable");
        }
    }



}
