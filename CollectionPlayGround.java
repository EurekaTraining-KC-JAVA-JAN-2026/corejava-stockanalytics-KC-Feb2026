import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPlayGround {
    public static void main(String[] args)
    {
        ArrayList<String> tickerList = new ArrayList<>();
        //one way to create arraylist
        List<String> tickerList1 = new ArrayList<>();
        //this is one famous way to create arraylist
        tickerList1.add("MSFT");
        tickerList1.add("AMD");
        tickerList1.add("AAPL");
        tickerList1.add("TSLA");
        System.out.println("item in the list are :"+tickerList1);
        String s = tickerList1.get(0);
        System.out.println("value at the index 1: " +s);
        tickerList1.remove("MSFT");
        System.out.println("item in the list are :"+tickerList1);
        tickerList1.add("MSFT");
        System.out.println("size of the list is: "+tickerList1.size());
        System.out.println("item in the list are :"+tickerList1);
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOGL");
        anotherList.add("AMEX");
        anotherList.add("NFLX");
        System.out.println("item in the list are :"+anotherList);
        anotherList.addFirst("PLTR");
        anotherList.addLast("META");
        System.out.println("item in the list are :"+anotherList);
        boolean amex = tickerList1.contains("AMEX");
        System.out.println(amex);
        boolean amd = tickerList1.equals(tickerList1);
        System.out.println(amd);
        Collections.sort(tickerList1);
        System.out.println("item in the list are :"+tickerList1);
        tickerList1.removeAll(tickerList1);
        System.out.println("item in the list are :"+tickerList1);


        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",35));
        stockList.add(new Stock("3MCARE",37));
        stockList.add(new Stock("NFLX",32,3.0));

        System.out.println(stockList);

        for (int i=0; i<stockList.size(); i++)
        {
            System.out.println(stockList.get(i));
        }

        int i =47; //primitive

        Integer objInt = (Integer) i; //non primitive
        List<Integer> integers = List.of(2,3,4);
        System.out.println(integers);
//        integers.add(5);
//        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>();
        integers1.add(5);
        System.out.println(integers1);

        List<String> s1 = new ArrayList<>();
        s1.add("apple");
        s1.add("banana");
        s1.add("guava");
        s1.add("pear");
        s1.add("sapota");
        System.out.println("items in list: "+s1 );
//        s1.clear();
//        System.out.println("items in list: "+s1 );


    }
}
