import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String,String> mapStock = new HashMap<>();
        //map stores key and value pairs
        mapStock.put("AAPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("GOOG","Google");
        mapStock.put("TSLA","Tesla");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AAPL"));
        boolean m = mapStock.containsKey("AAPL");
        System.out.println(m);
        boolean hasValue = mapStock.containsValue("Google");
        System.out.println("Map has the value :"+hasValue);
        System.out.println("Size of map: " + mapStock.size());
        mapStock.remove("TSLA");
        System.out.println("After removing Tesla :"+mapStock);
        mapStock.replace("GOOG","Google LLC");
        System.out.println("After replacing :"+mapStock);
        Set<String> keys = mapStock.keySet();
        System.out.println(keys);

        Collection<String> values = mapStock.values();
        System.out.println("Values: " + values);

        System.out.println("EntrySet:");//best for iterating and gets both key and values
        for(Map.Entry<String,String> entry : mapStock.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("KeySet:");//should use it only when we need keys
        for(String key : mapStock.keySet()){
            System.out.println(key);
        }
        System.out.println("Values :");//should use it only when we need values
        for (String value : mapStock.values()){
            System.out.println(value);
        }

        System.out.println("Is map empty: " + mapStock.isEmpty());
        mapStock.clear();
        System.out.println("After clear: " + mapStock);


    }
}
