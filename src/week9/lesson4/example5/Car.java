package week9.lesson4.example5;

public class Car extends Transport{

    private double engineVolume;

    public Car() {
        super();
    }

    public Car(String name, int price, int speed, double engineVolume) {
        super(name, price, speed);
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void move() {
        System.out.println(
                "Car "
                + getName() + " that costs " + getPrice()
                + " USD with engine volume " + getEngineVolume() + " liters "
                + " is riding with speed " + getSpeed() + " km/h"
        );
    }
}
