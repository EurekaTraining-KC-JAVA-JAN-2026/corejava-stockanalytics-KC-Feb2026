public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x = 10; //assigning the value
        int y = 20;

        boolean b = x == y; //comparing the values
        System.out.println(("comparing x and y using '==' " + b));
        //control - flow statements
        //if - else
        System.out.println("From IF-ELSE BLOCK");
        if (!b) {//whether it is true or false,if true it will jump into block code
            //using inverse control !b
            System.out.println("X and Y are equal " + b);
        } //if its false
        else {
            System.out.println("X AND Y are not Equal: " + b);
        }
        System.out.println("From ELSE-IF BLOCK");
        int a = 10;
        int c = 20;
        int d = 30;
        //! it will always inverse the condition
        if((a+c)>d){
            System.out.println("From 1st IF statement");
        } //if its false
        else if((a+c)>d){
            System.out.println("from the default block which is else");
        }
        else{
            System.out.println("from the default block which is else");
        }

        //ternary operators
        System.out.println("FROM TERNARY OPERATOR");
        double randomDouble=Math.random();
        if(randomDouble>0.5){
            System.out.println("random number is greater than 0.5 :" +randomDouble);
        }
        else{
            System.out.println("random number is less than 0.5 :" +randomDouble);
        }

        String someString= (randomDouble>0.5)? "Greater than 0.5" : "less than 0.5";
        System.out.println(someString);
        /**
         * while loop
         * if you know how long u need to run the loop use for or for-each
         * if not go for while
         * mobile -notification --> while works best
         */
        while(x>8){
            System.out.println("from while loop : "+x);
            x--;

        }

        //switch
        Stock sampleStock = new Stock("APPL",34);
        randomStockAdvice(sampleStock);
        int num1=10;
        int num2=10;
        }

        private static void randomStockAdvice(Stock sampleStock){
        switch (sampleStock.getTickerSymbol()){
            case "TSLA":
                System.out.println("SELL...IT");break;
            case "NVDA":
                System.out.println("buy...IT");break;
            case "APPL":
                System.out.println("hold...IT");break;
            default:
                System.out.println("market is not stable hold your horses");
        }
    }
}