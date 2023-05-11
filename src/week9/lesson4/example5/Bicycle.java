package week9.lesson4.example5;

public class Bicycle extends Transport{

    private int wheels;

    public Bicycle() {
        this.wheels = 2;
    }

    public Bicycle(String name, int price, int speed, int wheels) {
        super(name, price, speed);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void move() {
        System.out.println(
                        getName()
                        + " " + getPrice()
                        + " USD with "
                        + getWheels() + " wheels"
                        + " is racing with speed " + getSpeed() + " km/h"
        );
    }
}
