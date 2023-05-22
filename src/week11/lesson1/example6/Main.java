package week11.lesson1.example6;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Ilyas");
        set.add("Zhazira");
        set.add("Elvira");
        set.add("Hidayet");
        set.add("Elvira");
        set.add("Zhazira");

        System.out.println(set);
    }
}
