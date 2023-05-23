package week11.lesson2.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (!map.containsKey(letter)) {
                map.put(letter, 0);
            } else {
                map.put(letter, map.get(letter) + 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println("'" + key + "' occurs " + map.get(key) + " times");
        }

    }
}
