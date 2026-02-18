import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList= new ArrayList<>();
        //this is not famous
        //ABOVR IS ONE WAY TO CREATE the arrayList
        List<String> tickersList1= new ArrayList<>();//this is famous
        //another way to create arrayList
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("APPL");
        tickersList1.add("TSLA");
        System.out.println("items in List : "+tickersList1);
        String s =tickersList1.get(1);
        System.out.println("Value at the iondex 1 is : "+s);
        tickersList1.remove("MSFT");
        System.out.println("After removing MSFT : "+tickersList1);
        tickersList1.add("MSFT");
        System.out.println("Size of tickerList1 after adding MSFT : "+tickersList1.size());
        tickersList.add("GOOG");
        tickersList.add("AMEX");
        tickersList1.addAll(tickersList);
        System.out.println("After adding two collections : "+tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");
        System.out.println("After adding first and last postion : "+tickersList1);
        boolean amex=tickersList1.contains("AMEX");
        System.out.println("Does it contains amex : "+amex);
        boolean amd=tickersList1.equals("AMD");
        System.out.println("Does it equals to AMD : "+amd);
        tickersList1.removeAll(tickersList);
        System.out.println("After removing tickerlist : "+tickersList1);
        Collections.sort(tickersList1); //sort is an static method
        System.out.println("After sorting : "+tickersList1);

        /**
         * Now let's create custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock(34,"APPL"));
        stockList.add(new Stock(23,"AMD"));
        stockList.add(new Stock(43,"TSLA"));
        stockList.add(new Stock(34,"3MCARE"));
        stockList.add(new Stock(32,"IYLLY",2.8));

        //System.out.println(stockList);
        for (int i=0;i<stockList.size();i++){
            System.out.println(stockList.get(i));
        }

        for (Stock stock : stockList){
            System.out.println(stock);
        }
        //wrapper class
        Integer objInt=34;//non-primitive
        int i=47;// primitive
        Integer objInt1=(Integer) i;//typecasting
        List<Integer> integers =List.of(2,3,4);
        integers.add(7);
        System.out.println(integers );
    }
}
