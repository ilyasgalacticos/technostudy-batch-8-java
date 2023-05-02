package week8.lesson2.example4;

public class Main {
    public static void main(String[] args) {

        Transport tr = new Transport();
        tr.setName("Some Transport");
        tr.setSpeed(10);

        Car c1 = new Car();
        c1.setName("Audi");
        c1.setSpeed(90);
        c1.setEngineVolume(2.4);

        Car c2 = new Car();
        c2.setName("Mercedes");
        c2.setSpeed(100);
        c2.setEngineVolume(3.8);

        Bicycle b1 = new Bicycle();
        b1.setName("BMX");
        b1.setSpeed(25);
        b1.setWheels(2);

        Bicycle b2 = new Bicycle();
        b2.setWheels(3);
        b2.setName("Chico Kids");
        b2.setSpeed(5);

        Transport[] transports = {b1, b2, c1, c2, tr};

        for (int i = 0; i < transports.length; i++) {
            transports[i].move();
        }

    }
}
