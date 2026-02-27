import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        List<String> tickersList1 = new ArrayList<>();
        // this is famous way
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("AAPL");
        tickersList1.add("TSLA");
        System.out.println("items in List "+ tickersList1);
        String s = tickersList1.get(2);
        System.out.println("The item at index 2 "+ s);
        tickersList1.remove("MSFT");
        System.out.println(tickersList1);
        tickersList1.add("MSFT");
        System.out.println("Size of tickerslist1 after adding new string " + tickersList1.size());
        // follows insertion order
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMD");
        tickersList1.addAll(anotherList);
        System.out.println("Adding another List to tickersList " + tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");
        System.out.println(tickersList1);
        tickersList1.contains("AMEX");
        System.out.println(tickersList1.contains("AMEX"));
        List<String> anotherList1 = new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMD");
        System.out.println("Does tickerslist equals to AMD " + anotherList.equals(anotherList1));
        anotherList1.removeAll(anotherList1);
        System.out.println(tickersList1);
        Collections.sort(tickersList1);
        System.out.println(tickersList1);


        List<Stock> stockList= new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",45));
        stockList.add(new Stock("3MCARE",24));
        stockList.add(new Stock("GOOG",45));
        stockList.add(new Stock("IYLLY",45,2.8));
        for(int i = 0;i< stockList.size();i++)
        {
            //System.out.println(stockList.get(i));
        }
        for (Stock stock : stockList) {
            //System.out.println(stock);
        }
        //System.out.println(stockList);
        // wrapper class
        List<Integer> integers= List.of(2,3,4); // immutable list
        Integer objInt = 34; // non primitive
        int i = 45;
        Integer objInt1 = (Integer) i; // typical forecasting from Integer to int
        //integers.add(5); -- will throw an error
        //boolean add = integers.add(7);
        //System.out.println(add);
        boolean k;
        Boolean k1;
        char c;
        Character c2;
        double d;
        Double d2;
        byte b;
        Byte b1;
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(integers1.contains(43));







    }
}
