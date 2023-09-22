package listsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExemple {
    public static void main(String[] args) {
        Map<Integer,String> productsMap = new HashMap<>();
        productsMap.put(1000,"Notebook");
        productsMap.put(2000,"Phone");
        productsMap.put(3000,"Keyboard");
       // productsMap.put(3000,"sjnc");
       // productsMap.put(4000,null);
        System.out.println(productsMap);

        System.out.println(productsMap.get(1000));
        productsMap.remove(2000);
        System.out.println(productsMap);

        productsMap.putIfAbsent(4000,"mouse");
        System.out.println(productsMap);

        System.out.println(productsMap.containsKey(4000));
        //Set<Integer> productCodes = productsMap.keySet();

//        for (Integer productCode : productsMap.keySet() ){
//            System.out.println(productsMap.get(productCode));
//        }
        for (String productName : productsMap.values()){
            System.out.println(productName);
        }
        for (Map.Entry<Integer,String> entry: productsMap.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        Map<String,Set<String>> synonyms = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        set1.add("mirobolant");
        Set<String > set2 = new HashSet<>();
        set2.add("perspicace");
        set2.add("iute");
        Set<String> set3 = new HashSet<>();
        set3.add("facil");
        set3.add("usor");

        synonyms.put("fantastic",set1);
        synonyms.put("rapid",set2);
        synonyms.put("simplu",set3);

        System.out.println(synonyms);

        String newString = "dezastruos";
        //String newKey = "urat";
       // set1.add("miraculos");
        System.out.println(synonyms);

        addToMap("urat","dezastruos",synonyms);
        System.out.println(synonyms);

        addToMap("fantastic","miraculos",synonyms);
        System.out.println(synonyms);
        //synonyms.putIfAbsent("mirobolant",set1);
    }
    public static void addToMap(String key, String newValue, Map<String,Set<String>> synonims){
        if (!synonims.containsKey(key)){
            Set<String> valueSet = new HashSet<>();
            valueSet.add(newValue);
            synonims.put(key,valueSet);
        }else {
            synonims.get(key).add(newValue);
        }
    }
}
