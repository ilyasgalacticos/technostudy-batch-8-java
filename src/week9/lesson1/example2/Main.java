package week9.lesson1.example2;

public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.setPower(40);
        toyota.setEngineCylinders(6);

        Tesla tesla = new Tesla();
        tesla.setCurrency(2);
        tesla.setVoltage(110);

        System.out.println(toyota.getDistance(2));
        System.out.println(tesla.getDistance(2));

        Car car = new Car() {
            @Override
            public int getSpeed() {
                return 200;
            }
        };
        System.out.println(car.getDistance(2));

        Car[] cars = new Car[3];
        cars[0] = toyota;
        cars[1] = tesla;
        cars[2] = car;

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getSpeed());
        }

    }
}
