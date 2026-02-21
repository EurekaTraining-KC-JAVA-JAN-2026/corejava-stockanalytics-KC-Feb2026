import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x = 10; // =-> assigning the value
        int y = 20; // =-> assigning the value
        // if equals return true, if not-equal return false
        boolean b = (x == y); // == -> comparing the values of x and y using ==
        System.out.println("Comparing x and y using '==' " + b);
        //control -flow statements
        //if - else
        //! will always inverse what we have (Opposite)
        System.out.println("FROM IF-ELSE STATEMENT");
        if (!b) {//weather it is true or false, if true it will jumps into that code block
            System.out.println("X and Y are equal:" + b);
        } else {
            System.out.println("X and Y are not equal:" + b);
        }

        System.out.println("FROM ELSE-IF BLOCK");
        int a = 10;
        int c = 20;
        int d = 30;

        if ((a + c) == d) {//weather it is true or false, if true it will jumps into that code block
            System.out.println("From 1st IF statement");
        }//if it is false
        else if ((a + d) == c) {
            System.out.println("from 2nd False statement");
        } else {
            System.out.println("Both the statement is False");

        }

        //ternary operators

        double randomDouble = Math.random();
        if (randomDouble > 0.5) {
            System.out.println("Random number is greater than 0.5" + randomDouble);
        } else {
            System.out.println("Random number is less than 0.5" + randomDouble);
        }
        // if (?)
        // else(:)
        // other way of writing IF ELSE Statement
        String someString = (randomDouble >= 0.5) ? "Greater than 0.5" : "Less than 0.5";
        System.out.println(someString);


        int i=10;
        int j=30;
        int k=40;
        String value=((i+j)==k) ? "1st Condition":
                ((j+k)==i)? "2nd Condition": "3rd Condition";
        System.out.println(value);



        /**
         * while loop, it is kind of an infinite loop
         */

        while (x > 8) {
            System.out.println("From while loop:" + x);
            x--;
        }
//        Stock sampleStock1 = new Stock("TSLA");// custome class
//        Stock sampleStock2 = new Stock("AAPL");//
        BigDecimal bd1 = new BigDecimal(33.5); //predefine class
        BigDecimal bd2 = new BigDecimal(44);
        int num1=10;
        int num2=10;
        // ==Primitives
        // non -primitives we have equal
        System.out.println(num1==num2);//here 2 primitives
//        System.out.println(sampleStock1 == sampleStock2);
        System.out.println(bd1==bd2);
        System.out.println(bd1.equals (bd2));






        //Switch -> it will run O(log (n))1,2,3,4,5,...n[Time Complexity]  it will directly throw
        //if-else -> it will run O(n)(Time Complexity] it will check 4 times

        Stock sampleStock = new Stock("APPL",34 );
        randomStockAdvice(sampleStock);
        randomStockAdvice2(sampleStock);

    }

    private static void randomStockAdvice2(Stock sampleStock) {
        if(sampleStock.getTickerSymbol().equalsIgnoreCase("TSLA")) {
            System.out.println("SELL..IT");
        } else if(sampleStock.getTickerSymbol().equalsIgnoreCase("NVDA")) {
            System.out.println("BUY..IT");
        } else if(sampleStock.getTickerSymbol().equalsIgnoreCase("AAPL")) {
            System.out.println("HOLD--IT");
        } else {
            System.out.println("Market is not stable");
        }

    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch (sampleStock.getTickerSymbol()) {
            case "TSLA" : System.out.println("SELL..IT"); break;
            case "NVDA" : System.out.println("BUY..IT"); break;
            case "AAPL" : System.out.println("HOLD--IT"); break;
            default:
                System.out.println("Market is not stable");
        }





    }

}