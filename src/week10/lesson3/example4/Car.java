package week10.lesson3.example4;

public class Car {

    private String name;
    private int speed;
    private double engineVolume;

    public Car(){

    }

    public Car(String name, int speed, double engineVolume) {
        this.name = name;
        this.speed = speed;
        this.engineVolume = engineVolume;
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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void move(){
        System.out.println(
                "I am car "
                + this.name + " "
                + this.speed + " km/h "
                + this.engineVolume + " liters engine is moving"
        );
    }
}
