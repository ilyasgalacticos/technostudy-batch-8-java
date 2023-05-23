package week11.lesson2.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> scorers = new HashMap<>();

        while (scorers.size() < 5) {
            String name = in.next();
            int price = in.nextInt();
            scorers.put(name, price);
        }

        Set<String> uniquePlayers = scorers.keySet();
        for (String player : uniquePlayers) {
            System.out.println(player + " scored " + scorers.get(player) + " goals in EPL");
        }
    }
}
