package week11.lesson2.example1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        Map<String, String> passports = new HashMap<>();

        passports.put("Ali", "88888888");
        passports.put("Ilyas", "77777777");
        passports.put("Ali", "99999999");
        passports.put("Murat", "22222222");
        passports.put("Hakan", "66666666");
        passports.put("Zhazira", "55555555");
        System.out.println(passports);

        Set<String> keys = passports.keySet(); // this method will return us all keys in map
        System.out.println("My keys will be : " + keys);

        for(String key : keys){
            System.out.println(key + " - " + passports.get(key));
        }

    }
}
