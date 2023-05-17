package week10.lesson3.example3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(99);

        System.out.println("I have " + numbers.size() + " elements in list");
        System.out.println(numbers);

        numbers.remove(2); // this method removes element from list at index 2

        System.out.println("I have " + numbers.size() + " elements in list");
        System.out.println(numbers);
    }
}
