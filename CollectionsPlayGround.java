
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickerList = new ArrayList<>();
        //this not a famous wayto use
        // above is one way to create the arrayList
        List<String> tickerList1 = new ArrayList<>();
        //this is the famous way to create.
        // another way of creating an ArrayList
        tickerList1.add("MSFT");
        tickerList1.add("AMD");
        tickerList1.add("AAPL");
        tickerList1.add("TSLA");
        System.out.println("items in list:" +tickerList1);
        String s=  tickerList1.get(1);
        System.out.println("value at the index 1 is : " +s);
        tickerList1.remove("MSFT");
        System.out.println("After removing MsfT:" +tickerList1);
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GooG");
        anotherList.add("AMEX");
        tickerList1.addAll(anotherList);
        System.out.println("After adding another collection:" +tickerList1);
        tickerList1.addFirst( "3MCARE");
        tickerList1.addLast("IYLLY");
        System.out.println("after adding at 1st and Nth pos.:" + tickerList1);
        boolean amex = tickerList1.contains("Amex");
        System.out.println("does tickerlist1 contains AMEX:" +amex);
        List<String> anotherList1 = new ArrayList();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean amd = anotherList.equals(anotherList1);
        System.out.println("does anotherlist equals to anotherlist1:" +amd);
        tickerList1.removeAll(anotherList);
        System.out.println("After removing the anotherLIst :"+tickerList1);
        Collections.sort(tickerList);
        System.out.println("after sorting:"+tickerList1);
        /**
         * Now lets create custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("APPL",34));
        stockList.add(new Stock("AMD",24));
        stockList.add(new Stock("TSLA",34));
        stockList.add(new Stock("BMW", 34));
        stockList.add(new Stock("IYLLY",34));
        //System.out.println(stockList);
        for(int i=0; i < stockList.size(); i++) {
            System.out.println(stockList);
        }

      //wrapper class
        int i =47;//primitive
        Integer objInt1 =(Integer) i; // typical typecasting from integer to int
        Integer objInt = 34;
        List<Integer> integers = List.of(2,4,7);
        int a;
        Integer j;
        boolean l;
        Boolean l1;
        char c;
        Character c1;
        double d1;
        Double d2;
        byte b;
        Byte b1;

        System.out.println(integers);





    }
}
