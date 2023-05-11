package week9.lesson4.example5;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Mercedes");
        car.setPrice(20000);
        car.setEngineVolume(2.8);
        car.setSpeed(220);

        Bicycle bicycle = new Bicycle();
        bicycle.setName("Pegasus");
        bicycle.setWheels(2);
        bicycle.setPrice(4000);
        bicycle.setSpeed(60);

        Transport transport = new Transport() {
            @Override
            public void move() {
                System.out.println("I am anonymous transport which is moving!");
            }
        };

        Transport[] transports = {bicycle, car, transport};
        for(int i = 0; i < transports.length; i++){
            transports[i].move();
        }
    }
}
