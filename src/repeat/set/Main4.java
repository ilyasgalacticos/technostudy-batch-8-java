package repeat.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(0, "Ilyas");
        names.put(1, "John");
        names.put(2, "Michael");
        names.put(3, "Chris");
        names.put(4, "Hakan");

        for(int i = 0; i < 5; i++){
            System.out.println(names.get(i));
        }

    }
}
