package week10.lesson1.example5;

public class Car {

    private String name;
    private int speed;

    public Car(){
        this.name = "No name";
        this.speed = 0;
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void ride(){
        System.out.println("Car " + getName() + " is riding with speed " + getSpeed() + " km/h");
    }
}
