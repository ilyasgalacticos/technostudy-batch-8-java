package week11.lesson2.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> scorers = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String player = in.next();
            int goals = in.nextInt();
            scorers.put(player, goals);
        }

        System.out.println(scorers.size());

    }
}
