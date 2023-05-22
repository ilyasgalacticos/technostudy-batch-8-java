package week11.lesson1.example2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean resultOfAddingFirstElement = set.add("Toyota");
        System.out.println(resultOfAddingFirstElement);
        boolean resultOfAddingSecondElement = set.add("Mercedes");
        System.out.println(resultOfAddingSecondElement);

        System.out.println(set);
    }
}
