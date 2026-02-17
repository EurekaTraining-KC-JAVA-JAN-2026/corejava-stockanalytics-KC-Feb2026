public class ControlFlowPlayGround {
    static void main(String[] args) {
        int x = 10;   // assigning the value
        int y = 20;    // assigning the value


        //== works on primitives
        // .equals works on non-primitives

        boolean b = x == y;  // == -> comapring the values of x and y using '=='
        System.out.println("comparing x and y using '==' " + b);
        //control-flow statemnets
        //if -else

        System.out.println("FROM IF_ELSE BLOCK");
        if (b) {//checks weather it is true or false, if true it will jumps into code block
            System.out.println("X and Y are equal:" + b);
        } else {
            System.out.println("X and Y are equal:" + b);
        }


        // 2 example
        System.out.println("FROM IF_ELSE BLOCK");
        int a = 10;
        int c = 20;
        int d = 30;
        if ((a + c) == d) {//checks weather it is true or false, if true it will jumps into code block
            System.out.println("from first IF statement");
        } else if ((a + c) > d) {
            System.out.println("from 2nd ELSE_IF statment");
        } else {
            System.out.println("from the default block which is else");
        }


        // ternary operators
        System.out.println("FROM TERNARY OPERATOR");
        double randomDouble = Math.random();  // range 0-1
        if (randomDouble > 0.5) {
            System.out.println("Random number is greater than 0.5  " + randomDouble);
        } else {
            System.out.println("Random number is less than 0.5  " + randomDouble);
        }
        String someString = (randomDouble > 0.5) ? "Greater than 0.5" : "Less than 0.5";
        System.out.println(someString);


        /**
         * while loop (it is kind of infinite loop)
         *
         * if  you know the length you can use for or for-each
         * if not go for while
         *
         */
        while (x > 8) {
            System.out.println("from while loop" + x);
            x--;

        }

        // switch
        Stock appleStock = new Stock("AAPl",2525,9,35,54);
        //randomStockAdvice(sampleStock);

    }
    private static void randomStockAdvice(Stock sampleStock){
        switch(sampleStock.getTickerSymbol()){
            case "TSLA":
                System.out.println("SEE..IT");break;
            case "NVDA":
                System.out.println("BUY..IT");break;

            case "AAPL":
                System.out.println("HOLD");break;
            default:
                System.out.println("This is not stable hold your horses");

        }
    }
}
