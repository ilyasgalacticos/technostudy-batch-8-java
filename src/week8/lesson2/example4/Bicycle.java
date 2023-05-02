package week8.lesson2.example4;

public class Bicycle extends Transport {

    private int wheels;

    public Bicycle() {
        setName("No Name");
        setSpeed(0);
        this.wheels = 2;
    }

    public Bicycle(String name, int speed, int wheels) {
        setName(name);
        setSpeed(speed);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void move() {
        System.out.println("I am bicycle " + getName() + " with " + getWheels() + " wheels "
                + "moving with speed " + getSpeed() + " km/h "
        );
    }
}
