import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args){
        Map<String,String> mapStock = new HashMap<>();
        //Map stores key value pair structure
        mapStock.put("AMD", "Advanced Micro Devices");
        mapStock.put("AAPL", "APPLE INC");
        mapStock.put("MSFT", "Microsoft");
        mapStock.put("TSLA", "Tesla inc");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        //mapStock.

    }
}
