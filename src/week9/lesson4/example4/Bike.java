package week9.lesson4.example4;

public class Bike extends Transport {
    private int wheels;

    public Bike() {
        super();
        this.wheels = 2;
    }

    public Bike(String name, int price, int speed, int wheels) {
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
                "Bike " + getName() + " that costs " + getPrice() + " USD "
                        +" with wheels " + getWheels() + " is racing with speed " + getSpeed() + " km/h"
        );
    }

}
