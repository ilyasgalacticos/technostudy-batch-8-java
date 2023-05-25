package week11.repeat.example2;

import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

        Map<String, Integer> exams = new HashMap<>();

        exams.put("ilyas", 80);
        exams.put("cankut", 85);
        exams.put("zhazira", 88);
        exams.put("ali", 89);
        exams.put("john", 75);

        System.out.println(exams);
        System.out.println(exams.get("ali"));
        System.out.println(exams.get("ilyas"));
        System.out.println(exams.get("sarah"));

    }
}
