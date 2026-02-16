import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x=10;//= assigning value
        int y=20;//= assigning value

        boolean b =x==y;// == comparing values
        System.out.println("comparing x and y using '==' " +b);
        //control - flow statements
        //if - else
        if(b){
            System.out.println("x and y are equal");
        }
        else {
            System.out.println("x and y are not same");
        }

        int a=10;
        int c=20;
        int d =30;
        if((a+c)<d){
            System.out.println("from 1st if statement");
        }
        else if((a+c)>d){
            System.out.println("from 2nd else if statement");
        }
        else{
            System.out.println("from the default block which is in else");
        }

        //ternary operators
        double randomDouble=Math.random();//range of 0-1
        if(randomDouble>0.5){
            System.out.println("Random number is greater than 0.5 : "+randomDouble);
        }else{
            System.out.println("Random number is less than 0.5 : "+randomDouble);
        }

        String someString =(randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        //? -> if,,,,: ->else
        System.out.println(someString);

        /**
         * while loop, it is kind of an infinite loop,
         * if you know how long to run loop use for or for each
         * if not use while loop
         */
        while(x>8){
            System.out.println("from while loop : "+x);
            x--;
        }

        //switch
        Stock sampleStock= new Stock(34,"APPL");
        Stock sampleStock1=new Stock(34,"APPL");
        randomStockAdvice(sampleStock);
        randomStockAdvice1(sampleStock);

        BigDecimal bd1= new BigDecimal(35.5);
        BigDecimal bd2=new BigDecimal(35.5);
        int num1=10;
        int num2=20;
        //== primitives
        // non-primitives we have .equals..
        System.out.println(num1 == num2);
        System.out.println(bd1==bd2);
        System.out.println(bd1.equals(bd2));
        System.out.println(sampleStock.equals(sampleStock1));

    }

    private static void randomStockAdvice1(Stock sampleStock) {
        if (sampleStock.getTickerSymbol().equalsIgnoreCase("tsla")){
            System.out.println("SELL...IT");
        }else if(sampleStock.getTickerSymbol().equalsIgnoreCase("nvda")){
            System.out.println("BUY...IT");
        }else if(sampleStock.getTickerSymbol().equalsIgnoreCase("appl")){
            System.out.println("HOLD...IT");
        }else{
            System.out.println("MARKET IS NOT STABLE...");
        }
    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch(sampleStock.getTickerSymbol()){
            case "TSLA" :
                System.out.println("SELL...IT");
                break;
            case "NVDA" :
                System.out.println("BUY...IT");
                break;
            case "APPL":
                System.out.println("HOLD...IT");
                break;
            default:
                System.out.println("MARKET IS NOT STABLE...");
        }

    }
}
