import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args){
        Map<String,String> mapStock= new HashMap<>();
        // map stores key-value pair structure
        mapStock.put("AMD", "Advanced Micro Devices");// put is like adding data
        mapStock.put("APPL","apple INC"); //by default indexing, mapstock we give key and value as amd, and it is used for fast insertion
        mapStock.put("TSLA","Tsla INC");


        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        // assignment to explore all other methods in hash
       //fast insertion we can go for hashmap
        // for searching we can go for  list

        //exploring different methods like ArrayList in HashMap

       boolean hasApple= mapStock.containsKey("APPL");
       System.out.println("is apple in the Map?:" +hasApple);  //checks if appl is present in the mapstock
        mapStock.remove("TSLA");   // trying remove method


       System.out.println(" all the stock tickers:" + mapStock.keySet()); //giving us all the list of symbols

      mapStock.putIfAbsent("AMD","Advanced micro Devices");
      System.out.println("After putIfAbsent:" + mapStock.get("AMD")); // it will only add entry if that key doesnt exist.if amd is there it wont overwrite it



        //creating another hashMap
        Map<String,Integer> contactList= new HashMap<>();

        System.out.println("Is my contacts list empty?"  + contactList.isEmpty());

        contactList.put("Harsh",1234);
        System.out.println(contactList.isEmpty());
        System.out.println("no of contacts:"  + contactList.size());

        for(String key: contactList.keySet()){ //using for, im checking for only key values in the map
            System.out.println(key);
        }

        Map<String,Integer> grades= new HashMap<>();
        grades.put("Harshu",80);
        int cscore =95;
        Integer harshu = grades.replace("Harshu", cscore);
      System.out.println("the new score is:" + harshu);

    }
}




