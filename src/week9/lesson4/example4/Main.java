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

        System.out.println("###################################");

        Transport tr1 = new Transport("Motorbike", 2000, 100);
        Transport tr2 = tr1;

        System.out.println("tr1 - " + tr1);
        System.out.println("tr2 - " + tr2);

        tr1.setName("Super Bike");
        tr1.setSpeed(999);
        tr1.setPrice(88888);

        System.out.println("tr1 - " +tr1);
        System.out.println("tr2 - " +tr2);

        tr2.setName("Truck");
        tr2.setSpeed(100);
        tr2.setPrice(50000);

        System.out.println("tr1 - " +tr1);
        System.out.println("tr2 - " +tr2);

        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        a = 20;

        System.out.println(a);
        System.out.println(b);

        b = 88;

        System.out.println(a);
        System.out.println(b);

    }

}
