package week11.lesson1.example3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();

        Car mercedes = new Car("Mercedes", 220, 20000);
        cars.add(mercedes);

        Car ferrari = new Car("Ferrari", 320, 120000);
        cars.add(ferrari);
        System.out.println(cars);

        Car anotherMercedes = new Car("Mercedes", 220, 20000);
        cars.add(anotherMercedes);

        Car superCar = anotherMercedes;
        cars.add(superCar);

        System.out.println(cars);
        superCar.setName("Mercedes Benz");
        System.out.println(cars);

    }
}
