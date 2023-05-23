package week11.lesson2.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        Map<String, Integer> cars = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String name = in.next();
            int price = in.nextInt();
            cars.put(name, price);
        }

        Set<String> keys = cars.keySet();

        for(String key : keys){
            System.out.println(key + " costs " + cars.get(key) + " USD");
        }
    }
}
