package week10.lesson3.example1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ilyas"); // length of array list will be 1
        names.add("John"); // length of array list will be 2
        names.add("Mark"); // length of array list will be 3
        // String[] names = {"Ilyas", "John", "Mark"};

        System.out.println(names.get(1)); // John, names.get(1) => names[1]
        System.out.println(names.get(0));
        System.out.println(names.size()); // names.size() => names.length

    }
}
