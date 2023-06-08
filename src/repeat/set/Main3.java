package repeat.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        // Maps are used when your index is not integer starting from 0
        ArrayList<String> names = new ArrayList<>();
        names.add("Ilyas");
        names.add("John");
        names.add("Jack");
        names.add("Sergio");

        names.set(0, "Hasan");
        System.out.println(names.get(0));


        Map<String, String> users = new HashMap<>();
        users.put("010045789213", "Ilyas Zhuanyshev");
        users.put("010045789211", "Ilyas Gonzales");
        users.put("010045789212", "Ilyas Gonzales");
        users.put("010045789217", "Ilyas Gonzales");
        users.put("010045789214", "Segio Zhuanyshev");
        users.put("010045789211", "Michael Corvin"); // Underworld

        System.out.println(users.get("010045789211"));
        System.out.println(users);

    }
}
