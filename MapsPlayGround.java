import java.util.HashMap;
import java.util.Map;

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
    }
}
