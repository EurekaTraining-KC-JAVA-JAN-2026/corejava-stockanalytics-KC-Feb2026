import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        //
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advance Micro Devices");
        mapStock.put("APPL", "APPLE Inc.");
        mapStock.put("TSLA", "Tesla");
        mapStock.put("GOOG", "Google");
        System.out.println(mapStock);
        mapStock.get("AMD");
        System.out.println(mapStock.get("AMD"));
        mapStock.containsKey("TSLA");
        System.out.println(mapStock.containsKey("AMD"));

        boolean map= mapStock.equals("AMD");
        System.out.println(map);


    }
}
