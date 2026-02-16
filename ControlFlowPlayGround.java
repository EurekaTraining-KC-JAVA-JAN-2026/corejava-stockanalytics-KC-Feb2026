import javax.swing.*;
import java.math.BigDecimal;
import java.sql.SQLOutput;

public class ControlFlowPlayGround {
    public static void main(String[] args) {
        Stock sampleStock2 = new Stock("TSLA",34);

        int x = 10;
        int y = 20;
        // if equals return true
        boolean b = x==y; // comparing x and y
        // System.out.println("Comparing x and y==" + b);
        if (!b)
        {
            //System.out.println("X and Y are Equal" + b);
        }
        else
        {
            // System.out.println("X and Y are not Equal" + b);
        }
        int a = 10;
        int c = 20;
        int d = 20;
        if((a+c) == d)
        {
            //System.out.println("Print first if statement");
        }
        else if((a+c) >d)
        {
            //System.out.println("Print second else if statement");
        }
        else
        {
            //System.out.println("Print third else statement");
        }
        // ternary operators
        double randomDouble = Math.random(); //0-1;
        if(randomDouble > 0.5)
        {
            //System.out.println("Random number is greater than 0.5 "+ randomDouble);

        }
        else
        {
            // System.out.println("Random number is less than 0.5" + randomDouble);
        }

        String someString = (randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        //System.out.println(someString);
        // while loop - mobile notifications
        while(x >8)
        {
            System.out.println("From while loop "+ x);
            x--;

        }
        // if you know how long to iterate go for and for each else while loop
        // switch
        Stock sampleStock = new Stock("TSLA",34);
        randomStockAdvice(sampleStock);

        int num1 = 10;
        int num2 = 20;
        BigDecimal bd1 = new BigDecimal(35.5);
        BigDecimal bd2 = new BigDecimal(35.5);
        System.out.println(num1 == num2);
        System.out.println(sampleStock == sampleStock2);
        System.out.println(bd1 == bd2);
        // == for equals
        // .equals() for non primitives
        System.out.println(bd1.equals(bd2)); // predefined
        System.out.println(sampleStock.equals(sampleStock2)); // custom class
        randomStockAdvice2(sampleStock2);


    }

    private static void randomStockAdvice(Stock sampleStock) {
        switch(sampleStock.getTickerSymbol())
        {
            case "TSLA" :
                //System.out.println("Sell It");
                break;
            case "NVDA" :
                //System.out.println("Buy It");
                break;
            case "AAPL":
                // System.out.println("Hold It");
                break;
            default:
                //System.out.println("Nothing");
        }

    }
    private static void randomStockAdvice2(Stock sampleStock2)
    {
        if(sampleStock2.getTickerSymbol().equalsIgnoreCase("TSLA"))
        {
            System.out.println("Sell It");
        }
        else if(sampleStock2.getTickerSymbol().equalsIgnoreCase("AAPL"))
        {
            System.out.println("Hold It");
        }
        else if(sampleStock2.getTickerSymbol().equalsIgnoreCase("NVDA"))
        {
            System.out.println("Buy It");
        }
        else
        {
            System.out.println("Nothing");
        }
    }


}