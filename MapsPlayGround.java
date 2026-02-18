import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String,String> mapStock = new HashMap<>();
        //map stores key-value pair
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("AAPL", "Apple INC");
        mapStock.put("MSFT", "Microsoft");
        mapStock.put("TSLA","Telsa INC");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        mapStock.remove("AAPL");
        System.out.println("The updated list is : " +mapStock);
        Map<String, String> newMap = new HashMap<>();
        newMap.put("NVDA", "Nvidia");
        newMap.put("AMZ", "Amazon");
        newMap.put("JPM", "JPMorgan Chase & Co.");
        //String a = mapStock.get(2); this doesnot work directly with map
        //System.out.println(a); we can achieve it if we map it with numbers
        // newList.put(1,"AMZ")
        //Map has key-value pairs
        // each key should be unique, then it can map using the key
        //if you use get and that key is not present in that particular Hashmap it gives null
        System.out.println(newMap.get("JPM"));
        System.out.println(mapStock.equals(newMap));
        mapStock.putAll(newMap);
        System.out.println("The updated list after adding newMap is : " +mapStock);
        boolean nvda = mapStock.equals(mapStock);
        System.out.println("Do we have NVDA in mapStock? " +nvda);
        Map<Integer, String> diffMap = new HashMap<>();
        diffMap.put(1,"Visa");
        diffMap.put(2,"Pfizer");
        //newMap.putAll(diffMap); this doesnot work because we have integer in diffMap
        //Map doesnot support tradional for loop, we should use for-each

        for (String key : mapStock.keySet()){//this loop gives keys
            System.out.println("Keys in our mapStock are : " +key);
        }
        System.out.println("Let's give values with for-each loop");
        for (String value : mapStock.values()){//this loop gives just values
            System.out.println("Values in our mapStock : " +value);
        }

        for (Map.Entry<String, String> allvalues : mapStock.entrySet()){
            System.out.println("All the the data in our mapStock : " +allvalues);
        }

        mapStock.keySet().removeAll(newMap.keySet());
        System.out.println("Final data in mapStock after removing newMap : " +mapStock);




    }
}
