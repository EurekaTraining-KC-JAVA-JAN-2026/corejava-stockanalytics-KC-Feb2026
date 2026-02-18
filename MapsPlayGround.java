import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String ,String> mapStock=new HashMap<>();
        mapStock.put("AMD","Advanced Micro services");
        mapStock.put("GOOG","Google");
        mapStock.put("MSFT","Microsoft");
        System.out.println(" Stock with tickerSymbol and tickerName :" +mapStock);
        System.out.println("Finding value of the specific key :" +mapStock.get("AMD"));
        System.out.println( "Checking amd is in the stock are not :"+mapStock.containsKey("AMD"));
        System.out.println( mapStock.get("AMD"));
        System.out.println(mapStock.get("APPL"));
        mapStock.remove("AMD");
        System.out.println( "stock after remove operation:"+mapStock);
        System.out.println("Is stock empty :" +mapStock.isEmpty());
        System.out.println(mapStock.keySet());
        Map<String,String> mapStock2= new HashMap<>();
        mapStock2.put("AMD","Advanced Micro Services");
        mapStock2.put("GOOG","GOOGLE");

        System.out.println(mapStock2);
        mapStock2.replace("AMD","AMC");
        System.out.println(mapStock2);
        //to get both key ,value pairs we use entryset
        boolean val=mapStock.entrySet().containsAll(mapStock2.entrySet());
        System.out.println("checking whether stock contains stock2 :" +val);
        System.out.println(mapStock2.equals(mapStock));


        Map<String,Stock> newStock=new HashMap<>();
        newStock.put("AAPL",new Stock(0.25,50,67));
        newStock.put("GOOG",new Stock(0.56,25,45));
        newStock.put("MFSL",new Stock(0.29,44,12));
        newStock.put("AAPL",new Stock(0.34,53,11));
        System.out.println("The stock with key as tickerSysmbol:" +newStock);
        System.out.println("Values of each key"+newStock.values());

        for(String key: newStock.keySet()){
            System.out.println(newStock.get(key));
        }











    }
}
