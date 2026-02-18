import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapsPlayGround {
    static void main(String[] args) {
        Map<String,String> mapStock = new HashMap<>();
        //map stores key-value pair
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("APPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tesla INC");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));


        mapStock.remove("TSLA");
        System.out.println("After removing Tesla Stock :"+mapStock);


        boolean hashValue = mapStock.containsValue("Microsoft");
        System.out.println("Map has the value :"+hashValue);
        System.out.println("Size of map: " + mapStock.size());

        boolean n = mapStock.containsKey("TSLA");
        System.out.println(n);


        mapStock.replace("APPL","Apple INC");
        System.out.println("After replacing :"+mapStock);



        Collection<String> actualvalues = mapStock.values();
        System.out.println("actualValues: " + actualvalues);



        System.out.println("actualValues :");
        for (String value : mapStock.values()){
            System.out.println(actualvalues);
        }

        System.out.println("Is map empty: " + mapStock.isEmpty());
        mapStock.clear();
        System.out.println("After clear: " + mapStock);


    }
}
