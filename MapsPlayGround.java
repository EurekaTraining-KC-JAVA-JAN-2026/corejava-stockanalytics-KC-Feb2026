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
        mapStock.get("AMD");
        System.out.println(mapStock.get("AMD"));
        mapStock.put("JMP", "JP Morgan Chase");
        System.out.println(mapStock);
        mapStock.size();
        System.out.println(mapStock.size());
        mapStock.remove("AMD");
        System.out.println(mapStock);
        Map<String,String> mapStock1= new HashMap<>();
        mapStock.put("TCS","Tata consulating Service");
        mapStock.put("RACE", "Ferrari N.V");
        mapStock.putAll(mapStock1);
        System.out.println(mapStock);
        mapStock1.clear();
        System.out.println(mapStock1);
        System.out.println(mapStock);
        boolean maps= mapStock.isEmpty();
        System.out.println(maps);
        mapStock.computeIfAbsent("PPL", key-> "PEOPLE");
        System.out.println(mapStock.get("PPL"));



    }
}
