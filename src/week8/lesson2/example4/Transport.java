package week8.lesson2.example4;

public class Transport {

    private String name;
    private int speed;

    public Transport() {
        this.name = "No Name";
        this.speed = 0;
    }

    public Transport(String name, int speed) {
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

    public void move(){
        System.out.println("I am transport " + getName() + " moving with speed " + getSpeed() + " km/h");
    }
}
