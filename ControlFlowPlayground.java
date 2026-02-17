public class ControlFlowPlayground {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        boolean b = x == y;     // comparing the values
        System.out.println(b);

        // control - flow statements === if and else

        if (x == y) {
            System.out.println("print b is true");
        } else {
            System.out.println("print b is false");
        }


        // else  if
        int i = 10;
        int j = 20;
        int k = 30;

        if ((i + j) == k) {
            System.out.println("print its IF satatement");
        } else if ((i + j) > k) {
            System.out.println("print its a ELSE IF statement");
        } else {
            System.out.println("default block which is else");
        }


        // ternary operators

        double randomDouble = Math.random();
        if (randomDouble > 0.5) {
            System.out.println("random num is greater " + randomDouble);
        } else {
            System.out.println("random num is less then given num " + randomDouble);
        }

        String someString = (randomDouble > 0.5) ? "greater than 0.5" : "less than 0.5";
        System.out.println(someString);

        // while  = its kind of an infinite loop

        while (x > 8) {
            System.out.println("its a greater num " + x);
            x--;
        }

        // Switch
        Day2 sampleStock = new Day2("APPL",34);
        randomStockAdvice(sampleStock);

    }


    private static void randomStockAdvice(Day2 sampleStock) {
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




