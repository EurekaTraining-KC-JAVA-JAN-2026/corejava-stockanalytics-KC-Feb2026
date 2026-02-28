import java.util.*;

public class MapsPlayGround {
    public static void main(String[] args) {
        //map will store key value pairs (we did not specify the size)
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("APPL","Apple Inc");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tesla");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));//value
         //exploring map methods
        String map1 =mapStock.get("AMD");
        System.out.println("value of AMD:"+map1);//value
        System.out.println("size of map:"+mapStock.size());//size

        //containsKey() and containsValue()
        boolean a= mapStock.containsKey("TSLA");//for key
        System.out.println("checking the key TSLA"+a);
        boolean b = mapStock.containsValue("Apple Inc");//for value
        System.out.println("checking the value Apple"+b);

        //removing
        mapStock.remove("MSFT");//giving key here
        System.out.println("printing after removing Msft" +mapStock);
        //addingAll in map,creating new object
        Map<String,String> anotherMap =new HashMap<>();
        anotherMap.put("GOOG","Google");
        anotherMap.put("NVDA","NVIDIA");
        //here keeping all in
        mapStock.putAll(anotherMap);
        System.out.println("After adding all in mapstock"+mapStock);
        //replacing
        mapStock.replace("AMD","AMD1");// replacing only 1 key here
        System.out.println("After replacing AMD"+mapStock);
      //  mapStock.replaceAll("");//we cannot replace like this
        //we need to give (key ,value)-> new value so that it will replace
        mapStock.replaceAll((key,value)->value.toUpperCase());
        System.out.println("printing after replacing all values to uppercase"+mapStock);

        //equals  method
        Map<String,String> map2 = new HashMap<>();
        map2.put("NW","NorthWest");
        map2.put("KS","Kansas");

        Map<String,String> map3 = new HashMap<>();
        map3.put("NW","NorthWest");
        map3.put("KS","Kansas");
        boolean c = map2.equals(map3);
        System.out.println("Equals method checking for map2,3:"+c);
        //it will compare 2 maps not adress so if any value diff it will be false

        System.out.println(mapStock.isEmpty());//it will check weather map is having data or not
         //mapStock.clear();//it will clear all
        //System.out.println("after clearing:"+mapStock);//it will be null
        //System.out.println(mapStock.isEmpty());//to check it is empty or not

        /*
        // for each looping in maps for getting keyset
         */
        System.out.println("printing using for each loop ");
        for(String key1 : mapStock.keySet()){//if we take value here we get null alues
            System.out.println("for each loop :"+key1 +":"+mapStock.get(key1));//here im getting values
        }
        // here key set we are iterating through key value

        System.out.println("printing values using entry set:");
        //this is entry set
        for(Map.Entry<String,String> stockEntry : mapStock.entrySet()){
            System.out.println(stockEntry.getKey() +":"+stockEntry.getValue());
            //here we get key value pairs together  we are giving value also
        }
        //so entry set is faster i think that key set

//to string
        Map<String,Stock> stockMap1 = new HashMap<>();
         Stock apple = new Stock("APPL",1000,2.5,10,100);
         Stock amd1 = new Stock("AMD",2456,2.6,43,145);
         Stock nvdia1 =new Stock("NVDA",2567,3.4,34,256);
         Stock adm1 = new Stock("ADM",6778,3.4,54,30);
        System.out.println(stockMap1);
        System.out.println("printing stockMap from tostring details:"+stockMap1);
         stockMap1.put(apple.getTickerSymbol(),apple);//for keeping in map
        stockMap1.put(amd1.getTickerSymbol(),amd1);
        stockMap1.put(nvdia1.getTickerSymbol(),nvdia1);
        stockMap1.put(adm1.getTickerSymbol(),adm1);
        System.out.println("After adding in map"+stockMap1);

//if i want to get through entry set
        for(Map.Entry<String,Stock>stockEntry: stockMap1.entrySet()){
            System.out.println("entryset:"+stockEntry.getKey() + ":"+stockEntry.getValue());

        }
    //for printing all values
        for(Stock stockname :stockMap1.values()){
            System.out.println(stockname);
        }

        }

        //Assignment-4
        //explore methods in maps whatever we have used in lists
}
