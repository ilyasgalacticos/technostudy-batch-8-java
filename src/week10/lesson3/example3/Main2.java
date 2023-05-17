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

    }
}
