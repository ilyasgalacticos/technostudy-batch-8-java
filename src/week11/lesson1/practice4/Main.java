package week11.lesson1.practice4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            String name = in.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            set.add(name);
        }

        int sum = 0;
        for(String e : set){
            sum = sum + e.length();
        }
        System.out.println(sum);
    }
}
