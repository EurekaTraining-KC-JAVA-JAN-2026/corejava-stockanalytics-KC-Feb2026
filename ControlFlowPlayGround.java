import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x=10;//= assigning the value
        int y = 20; // assigning the value
        //if equals return true
        boolean b = (x==y);// == comparing value of x and y using ==
        System.out.println("comparing x and y values using ==" +b);
        //control-flow -statemnts
        //if-else
        if(b){      //wether it is true or false,if true it will jumps into the code block
            System.out.println("X and y are equal:" +b);
        }
        else{
            System.out.println("X and y are false:" +b);
        }
        //it will inverse what we are having
        if(!b){      //wether it is true or false,if true it will jumps into the code block
            System.out.println("X and y are equal:" +b);
        }
        else{
            System.out.println("X and y are false:" +b);
        }
        System.out.println("nested ifelse block");
        int a =10;
        int c=20;
        int d = 30;
        if((a+c)==d){      //wether it is true or false,if true it will jumps into the code block
            System.out.println("From frst if statement ");
        }
        else if((a+c)>d) {//it is false
            System.out.println("from second else if ");
        }
        else{
            System.out.println("from defult block  which is else");
        }
        System.out.println("From ternary operators");
        // ternary operator
        double randomDouble = Math.random();
        if(randomDouble>0.5){
            System.out.println("random num is greater than 0.5" +randomDouble);
        }
        else{
            System.out.println("random num is less than 0.5" +randomDouble);
        }

        //string
        String someString = (randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        // ? --> if ,,, : -> else
        System.out.println(someString); //someString

        /**
         * while loop , if we dont know the length  then we can go with while loop it is infinite loop
         * expression is true or false here
         * if you know how long u need to run the loop use for or for each
         * if not then go for while
         * mobile-notification-->while
         */
        while(x>8){
            System.out.println("from while loop will be " +x);
            x--;
        }
        // Switch blocks
        Stock sampleStock = new Stock("APPL",34);//custom class
        Stock sampleStock2 = new Stock("APPL",34);
        randomStockAdvice(sampleStock);
        BigDecimal bd1 = new BigDecimal(35.5);//predefined  existing one
        BigDecimal bd2 = new BigDecimal(35.5);


        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2);//true
        System.out.println(sampleStock==sampleStock2);//false it will print reference number
        System.out.println(bd1==bd2);

        // == works on primitives
        //non primitives we have .equals ....


    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch(sampleStock.getTickerSymbol()){
            case "TSLA" :
                System.out.println("SELL ..!");break;
            case "NVDA" :
                System.out.println("Buy ..!");break;
            case "AAPL" :
                System.out.println("Hold ..!");break;
            default:
                System.out.println("Market is not stable hold your horses");
        }
    }

}
