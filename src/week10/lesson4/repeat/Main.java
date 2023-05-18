package week10.lesson4.repeat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // [10, 20, 30]
        numbers.remove(0);
        // [20, 30]
        numbers.remove(0);
        // [30]
        numbers.remove(0);
        // []

        System.out.println(numbers);
    }
}
