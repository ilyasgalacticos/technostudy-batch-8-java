package week11.lesson1.example1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(50);
        set.add(10);
        System.out.println(set);

        for(Integer elem : set){
            System.out.println(elem);
        }
    }
}
