public class ControlFlowPlayGround {
    static void main(String[] args) {
        int x=10;
        int y=20; // assigning the values

        boolean b = x == y; // comparing values x and y using ==;
        System.out.println("comparing x and y using ==" +b);


        if (b){
            System.out.println("x and y are equal:" +b);

        }
        else {
            System.out.println("x and y are not eqyal:" +b);
        }
        System.out.println("from else if block");
        int a=10;
        int c=20;
        int d=30;

        if ((a+c)==d){
            System.out.println("from 1st if statement");
        } else if ((a+c)>d) {
            System.out.println("from 2nd else-if statement");

        }
        else {
            System.out.println("from the default block which is else");
        }

        //ternary operators
        double randomDouble = Math.random();//range of 0 to 1
        if (randomDouble>0.5){
            System.out.println("random no. is greater than 0.5:" +randomDouble);
        }
        else {
            System.out.println("random no. is less than 0.5:" +randomDouble);
        }
        String someString = (randomDouble>0.5) ? "Greater than 0.5" : "Less than 0.5";
        System.out.println(someString);

        /**
         * while loop, it is kind of an infinite loop,
         * if you know how long u need, run the for eaah loop
         * otherwise use while loop
         */
        while (x>8){
            System.out.println("from while loop:"+x);
            x--;
        }

        //switch
        Stock sampleStock = new Stock("APPL",34);
        randomStockAdvice(sampleStock);

    }
    private static void randomStockAdvice(Stock sampleStock) {
        switch (sampleStock.getTickerSymbol()){
            case "TSLA":
                System.out.println("sell it");break;
            case "NVDA":
                System.out.println("buy it");break;
            case "AAPL":
                System.out.println("Hold it");break;
            default:
                System.out.println("Market is not stable");

        }
    }
}
