import java.util.*;

public class MapsPlayGround {
    public static void main(String[] args) {
        //map will store key value pairs (we didnot specify the size)
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("APPL","Apple Inc");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tesla");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));

        }
        //Assignment-4
        //explore methods in maps whatever we have used in lists
}
