import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("AMD", "Advanced micro devices");
        map1.put("BMW", "BMW");
        map1.put("GGL", "google");
        map1.put("APPL", "Apple ");
        map1.put("ZMC", "Zoom Corporation");
        System.out.println(map1);
        String x = map1.get("AMD");
        System.out.println(x);


    }
}
