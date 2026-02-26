import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args)
    {
        int x = 10;
        int y= 20;

        boolean b = x == y;
        System.out.println("comparing x and y using ==" +b);

        if(b)
        {
            System.out.println("X and Y are equal:" +b);
        }
        else
        {
            System.out.println("X and Y are not equal" +b);
        }

        int a = 10;
        int d = 30;
        int c = 20;
        if((a+c) == d)
        {
            System.out.println("first if");
        }
        else if((a+c)>d)
        {
            System.out.println("Second if");
        }
        else{
            System.out.println("else condition");
        }

        // ternary operators
        double randomDouble = Math.random();
        if(randomDouble>0.5)
        {
            System.out.println("number value is greater than 0.5 " +randomDouble);
        }
        else
        {
            System.out.println("number value is less than 0.5" +randomDouble);
        }
        System.out.println(randomDouble);
        String someString = (randomDouble >0.5) ? "greater than 0.5" : "less than 0.5";
        boolean xy = (randomDouble >0.5) ? true : false;
        System.out.println(xy);
        System.out.println(someString);

        while(x > 8)
        {
            System.out.println(x);
            x--;
        }
        int num1 = 10;
        int  num2 = 10;
        System.out.println(num1 == num2);
        BigDecimal bd1 = new BigDecimal(35.5);
        BigDecimal bd2 = new BigDecimal(35.5);
        System.out.println(bd1 == bd2);
        System.out.println(bd1.equals(bd2));
        //Stock
        Stock sampleStock = new Stock("AAPL",34);
        randomStockAdvice(sampleStock);
        randomStockAdvice2(sampleStock);
        System.out.println(sampleStock);
    }

    private static void randomStockAdvice2(Stock sampleStock){
        if(sampleStock.getTickerSymbol().equalsIgnoreCase("tsla")){
            System.out.println("Sell....it");
        }
        else if(sampleStock.getTickerSymbol().equalsIgnoreCase("aapl")){
            System.out.println("Hold.....it");
        }
        else if(sampleStock.getTickerSymbol().equalsIgnoreCase("Nvda")){
            System.out.println("Buy.....it");
        }
        else {
            System.out.println("market not stable");
        }
    }

    private static void randomStockAdvice(Stock sampleStock){
        switch (sampleStock.getTickerSymbol()){
            case "TSLA" :
                System.out.println("Sell.......it");
                break;
            case "AAPL" :
                System.out.println("Hold.......it");
                break;
            case "NVDA" :
                System.out.println("Buy.......it");
                break;
            default:
                System.out.println("market not stable");


        }
    }

}
