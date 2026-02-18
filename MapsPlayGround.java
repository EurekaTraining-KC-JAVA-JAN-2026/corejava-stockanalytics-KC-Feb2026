import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {

    public static void main(String args[]) {

        //Map is the combination of Key, value pair.
        //For fast insertion we use maps. For fast fetching we use Lists.
        Map<String, String> mapStock = new HashMap<>();

        mapStock.put("AMD", "Advanced Micro Devices");
        mapStock.put("APPL", "Apple INC");
        mapStock.put("MSFT", "Microsoft");
        mapStock.put("TSLA", "Tsla INC");
        System.out.println(mapStock);

        System.out.println(mapStock.get("APPL"));
    }

}
