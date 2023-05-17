package week10.lesson3.example4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        Car mercedes = new Car("Mercedes", 220, 2.8);
        cars.add(mercedes);
        cars.add(new Car("Toyota", 210, 1.8));
        cars.add(new Car("BMW", 240, 3.4));

        for(Car c : cars){
            c.move();
        }

    }

}
