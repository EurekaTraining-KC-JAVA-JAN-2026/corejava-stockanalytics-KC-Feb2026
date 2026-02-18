import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        List<String> tickersList1 = new ArrayList<>();
        //this is the famous way to create
        //another way of creating ArrayList
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("AAPL");
        tickersList1.add("TSLA");
        System.out.println("Items in List :" +tickersList1);
        String s = tickersList1.get(1);
        System.out.println("Value at the index 1 is :"+s);
        tickersList1.remove("MSFT");// it means List Follows Insertion order
        System.out.println("After removing MSFT:"+tickersList1);
        tickersList1.add("MSFT");
        System.out.println("size if tickersList1 after adding MSFT:"+tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection:"+tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");
        System.out.println("After adding 1st and nth position:"+tickersList1);
        boolean amex = tickersList1.contains("amex");
        System.out.println("Does tickersymbol1 contains AMEX:"+amex);
        boolean amd = tickersList1.equals("AMD");
        System.out.println("Does tickerssymbol1 contains:"+amd);

        List<String> anotherList1 = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        boolean amd1 = anotherList.equals(anotherList1);
        System.out.println("Does anotherList equals to anotherList1:"+amd1);
        tickersList1.removeAll(anotherList);
        System.out.println("After removing anotherList"+anotherList1);
        Collections.sort(tickersList1);//sort in static method
        System.out.println("After sorting:"+tickersList1);

        //Now lets create custom list objects

        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
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

        // wrapper classes
        List<Integer> integers = List.of(2, 3, 4);
        int i;
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;
        System.out.println(integers);


    }
}
