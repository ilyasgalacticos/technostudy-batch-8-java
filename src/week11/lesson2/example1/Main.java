package week11.lesson2.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();

        map.put("Ilyas", 34);
        map.put("John", 25);
        map.put("Michael", 45);
        map.put("Jack", 55);

        map.put("Ilyas", 20); // will overwrite previous value

        System.out.println(map.get("Ilyas"));
        System.out.println(map.get("Jack"));
        System.out.println(map.get("Samuel"));

    }
}
