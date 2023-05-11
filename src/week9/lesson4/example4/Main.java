package week9.lesson4.example4;

public class Main {
    public static void main(String[] args) {

        Transport transport = new Transport();
        transport.setName("Bus");
        transport.setPrice(40000);
        transport.setSpeed(180);

        Car car = new Car();
        car.setName("Jeep");
        car.setPrice(10000);
        car.setSpeed(220);
        car.setEngineVolume(2.8);

        transport.move();
        car.move();

    }

}
