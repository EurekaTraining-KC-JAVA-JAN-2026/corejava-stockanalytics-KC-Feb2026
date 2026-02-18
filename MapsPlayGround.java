import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {


    Map<String,String> mapStock = new HashMap<>();
    mapStock.put("AMD","advanced Micro Devices");
    mapStock.put("APPL","APPL INC");
    mapStock.put("MSFT","Microsoft");
    mapStock.put("TSLA","TESLA INC");
    System.out.println(mapStock);
    System.out.println(mapStock.get("TSLA"));

    //=========Assignment===========
        mapStock.put("3MCARE" ,"3M Health Care");
        System.out.println(mapStock);
        System.out.println(mapStock.containsKey("MSFT"));
        System.out.println(mapStock.containsValue("Microsoft"));
        mapStock.remove("AMD");
        System.out.println(mapStock);
        System.out.println(mapStock.keySet());
        System.out.println(mapStock.hashCode());
        mapStock.replace("APPL","APPL INC", "APPL Updated");
        System.out.println(mapStock);
        System.out.println(mapStock.size());
        System.out.println(mapStock.values());
        mapStock.putIfAbsent("NVDA", "NVIDIA Corporation");
        System.out.println(mapStock);
        System.out.println(mapStock.getOrDefault("IBM","Not Found"));
        mapStock.clear();
        System.out.println(mapStock);
        System.out.println(mapStock.isEmpty());


    }

}
