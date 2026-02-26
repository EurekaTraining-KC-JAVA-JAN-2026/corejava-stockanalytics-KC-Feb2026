public class PassByValue {
    public static void main(String[] args)
    {
        int x = 20;
        System.out.println(System.identityHashCode(x));
        update(x);
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
        Stock sampleStock = new Stock("AAPL",32);
        System.out.println(sampleStock.getTickerSymbol());
        UpdateStockdata(sampleStock);
        System.out.println(sampleStock.getTickerSymbol());

    }

    private static void UpdateStockdata(Stock sampleStock) {
        sampleStock.setTickerSymbol("NVDA");
    }

    static void update(int a)
    {
        System.out.println(System.identityHashCode(a));
        a = 40;
        System.out.println(System.identityHashCode(a));
    }
}
