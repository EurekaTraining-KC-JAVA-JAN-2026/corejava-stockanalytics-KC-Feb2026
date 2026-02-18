import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        //map stores key-value pair
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("AAPL", "Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        mapStock.put("GOOG","Google");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        //Assignment-explore diff methods in maps, similar to lists
        mapStock.get("MSFT"); //returns the value Microsoft
        mapStock.get("NVDA"); //returns null
        mapStock.containsKey("MSFT");
        mapStock.isEmpty()
        //for non-existing keys it returns null value, so we need to add to a newList
        if(mapStock.containsKey("TSLA")){
            System.out.println("Tesla exits"); //checks if key exists
        }
        boolean found = mapStock.containsValue("Google");
        System.out.println(found);

        mapStock.replace("GOOG", "Google INC");

        mapStock.remove("AMD");
        System.out.println("The size of current map is :" + mapStock.size());
        for( String key : mapStock.keySet()){ //using for each to returns only all keys from the map
            System.out.println(key);
        }

        for ( String value : mapStock.values()){ //returns all values iterating each element one by one
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : mapStock.entrySet()){ //returns both key and value pairs of all elements
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
