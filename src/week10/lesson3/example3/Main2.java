package week10.lesson3.example3;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Istanbul");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Rio");
        cities.add("Kyiv");
        cities.add("Madrid");

        System.out.println(cities);
        cities.remove("Rio");

        System.out.println(cities);

        cities.remove("Almaty");
        System.out.println(cities);

        cities.add("Almaty");
        System.out.println(cities);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        Integer elem = 20;
        numbers.remove(elem);

        System.out.println(numbers);

    }
}
