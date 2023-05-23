package week11.lesson2.example1;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("ilyas", 34);
        ages.put("murat", 24);
        ages.put("cankut", 38);
        ages.put("elvira", 18);
        ages.put("ozgur", 28);
        ages.put("ilyas", 28);

        System.out.println(ages);

        Set<String> keys = ages.keySet();
        System.out.println(keys);

        Collection<Integer> values = ages.values();
        System.out.println(values);

    }
}
