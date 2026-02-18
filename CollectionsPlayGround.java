import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickerList= new ArrayList<>();
        //this is not Famous way to using this way
        //above is one way to create  the arrayList
        List<String> tickersList1 = new ArrayList<>();
        //another way to create the arraylist  Polymorphism

        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("APPL");
        tickersList1.add("TSLA");
        System.out.println("items in List: "+tickersList1);
        //we are able to print the actual Array because we are overriding the tostring()
        String s= tickersList1.get(1);//Using get we can print particular index value
        System.out.println("value of index 1" +s);
        tickersList1.remove("MSFT");//Using remove we can remove
        System.out.println("Removing the MSFT: " +tickersList1);
        tickersList1.add("MSFT");//List follows -Insertion order it will add at the end of the list
        System.out.println("Size of an tickersList1 after adding MSFT " +tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG"); //adding multiple objects to the list
        anotherList.add("AMEX");

        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection: "+tickersList1);
        tickersList1.addFirst("3MCARE");//it will add at the first of the list
        tickersList1.addLast("IYLLY");//it will add at the last of the list
        System.out.println("After adding addFirst and addLast to the array: "+tickersList1);
        boolean amex = tickersList1.contains("AMEX");//checks weather it was available or not
        boolean amex1 = tickersList1.contains("amex");
        System.out.println("Does tickerList1 contains AMEX: "+amex);
        System.out.println("Does tickerList1 contains amex: "+amex1);
//        anotherList1.add("GOOG");
//        anotherList2.add("AMEX");
//        boolean amd = anotherList.equals(anotherList1);
//        System.out.println("Does tickerList1 equals amd: "+amd);
        tickersList1.removeAll(anotherList);//remove what are there in the list
        System.out.println("Removing all:" +tickersList1);
        Collections.sort(tickersList1);//Sort the list
        System.out.println("After Sorting:" +tickersList1);


        /**
         * Now Let's Create Custom List Object's
         *[Stock{tickerSymbol='APPL', marketCap=0, currentRatio=0.0, sectorId=34, subSectorId=0}
         * , Stock{tickerSymbol='AMD', marketCap=0, currentRatio=0.0, sectorId=40, subSectorId=0}
         * , Stock{tickerSymbol='TSLA', marketCap=0, currentRatio=0.0, sectorId=43, subSectorId=0}
         * , Stock{tickerSymbol='GOOG', marketCap=0, currentRatio=0.0, sectorId=38, subSectorId=0}
         * ] it will give the entire list
         */
        List<Stock>stockList = new ArrayList<>();
        stockList.add(new Stock("APPL",34));
        stockList.add(new Stock("AMD",40));
        stockList.add(new Stock("TSLA", 43));
        stockList.add(new Stock("GOOG",38));
        stockList.add(new Stock("IYLLY",35));
        System.out.println(stockList);

        int i=50;//primitive
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;

        Integer objInt1 =(Integer) i;
        Integer objInt=34;//Non-primitive
        List<Integer> integers1= List.of(2, 3, 4);
        integers1.add(Integer.valueOf(7));
        boolean check = integers1.contains(3);
        System.out.println(check);


    }

}
