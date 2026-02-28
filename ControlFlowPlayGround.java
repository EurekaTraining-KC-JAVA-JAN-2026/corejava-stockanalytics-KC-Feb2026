import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x = 10; // = ->assigning the value
        int y = 20; // = -> assigning the value
        //if it returns true, if not equal returns false
        boolean b = x == y;// = -> comparing values of x&y
        System.out.println("Comparing x and y using '==' " + b);
        //control-flow statements
        //if-else
        System.out.println("From IF-ELSE block");
        if (!b) {
            //whether it is true or false, if true will jump into that code block
            System.out.println("x and y are equal " + b);

        } else {
            System.out.println("x and y are not equal " + b);

        }

        System.out.println("From Else-if block");
        int a=10;
        int c=20;
        int d=30;

        if ((a+c)==d) {
            //whether it is true or false, if true will jump into that code block
            System.out.println("from 1st IF statement ");

        } else if((a+c)>d){
            System.out.println("from 2nd else if statement " );

        } else{
            System.out.println("from the default block which is else");
        }

        //ternary operators
        double randomDouble = Math.random(); //random num within range of 0-1
        if(randomDouble>0.5){
            System.out.println("Random number is greater than 0.5 :" +randomDouble);

        } else{
            System.out.println("Random number is less than 0.5 :" +randomDouble);
        }

        String somestring = (randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        // ? - if and  : - else
        System.out.println(somestring);
        /**
         * while loop is kind of an infinite loop,
         * if you know how long you need to run the loop use for-each
         * if not use while loop
         *
         */
        while(x>8){
            System.out.println("From while loop :" + x);
            x--;
        }

        //switch
        Stock sampleStock = new Stock("TSLA",34);
        Stock sampleStock2 = new Stock("TSLA",34);
        randomStockAdvice(sampleStock);
        randomStockAdvice2(sampleStock);
        BigDecimal bd1 = new BigDecimal(35.5);
        BigDecimal bd2 = new BigDecimal(35.5);


        int num1 = 10;
        int num2=10;
        // == works on primitives
        //non-primitives we have .equals method
        System.out.println(num1==num2);
        System.out.println(sampleStock.equals(sampleStock2));
        System.out.println(bd1.equals(bd2));
    }

    private static void randomStockAdvice2(Stock sampleStock) {
        if (sampleStock.getTickerSymbol().equalsIgnoreCase("tsla")){
            System.out.println("sell it");

        } else if (sampleStock.getTickerSymbol().equalsIgnoreCase("NVDA")) {
            System.out.println("buy it");


        } else if(sampleStock.getTickerSymbol().equalsIgnoreCase("AAPL")){
            System.out.println("hold it");
        } else {
            System.out.println("Market is not stable, hold it");
        }
    }


    private static void randomStockAdvice(Stock sampleStock) {
        switch (sampleStock.getTickerSymbol()){
            case "TSLA" :
                System.out.println("Sell it");break;
            case "NVDA" :
                System.out.println("Buy it");break;
            case "AAPL" :
                System.out.println("Hold it");break;
            default:
                System.out.println("Market is not stable, hold it");
        }
    }



}