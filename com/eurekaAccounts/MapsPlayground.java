package com.eurekaAccounts;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapsPlayground {
    public static void main (String[] args){
        Map<String, String> mapStock = new HashMap<>();
        mapStock.put("AMD", "Advance Micro Devices");
        mapStock.put("TSLA", "Tesla");
        mapStock.put("AAPL", "Apple inc");
        System.out.println("Getting initial maps: " +mapStock);


        System.out.println("To get AMD: " +mapStock.get("AMD"));
        System.out.println("To get Size: " +mapStock.size());
        System.out.println("Is Tesla is there or not: " +mapStock.containsKey("TSLA"));
        System.out.println("Is empty: " +mapStock.isEmpty());
        System.out.println("To get all values: " +mapStock.values());
        System.out.println("Remove AAple: " + mapStock.remove("AAPL"));
        System.out.println("After Removing Aaple: " +mapStock);
        System.out.println("Get TSLA: " +mapStock.getOrDefault("TSLA","Not Found"));

        Map<String, String> mapStock1 = new HashMap<>();
        mapStock1.put("Nvda", "Nvidia");
        mapStock1.put("GOOG", "Google");
        System.out.println("Both stoks are equal: " +mapStock.equals(mapStock1));

        mapStock.putAll(mapStock1);
        System.out.println(mapStock);

        mapStock1.putAll(mapStock);
        System.out.println("After merging all: " +mapStock1);

        //iteratin to the array
        System.out.println("Iterating mapstock1");
        for (Map.Entry<String, String> entry : mapStock1.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        mapStock.clear();
        System.out.println("After clearing the mapstock: " +mapStock);

        //like integer mapping

        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("one", 1);
        numberMap.put("Thirty", 30);
        System.out.println("Number Map: " +numberMap);




    }
}
