import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {

        int i;
        Integer j;
        boolean k;
        Boolean k1;
        ArrayList<String> tickerList = new ArrayList<>();
        //this is not famous
        //above is one way to create the arrayList
        List<String> tickerslist1 = new ArrayList<>();
        //this is the famous way to do it
        //anotherway to creating an arraylist
        tickerslist1.add("MSFT");
        tickerslist1.add("AMD");
        tickerslist1.add("AAPL");
        tickerslist1.add("TSLA");
        System.out.println("Items in list :"+tickerslist1);
        String s = tickerslist1.get(1);
        System.out.println("Value at index 1 is :"+s);
        tickerslist1.remove("MSFT");
        System.out.println("After removing MSFT :"+tickerslist1);
        tickerslist1.add("MSFT");//it means list follows insertion order
        System.out.println("Items in list :"+tickerslist1);
        System.out.println("Size of list :"+tickerslist1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerslist1.addAll(anotherList);
        System.out.println("After adding another list to the existing list :"+tickerslist1);
//        tickerslist1.addFirst("3MCARE");
//        tickerslist1.addLast("IYLLY");
        boolean amex = tickerslist1.contains("AMEX");
        List<String> anotherList1 = new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        System.out.println("Does tickerList1 contains AMEX"+amex);
        boolean amd = anotherList.equals(anotherList1);
        System.out.println("Does anotherList equals to AMD: "+amd);
        tickerslist1.removeAll(anotherList);
        System.out.println("After removing the anotherList :"+ tickerslist1);
        Collections.sort(tickerslist1);//sort is an static method
        System.out.println("After sorting :"+tickerslist1);
        /**
         * now lets create a list objects
         */

        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("3MCARE",34,2.8));
        //System.out.println(stockList);
        for (int m = 0; m < stockList.size(); m++) {
            System.out.println(stockList.get(m));
        }
        for (Stock stock : stockList) {
            System.out.println(stock);
        }

        //wrapper classes
        //int i = 47;//primitive
        Integer objint1 = 34;//Non-Primitive
        //Integer objint =(Integer)i;
        List<Integer>integers = List.of(2,3,4);
//        boolean add = integers.add(34);
//        System.out.println(add);
        System.out.println(integers);
        List<Integer> integers1 = new ArrayList<>();
        boolean add = integers1.contains(43);
        System.out.println(add);



    }
}
