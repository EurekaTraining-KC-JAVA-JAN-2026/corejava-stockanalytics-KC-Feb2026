import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// in the collection by default they actually have their own toString methods for ArrayList
public class CollectionsPlayGround {
    static void main(String[] args) {
        ArrayList<String> tickersList =new ArrayList<>();
        // above is the one way to create the arrayList
        List<String> tickerList1= new ArrayList<>();
        // this is the famous way to create
        // another way of creating an ArrayList
        tickerList1.add("MSFT");
        tickerList1.add("AMD");
        tickerList1.add("AAPL");
        tickerList1.add("TSLA");
        System.out.println("items in List:" +tickerList1);

        // ---> error   String s = tickersList.get(1);

        tickerList1.remove("MSFT");

        tickerList1.add("MSFT");

        System.out.println(tickerList1);
        System.out.println("size:"+tickerList1.size());

        List<String> anotherList =new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerList1.addAll(anotherList);
        System.out.println("after adding another collection:"+tickerList1);
        tickerList1.addFirst("3GFF");
        tickerList1.addLast("ITDH");
        System.out.println("after adding first and last pos:"+tickerList1);
        boolean amex =tickersList.contains("amex");
        System.out.println("does tickerlist contains amex:"+amex);

        List<String> anotherList1= new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean amd= anotherList1.equals(anotherList);
        System.out.println("does tickerlist1 equals to anotherlist"+amd);

        tickerList1.removeAll(anotherList);
        System.out.println("after removing the anotherList:"+tickerList1);
        Collections.sort(tickerList1); //sort in an static method
        System.out.println("After sorting:"+tickerList1);


    // lets create withn custom list object
        List<Stock>stockList =new ArrayList<>();
        stockList.add(new Stock("AAPL",33));
        stockList.add(new Stock("AMD",56));
        stockList.add(new Stock("NVDA",57));
        stockList.add(new Stock("TSLA",78));
        stockList.add(new Stock("IYTTY",22));
        System.out.println(stockList);

        for(int i=0;i< stockList.size();i++){
            System.out.println(i);
        }
        //need shortcut
        for(Stock stock:stockList){
            System.out.println(stock);
        }

        // wrapper class
        //-----------------------------------------type casting--------------------------
        int i=47;  //primitive
        Integer objInt1=(Integer)i;  // typical typecasting from Integer to Int
        Integer objInt=34;  //non-primitive

        List<Integer> integers =List.of(2,3,4);  //this will not allow change as listof create immutable

        int j;
        Integer k;
        boolean l;
        Boolean m;
        char n;
        Character o;
        double p;
        Double s;
        byte q;
        Byte r;
        System.out.println(integers);


    }
}
