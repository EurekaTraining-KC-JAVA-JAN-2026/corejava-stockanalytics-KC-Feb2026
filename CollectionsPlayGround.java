import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        //Create An ArrayList
        ArrayList<String> tickersList = new ArrayList<>();
        //ListInterface
        List<String> tickerList1 = new ArrayList<>();//MostUsed Type
        tickerList1.add("MSFT");
        tickerList1.add("AMD");
        tickerList1.add("AAPL");
        tickerList1.add("TSLA");
        System.out.println("Items In the List : " +tickerList1);
        String s = tickerList1.get(1);
        System.out.println("Value at the Index 1 is" +s);
        tickerList1.remove("MSFT");
        System.out.println("After Removing MSFT : " +tickerList1);
        tickerList1.add("MSFT");
        System.out.println("Size of an tickerList1 after Adding MSFT" + tickerList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerList1.addAll(anotherList);
        System.out.println("after adding another Collection; " + tickerList1);
        tickerList1.addFirst("3MCARE");
        tickerList1.addLast("IYLLY");
        System.out.println("After Adding;" + tickerList1);
        boolean amex = tickerList1.contains("AMEX");
        System.out.println("does Contains Amex "+ amex);
        //Contains Case Sensitive
        boolean amd = tickerList1.equals("AMD");
        System.out.println("does Contains Amd "+amd);


        tickerList1.removeAll(anotherList);
        System.out.println("after Removing all" +tickerList1);

        Collections.sort(tickerList1);//Sort is StaticMethod
        System.out.println("after Sorting" +tickerList1);


        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("APPl",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("IYLLY",34,2.8));
        //System.out.println(stockList);

        for (int i = 0; i < stockList.size(); i++) {
            System.out.println(stockList.get(i));

        }
        for (Stock stock : stockList) {
            System.out.println(stock);

        }
        int i = 47;//Primitive
        Integer objInt1 = (Integer)i;
        Integer objInt = 34;
        List<Integer> integers = List.of(2,3,4);
        //integers.add(7); Lists are Immutable we cannot change it


        System.out.println(integers);


        List<Integer>integers1=new ArrayList<>();


    }
}
