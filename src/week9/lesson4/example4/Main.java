package week9.lesson4.example4;

public class Main {
    public static void main(String[] args) {

        Transport transport = new Transport();
        transport.setName("Bus");
        transport.setPrice(40000);
        transport.setSpeed(180);

        System.out.println(transport);

        Car car = new Car();
        car.setName("Jeep");
        car.setPrice(10000);
        car.setSpeed(220);
        car.setEngineVolume(2.8);

        Bike bike = new Bike();
        bike.setName("Ghost");
        bike.setPrice(1000);
        bike.setSpeed(30);
        bike.setWheels(2);

        Bike smallBike = new Bike();
        smallBike.setName("Chicco");
        smallBike.setPrice(300);
        smallBike.setSpeed(5);
        smallBike.setWheels(3);

        Transport[] allTransports = {transport, car, bike, smallBike};

        for (int i = 0; i < allTransports.length; i++) {
            allTransports[i].move();
        }

    }

}
