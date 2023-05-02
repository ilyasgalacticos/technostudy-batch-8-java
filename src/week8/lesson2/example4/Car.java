package week8.lesson2.example4;

public class Car extends Transport {

    public Car(String name, int speed, double engineVolume){
        setName(name);
        setSpeed(speed);
        this.engineVolume = engineVolume;
    }

    public Car(){
        setName("No Name");
        setSpeed(0);
        this.engineVolume = 0;
    }
    private double engineVolume;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void move(){
        System.out.println("I am a car " + getName()
                + " with engine volume " + getEngineVolume() + " liters"
                + " riding with speed "
                + getSpeed() + " km/h ");
    }
}
