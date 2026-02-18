import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args){
        Map<String,String> mapStock= new HashMap<>();
        // map stores key-value pair structure
        mapStock.put("AMD", "Advanced Micro Devices");
        mapStock.put("APPL","apple INC"); //by default indexing, mapstock we give key and value as amd
        mapStock.put("TSLA","Tsla INC");

        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        // assignment to explore all other methods in hash
       //fast insertion we can go for hashmap
        // for searching we can go for array  list




























    }
}
