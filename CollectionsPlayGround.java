import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        // one way to create arraylist
        ArrayList<String> tickersList = new ArrayList<>();
        // another way of creating array list
        // this is famous way of creating arraylist
        //its list interface ,we directly call arraylist

        List<String> tickersList1 = new ArrayList<>();
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("TSLA");
        tickersList1.add("APPL");
        System.out.println("Items in the list is :"+tickersList1);
        //in abstarct collections they have there own tostring () method so that we r getting output in []
        //tickersList1.get(1);
        String s = tickersList1.get(1);
        System.out.println("value at index 1 is :"+s);
        tickersList1.remove("MSFT");
        System.out.println("removing msft"+tickersList1);
        tickersList1.add("MSFT");//ticker folows list
        System.out.println(tickersList1);
        System.out.println("size of tickerList1 after adding msft: "+tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        //adding
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection:" +tickersList1);
        tickersList1.add(0,"3MCare");
        tickersList1.addFirst("NVDIA");

        boolean amex = tickersList1.contains("amex");
        System.out.println("does tickerList1 contains Amex:"+amex);
        List<String> anotherList1 = new ArrayList<>();
        //adding into list
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean and = anotherList.equals(anotherList1);
        System.out.println("Does tickersList equal to AMD"+and);

        tickersList1.removeAll(anotherList);//removing all
        System.out.println("After removing another list"+tickersList1);
        // need to explore  the list
        Collections.sort(tickersList1);//sort is an static method
        System.out.println("After Sorting :"+tickersList1);

        /**
         * now lets create custom list objects
         *
         */
        // with tostring method
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("APPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("ADM",22));
        stockList.add(new Stock("NVDIA",43));
        System.out.println("printing stocklist:" +stockList);
        //we will get the output from the toString method in Stock class
        System.out.println();
        for(int i =0;i < stockList.size();i++){
            System.out.println(i);
        }
        //for each
        for(Stock stock : stockList){
            System.out.println(stock);
        }



        //wrapper class(internally type casting)
            int i =47;//primitive
        Integer objInt1 = (Integer) i;
        Integer objInt = 34;//non primitive
            List<Integer>integers = List.of(2,3,4);// immutable we cannot chamge if we have list.of

            int k ;
            Integer j;// non prem
            Boolean k1;
            char c;//prim
         //   character c1;
            double d1;
            byte b;
          //  Byte b;
        List<Integer> integers1 = new ArrayList<>();
        boolean contains = integers1.contains(43);
        System.out.println(contains);
            integers.add(7);
        System.out.println(integers);



    }
}
