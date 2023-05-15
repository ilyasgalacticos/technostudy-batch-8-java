package week10.lesson1.example5;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Mercedes");
        car.setSpeed(220);
        car.ride();

        Car toyota = null; // not initialized, empty
        System.out.println(toyota.getName());

    }
}
