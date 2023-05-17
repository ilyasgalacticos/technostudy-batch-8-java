package week10.lesson3.example3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("KIA");

        System.out.println(cars);

        ArrayList<String> carsToRemove = new ArrayList<>();
        carsToRemove.add("Chevrolet");
        carsToRemove.add("Volvo");
        carsToRemove.add("Tesla");
        carsToRemove.add("Ferrari");
        carsToRemove.add("KIA");

        cars.removeAll(carsToRemove);
        System.out.println(cars);

        cars.add("KIA");
        System.out.println(cars);
    }
}
