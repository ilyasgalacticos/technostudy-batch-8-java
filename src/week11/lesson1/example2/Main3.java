package week11.lesson1.example2;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("Burak"));
        System.out.println(set.add("Kenan"));
        System.out.println(set.add("Eray"));
        System.out.println(set.add("Zhazira"));
        System.out.println(set.add("Hidayet"));

        System.out.println(set);
        System.out.println(set.remove("Kenan"));
        System.out.println(set);

        System.out.println(set.remove("Ilyas"));
        System.out.println(set);

    }
}
