public class ControlFlowPlayGround {
    public static void main(String[] args) {
        int x =10;
        int y = 20;

        boolean b = x == y;
        System.out.println("Comparing x and y using '==' " +b);

        //control flow statements

        if (b) {
            System.out.println("x == y");
        }

        if (x>y){
            System.out.println("x > y");

        }
        else {
            System.out.println("x < y");
        }

        while(x==y){
            System.out.println("x == y");

        }

//        Stock s1 = new Stock("");

    }

    void randomStockAdvice(Stock stock) {
        switch(stock.getTickerSymbol()){
            case "IBM":
                System.out.println("IBM");
                break;
            case "MSFT":
                System.out.println("MSFT");
                break;
            case "GOOG":
                System.out.println("GOOG");
                break;
            default:
                System.out.println("Unknown symbol");
        }
    }
}
