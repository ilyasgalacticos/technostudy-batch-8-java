package week11.lesson2.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, String> fullNames = new HashMap<>();
        fullNames.put("Alvarez", "Sergio");
        fullNames.put("Messi", "Leo");
        fullNames.put("Ronaldo", "Cristiano");
        fullNames.put("Ozil", "Ronaldo");
        fullNames.put("Kroos", "Ronaldo");
        fullNames.put("Ronaldo", "Luis Nazario");

        for(Map.Entry<String, String> pair : fullNames.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

        System.out.println("##################");

        Set<String> keys = fullNames.keySet();
        for(String key : keys){
            System.out.println(key + " - " + fullNames.get(key));
        }

    }
}
